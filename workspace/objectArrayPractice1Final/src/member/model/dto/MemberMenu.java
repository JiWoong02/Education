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
			System.out.println("현재 등록된 회원 수는 " + mManager.getMemberCount() + "명 입니다.");
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
				System.out.print("검색하실 아이디를 입력해주세요. : ");
				int index = mManager.searchMemberId(sc.next());
				if (index == -1) {
					System.out.println("존재하지 않는 회원입니다.");
				} else {
					mManager.printMember(index);
				}
				break;
			case 2:
				System.out.print("검색하실 이름 입력해주세요. : ");
				int index2 = mManager.searchMemberName(sc.next());
				if (index2 == -1) {
					System.out.println("존재하지 않는 회원입니다.");
				} else {
					mManager.printMember(index2);
				}
				break;
			case 3:
				System.out.print("검색하실 이메일을 입력해주세요. : ");
				int index3 = mManager.searchMemberEmail(sc.next());
				if (index3 == -1) {
					System.out.println("존재하지 않는 회원입니다.");
				} else {
					mManager.printMember(index3);
				}
				break;
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다. ");
				return;
			}
		} while (true);

	}

	public void sortMenu() {
		do {
			System.out.println("\n***** 회원 정보 정렬 출력 메뉴 *****\n");
			System.out.println("1. 아이디 오름차순 정렬 출력");
			System.out.println("2. 아이디 내림차순 정렬 출력");
			System.out.println("3. 나이 오름차순 정렬 출력");
			System.out.println("4. 나이 내림차순 정렬 출력");
			System.out.println("5. 성별 내림차순 정렬 출력(남여순)");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 :");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				mManager.sortIDAsc();
				break;
			case 2:
				mManager.sortIDDes();
				break;
			case 3:
				mManager.sortAgeAsc();
				break;
			case 4:
				mManager.sortAgeDes();
				break;
			case 5:
				mManager.sortGenderDes();
				break;
				
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다. ");
				return;
			}
		} while (true);
	}

	public void modifyMenu() {
		do {
			System.out.println("\n***** 회원 정보 수정 메뉴 *****\n");
			System.out.println("1. 암호 변경");
			System.out.println("2. 이메일 변경");
			System.out.println("3. 나이 변경");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 :");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("비밀번호를 변경하실 아이디를 입력해주세요 : ");
				int index = mManager.searchMemberId(sc.next());
				if(index!=-1) {
					mManager.printMember(index);
					System.out.print("변경하실 비밀번호를 입력해주세요 : ");
					mManager.findMember(index).setPassword(sc.next());
					System.out.println("회원의 정보가 변경되었습니다.");	
				}else {
					System.out.println("존재하지 않는 아이디 입니다.");
				}
				break;
			case 2:
				System.out.print("이메일을 변경하실 아이디를 입력해주세요 : ");
				int index2 = mManager.searchMemberId(sc.next());
				if(index2!=-1) {
					mManager.printMember(index2);
					System.out.print("변경하실 이메일 입력해주세요 : ");
					mManager.findMember(index2).setEmail(sc.next());
					System.out.println("회원의 정보가 변경되었습니다.");	
				}else {
					System.out.println("존재하지 않는 아이디 입니다.");
				}
				break;
			case 3:
				System.out.print("나이를 변경하실 아이디를 입력해주세요 : ");
				int index3 = mManager.searchMemberId(sc.next());
				if(index3!=-1) {
					mManager.printMember(index3);
					System.out.print("변경하실 나이를 입력해주세요 : ");
					mManager.findMember(index3).setAge(sc.nextInt());
					System.out.println("회원의 정보가 변경되었습니다.");	
				}else {
					System.out.println("존재하지 않는 아이디 입니다.");
				}
				break;			
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다. ");
				return;
			}
		} while (true);
		
	}
}
