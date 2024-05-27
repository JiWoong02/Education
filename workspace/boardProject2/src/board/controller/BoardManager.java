package board.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import board.model.vo.AscBoardDate;
import board.model.vo.AscBoardNo;
import board.model.vo.AscBoardTitle;
import board.model.vo.Board;
import board.model.vo.DescBoardDate;
import board.model.vo.DescBoardNo;
import board.model.vo.DescBoardTitle;

public class BoardManager {
	HashMap<Integer, Board> bmap = new HashMap<Integer, Board>();
	Scanner sc = new Scanner(System.in);

	public HashMap<Integer, Board> getBmap() {
		return bmap;
	}

	public void setBmap(HashMap<Integer, Board> bmap) {
		this.bmap = bmap;
	}

	public BoardManager() {
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("board_map.dat"))) {
			while (true) {
				try {
					Board b = (Board)objIn.readObject();
					bmap.put(b.getBoardNo(), b);
				} catch (EOFException e) {
					// 파일 끝에 도달했을 때 루프를 종료
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
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
		if (bmap.size() != 0) {
			num = bmap.get(bmap.size() - 1).getBoardNo() + 1;
		}
		bmap.put(num, new Board(num, title, writer, now, boardContent, 0));
	}

	public void displayAllMaps(Map maps) {
		Iterator keyIter = maps.keySet().iterator();
		while(keyIter.hasNext()) {
			Object key = keyIter.next();
			System.out.println(maps.get(key));
		}
	}

	public void displayBoard() {
		System.out.print("조회할 글번호 : ");
		int index = sc.nextInt();
		bmap.get(index).setReadCount(bmap.get(index).getReadCount() + 1);
		System.out.println(bmap.get(index));
	}

	public void modifyTitle() {
		System.out.print("수정할 글 번호 : ");
		int index = sc.nextInt();
		System.out.println(bmap.get(index));
		System.out.print("변경할 제목 : ");
		sc.nextLine();
		bmap.get(index).setBoardTitle(sc.nextLine());
		System.out.println("성공적으로 변경되었습니다 ! ");
	}

	public void modifyContent() {
		System.out.print("수정할 글 번호 : ");
		int index = sc.nextInt();
		System.out.println(bmap.get(index));
		System.out.print("변경할 내용 : ");
		sc.nextLine();
		bmap.get(index).setBoardContent(sc.nextLine());
		System.out.println("성공적으로 변경되었습니다 ! ");
	}

	public void deleteBoard() {
		System.out.print("삭제할 글 번호 : ");
		int index = sc.nextInt();
		System.out.println(bmap.get(index));
		System.out.print("정말로 삭제하시겠습니까 ? (y/n) : ");
		char ans = sc.next().toUpperCase().charAt(0);
		if (ans == 'Y') {
			bmap.remove(index);
			System.out.println(index + "번 글이 삭제되었습니다.");
			if (index < bmap.size()) {
				while (index != bmap.size()) {
					bmap.get(index).setBoardNo(bmap.get(index).getBoardNo() - 1);
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
		int a = 0;
		for (int i = 0; i < bmap.size(); i++) {
			if (bmap.get(i).getBoardTitle().equals(searchTitle)) {
				System.out.println(bmap.get(i));
				a = 1;
			}
		}
		if (a == 0) {
			System.out.println("일치하는 제목이 없습니다.");
		}
	}

	public void saveListFile() {
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("board_map.dat"))) {
			Collection values = bmap.values();
			for (Object o : values) {
				objOut.writeObject(o);
			}
			System.out.println("board_map.dat 에 성공적으로 저장되었습니다.");
		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}

	public void sortMap(int item, boolean isDesc) {
		switch (item) {
		case 1:
			if (isDesc) {	
				DescBoardNo descBnum = new DescBoardNo();
				descBnum.compare(bmap);
			} else {
				AscBoardNo ascBnum = new AscBoardNo();
				ascBnum.compare(bmap);
			}
			break;

		case 2:
			if (isDesc) {
				DescBoardDate descBdate = new DescBoardDate();
				descBdate.compare(bmap);
			} else {
				AscBoardDate ascBdate = new AscBoardDate();
				ascBdate.compare(bmap);
			}
			break;
		case 3:
			if (isDesc) {
			} else {
			}
			break;
		default:
			System.out.println("잘못된 번호입니다.");
		}
	}

}
