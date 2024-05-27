package practice2;

import java.util.Scanner;

public class TestBookManager {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		TestBookManager.menu();

	}

	public static void menu() {
		BookManager bm = new BookManager();
		do {
			System.out.println("*** 도서 관리 프로그램 ***");

			System.out.println("1. 새 도서 추가");	//addBook(inputBook() 이 리턴한 객체) 실행
			System.out.println("2. 도서정보 정렬후 출력"); //sortedBookList() 실행 
//					=> Book[] 리턴받아 printBookList(Book[]) 실행
			System.out.println("3. 도서 삭제");	//deleteBook(삭제할 인덱스) 실행
			System.out.println("4. 도서 검색출력");	//searchBook(검색할 도서명) 실행 
//					=> index 리턴받아 printBook(index) 실행
			System.out.println("5. 전체 출력");	//displayAll() 실행
			System.out.println("6. 끝내기");
			System.out.print("메뉴 선택 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1 :	bm.addBook(TestBookManager.inputBook());
				break;
			case 2 : bm.printBookList(bm.sortedBookList());				
				break;
			case 3 :	bm.deleteBook(bm.searchBook(TestBookManager.inputBookTitle())); 
				break;
			case 4 : 
				bm.printBook(bm.searchBook(TestBookManager.inputBookTitle()));
			sc.next();
				break;
			case 5 : bm.displayAll();
				break;
			case 6 : return;
			default : System.out.println("잘못된 번호입니다. \n번호를 다시 입력해주세요");
			}
			
		} while (true);
	}
	public static Book inputBook() {
		System.out.print("도서 번호를 입력해주세요 : ");
		String bNo = sc.next();
		System.out.print("도서분류코드를 입력해주세요 (1.인문/2.자연과학/3.의료/4.기타) : ");
		int category = sc.nextInt();
		System.out.print("책제목을 입력해주세요 :  ");
		sc.nextLine();
		String title = sc.nextLine();	
		System.out.print("저자를 입력해주세요 :  ");
		String author = sc.next();
		Book bk = new Book(bNo,category,title,author);
		return bk;
	}
	
	public static String inputBookTitle() {
		System.out.print("책제목을 입력해주세요 : ");
		sc.nextLine();
		String str = sc.nextLine();
		return str;
	}
}
