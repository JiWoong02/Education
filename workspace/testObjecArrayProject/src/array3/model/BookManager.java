package array3.model;

import java.util.Scanner;

public class BookManager {
//	1. Field 선언
//	- bar : Book[] //null 로 초기화 명시함
//	~ sc : Scanner
//	- count : int	//현재 추가된 객체 수 : static
	// Field
	private Book[] bar = null;
	Scanner sc = new Scanner(System.in);
	private static int count;
//		2. 초기화블럭 작성
//		: 10개의 Book 배열 할당함
	{
		bar = new Book[10]; // 객체만든거 아님 주소 10개 담을 레퍼런스
	}

	// 생성자 작성
	public BookManager() {
	}

//		3. menu() 메소드 작성
//		public void menu()
//		=> do~while 문으로 반복 실행 처리함
	public void menu() {
//		<메뉴 화면>
//		***** 도서 관리 메뉴 *****
//			
//		1. 도서 정보 추가	//선택시 bookInput() 메서드 실행함
//		2. 모두 출력	//선택시 bookAllOutput() 메서드 실행함
//		7. 끝내기		//main() 으로 return함
		int num = 0;
		do {
			System.out.println("\n***** 도서 관리 메뉴 *****\n");
			System.out.println("1. 도서 정보 추가");
			System.out.println("2. 모두 출력");
			System.out.println("7. 끝내기");
			System.out.print("메뉴를 선택하세요 : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : bookInput(); break;
			case 2 : bookAllOutput(); break;
			case 7 : return;
			default : System.out.println("올바른 번호를 입력하세요.");
			}
		}while(true);

	}

//		4. bookInput() 메서드 작성함
//		public void bookInput()
//		=> 새로운 도서 정보 기록을 위한 객체 생성하고
//		   현재 인덱스에 주소 저장함
//		=> 생성자에서 객체 수 카운트 1증가함
//		=> 키보드로 도서 정보 입력받아 객체에 기록함
	public void bookInput() {
		bar[count] = new Book();
		
		//키보드 입력 처리
		System.out.print("책 제목 : ");
		sc.nextLine();//입력 버퍼에 남은 엔터키 제거
		bar[count].setTitle(sc.nextLine()); //공백이 포함된 문자열 입력
		System.out.print("가격 : ");
		bar[count].setPrice(sc.nextInt());
		System.out.print("저자명 : ");
		bar[count].setAuthor(sc.next());
		System.out.print("출판사 : ");
		sc.nextLine(); //입력 버퍼에 남은 엔터키 제거
		bar[count].setPublisher(sc.nextLine()); //공백이 포함된 문자열 입력
		count++;
	}

//		5. bookAllOutput() 메서드 작성함
//			public void bookAllOutput()
//			=> 현재까지 카운트된 도서 정보 모두 출력함
	public void bookAllOutput() {
		for(int i =0; i <count;i++) {
			System.out.println(bar[i].boolInfo());
		}
	}

}
