package member.model.dto;

import java.util.Scanner;

public class MemberMenu {
	// Field
	Scanner sc = new Scanner(System.in);
	MemberManager mManager = new MemberManager();

	public MemberMenu() {
	}

	public void mainMenu() {
		do {
			System.out.println("최대 등록 가능한 회원 수는 " + MemberManager.SIZE + "명 입니다.");
			System.out.println("현재 등록된 회원 수는 " + ""+"명 입니다.");
			System.out.println("\n***** 회원 관리 프로그램 *****\n");
			System.out.println("1. 새 회원 등록"); // 객체배열사용
			System.out.println("2. 회원 조회"); // equals 사용 //java.lang.String
			System.out.println("3. 회원 정보 수정"); // setter사용
			System.out.println("4. 회원 정보 정렬"); // compareto 사용//java.lang.String //복사본으로 정렬해서 출력 arrayCopy();
			System.out.println("5. 회원 삭제");
			System.out.println("6. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 선택 :");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				mManager.memberInput();
				break;
			case 2:
				searchMenu();
				break;
			case 3:
				modifyMenu();
				break;
			case 4:
				sortMenu();
				break;
			case 5:
				mManager.deleteMember();
				break;
			case 6:
				mManager.printAllMember();
				break;
			case 9:
				System.out.println("정말로 끝내시겠습니까?( y | n ) : ");
				if (sc.next().toUpperCase().charAt(0) == 'Y')
					return;
			}
		} while (true);

	}

	public void searchMenu() {
		do {
			System.out.println("\n***** 회원 정보 검색 메뉴 *****\n");
			System.out.println("1. 아이디로 검색");
			System.out.println("2. 이름으로 검색");
			System.out.println("3. 이메일로 검색");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 :");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다. ");
					return;
			}
		} while (true);

	}

	public void sortMenu() {
	}

	public void modifyMenu() {
	}
}
