package board.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import board.model.vo.AscBoardDate;
import board.model.vo.AscBoardNo;
import board.model.vo.AscBoardTitle;
import board.model.vo.Board;
import board.model.vo.DescBoardDate;
import board.model.vo.DescBoardNo;
import board.model.vo.DescBoardTitle;

public class BoardManager {
	public static int index = 0;
	ArrayList<Board> list = new ArrayList<Board>();
	Scanner sc = new Scanner(System.in);
	Board bd = new Board();

	public BoardManager() {
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("board_list.dat"))) {
			while (true) {
				try {
					list.add((Board) objIn.readObject());
				} catch (EOFException e) {
					// 파일 끝에 도달했을 때 루프를 종료
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void writeBoard() {
		int num = 0;
		System.out.println("새 게시글 쓰기 입니다.");
		System.out.print("글제목 : ");
		String title = sc.nextLine();
		System.out.print("작성자 : ");
		String writer = sc.next();
		Date now = new GregorianCalendar().getTime();
		StringBuilder boardContentSB = new StringBuilder();
		String str = null;
		System.out.print("글내용 : ");
		sc.nextLine();
		while (!(str = sc.nextLine()).equals("exit")) {
			boardContentSB.append(str);
		}
		String boardContent = boardContentSB.toString();
		if (list.size() != 0) {
			num = list.get(list.size() - 1).getBoardNo() + 1;
		}
		list.add(new Board(num, title, writer, now, boardContent, 0));
	}

	public void displayAllList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public void displayBoard() {
		System.out.print("조회할 글번호 : ");
		int index = sc.nextInt();
		Board[] bdArray = new Board[list.toArray().length];
		Object[] objArray = list.toArray();

		bdArray[index] = (Board) (objArray[index]);
		bdArray[index].setReadCount(bdArray[index].getReadCount() + 1);
		list.set(index, bdArray[index]);
		System.out.println(list.get(index));

	}

	public void modifyTitle() {
		System.out.print("수정할 글 번호 : ");
		int index = sc.nextInt();
		System.out.println(list.get(index));
		Board[] bdArray = new Board[list.toArray().length];
		Object[] objArray = list.toArray();

		bdArray[index] = (Board) (objArray[index]);
		System.out.print("변경할 제목 : ");
		sc.nextLine();
		bdArray[index].setBoardTitle(sc.nextLine());
		list.set(index, bdArray[index]);
	}

	public void modifyContent() {
		System.out.print("수정할 글 번호 : ");
		int index = sc.nextInt();
		System.out.println(list.get(index));
		Board[] bdArray = new Board[list.toArray().length];
		Object[] objArray = list.toArray();

		bdArray[index] = (Board) (objArray[index]);
		System.out.print("변경할 내용 : ");
		sc.nextLine();
		bdArray[index].setBoardContent(sc.nextLine());
		list.set(index, bdArray[index]);
	}

	public void deleteBoard() {
		System.out.print("삭제할 글 번호 : ");
		int index = sc.nextInt();
		System.out.println(list.get(index));
		System.out.print("정말로 삭제하시겠습니까 ? (y/n) : ");
		char ans = sc.next().toUpperCase().charAt(0);
		if (ans == 'Y') {
			list.remove(index);
			System.out.println(index + "번 글이 삭제되었습니다.");
			if (index < list.size()) {
				while (index != list.size()) {
					list.get(index).setBoardNo(list.get(index).getBoardNo() - 1);
					index++;
				}
			}
		} else if (ans == 'N') {
			System.out.println("삭제가 취소되었습니다.");
		} else {
			System.out.println("y/n 으로 입력해주세요 .");
		}
	}

	public void searchBoard() {
		System.out.print("검색할 제목 : ");
		String searchTitle = sc.nextLine();
		Board[] bdArray = new Board[list.toArray().length];
		Object[] objArray = list.toArray();
		int a = 0;
		for (int i = 0; i < bdArray.length; i++) {
			bdArray[i] = (Board) objArray[i];
			if (bdArray[i].getBoardTitle().contains(searchTitle)) {
				System.out.println(list.get(i));
				a = 1;
			}
		}
		if (a == 0) {
			System.out.println("일치하는 제목이 없습니다.");
		}
	}

	public void saveListFile() {
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("board_list.dat"))) {
			for (Object o : list.toArray()) {
				objOut.writeObject(o);
			}
			System.out.println("board_list.dat 에 성공적으로 저장되었습니다.");
		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}

	public void sortList(int item, boolean isDesc) {
		switch (item) {
		case 1:
			if (isDesc) {
				list.sort(new DescBoardNo());
			} else {
				list.sort(new AscBoardNo());
			}
			break;

		case 2:
			if (isDesc) {
				list.sort(new DescBoardDate());
			} else {
				list.sort(new AscBoardDate());
			}
			break;
		case 3:
			if (isDesc) {
				list.sort(new DescBoardTitle());
			} else {
				list.sort(new AscBoardTitle());
			}
			break;
		default:
			System.out.println("잘못된 번호입니다.");
		}
	}

}
