package book.mvc.view;

import java.util.List;
import java.util.Scanner;

import book.mvc.controller.BookController;
import book.mvc.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();

	public BookMenu() {
		super();
	}

	public void diplayMenu() {
		do {
			BookMenu bm = new BookMenu();
			System.out.println();
			System.out.println("1. 도서 추가"); // => BookController 의 insertBook(Book객체) 호출
			System.out.println("2. 도서 정보 수정");// => BookController 의 updateBook(Book객체) 호출
			System.out.println("3. 도서 삭제"); // => BookController 의 deleteBook(책아이디) 호출
			System.out.println("4. 도서 아이디로 조회"); // => BookController 의 searchBook(아이디) 호출
			System.out.println("5. 도서 제목으로 조회"); // => BookController 의 searchBookTitle(제목) 호출
			System.out.println("6. 도서 목록 전체 조회"); // => BookController 의 selectAll() 호출
			System.out.println("9. 끝내기");
			System.out.print("번호 선택 :");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				bc.insertBook(bm.inputBook());
				break;
			case 2:
				bc.updateBook(bm.modifyBook());
				break;
			case 3:
				bc.deleteBook(bm.inputBookId());
				break;
			case 4:
				bm.displayBook(bc.searchBook(bm.inputBookId()));
				break;
			case 5:
				bm.displayBooks(bc.searchBookTitle(bm.inputBookTitle()));
				break;
			case 6:
				bm.displayBooks(bc.selectAll());
				break;
			case 9:
				return;
			default:
				System.out.println("번호를 다시 입력해주세요.");
			}
		} while (true);
	}

	public Book inputBook() { // => 새 도서정보 키보드 입력용
		Book bk = new Book();
		System.out.print("제목을 입력해주세요 : ");
		sc.next();
		bk.setTitle(sc.nextLine()); // 확인하고 nextLine으로 바꾸기
		System.out.print("저자를 입력해주세요 : ");
		bk.setAuthor(sc.next());
		System.out.print("출판사를 입력해주세요 : ");
		bk.setPublisher(sc.next());
		System.out.print("출판날짜를 입력해주세요(yyyy-MM-dd) : ");
		bk.setPublish_date(java.sql.Date.valueOf(sc.next()));
		System.out.print("가격을 입력해주세요 : ");
		bk.setPrice(sc.nextInt());
		return bk;
	}

	public Book modifyBook() {// => 수정도서정보 키보드 입력용
		Book bk = new Book();
		System.out.print("변경할 책 번호를 입력해주세요 : ");
		bk.setBook_id(sc.nextInt());
		System.out.print("변경할 제목을 입력해주세요 : ");
		sc.next();
		bk.setTitle(sc.nextLine()); // 확인하고 nextLine으로 바꾸기
		System.out.print("변경할 저자를 입력해주세요 : ");
		bk.setAuthor(sc.next());
		System.out.print("변경할 출판사를 입력해주세요 : ");
		bk.setPublisher(sc.next());
		System.out.print("변경할 출판날짜를 입력해주세요(yyyy-MM-dd) : ");
		bk.setPublish_date(java.sql.Date.valueOf(sc.next()));
		System.out.print("변경할 가격을 입력해주세요 : ");
		bk.setPrice(sc.nextInt());

		return bk;
	}

	public int inputBookId() {// => 검색/삭제할 도서 아이디 입력용
		System.out.println("검색/삭제할 도서 아이디를 입력해주세요.");
		return sc.nextInt();
	}

	public String inputBookTitle() {// => 도서제목 키보드 입력용
		System.out.println("도서 제목을 입력해주세요.");
		sc.next();
		return sc.nextLine();
	}

	public void displayBooks(List<Book> list) { // => 도서목록 출력용
		if (list != null) {
			for (Book bk : list) {
				System.out.println(bk);
			}
		} else {
			System.out.println("도서가 존재하지 않습니다.");
			System.out.println("관리자에게 문의하세요");
		}
	}

	public void displayBook(Book b) {// => 도서 출력용
		if (b != null) {
			System.out.println(b);
		} else {
			System.out.println("도서가 존재하지 않습니다.");
			System.out.println("관리자에게 문의하세요");
		}
	}

	public void displayError(String message) { // => 에러메세지 출력용
		System.out.println(message);
	}

}
