package member.model.dto;

import java.util.Scanner;

public class MemberManager {
	public static final int SIZE = 10;
	private int memberCount;
	private Member[] mar = new Member[SIZE];
	private Member[] marc = new Member[SIZE];
	private Member temp = new Member();
	Scanner sc = new Scanner(System.in);
	// 초기화 블럭 작성 : 테스트에 사용할 샘플 객체 5개 생성함
	{
		mar[0] = new Member("kim123", "김유신", "pwkkk34!", "kim123@naver.com", 'M', 35);
		mar[1] = new Member("smkr96", "한지웅", "hello1234", "smkr96@yahoo.co.kr", 'M', 27);
		mar[2] = new Member("yura12", "김유라", "yu12ra12", "yurakim@naver.com", 'F', 23);
		mar[3] = new Member("smp88", "박상민", "smp1964", "sangminpark@naver.com", 'M', 37);
		mar[4] = new Member("yksrose77#", "윤경숙", "yksrose77#", "yksrose77@daum.net", 'F', 29);
		memberCount = 5;
	}

	// 디폴트 생성자 작성
	public MemberManager() {
	}

//	1. memberCount 필드에 대한 getter 작성
	public int getMemberCount() {
		return memberCount;
	}

//2. 새 회원 정보 입력용 메소드 작성
	public void memberInput() {
//	  키보드로 새 회원의 정보를 입력받아, 배열에 기록함
//	  Member 클래스의 setter 사용함
//	  마지막에 memberCount 1증가시킴	
		while (true) {
			System.out.println("신규 회원의 정보 입력를 시작합니다.");
			mar[memberCount] = new Member();
			System.out.print("아이디를 입력해주세요. : ");
			mar[memberCount].setId(sc.next());
			System.out.println();
			System.out.print("이름을 입력해주세요. : ");
			mar[memberCount].setName(sc.next());
			System.out.println();
			System.out.print("비밀번호를 입력해주세요. : ");
			mar[memberCount].setPassword(sc.next());
			System.out.println();
			System.out.print("이메일을 입력해주세요. : ");
			mar[memberCount].setEmail(sc.next());
			System.out.println();
			System.out.print("성별을 입력해주세요. : ");
			mar[memberCount].setGender(sc.next().toUpperCase().charAt(0));
			System.out.println();
			System.out.print("나이를 입력해주세요. : ");
			mar[memberCount].setAge(sc.nextInt());
			System.out.println();
			memberCount++;
			System.out.println("계속하시겠습니까?(y | n)");
			if (sc.next().toUpperCase().charAt(0) != 'Y') {
				break;
			}
		} // while
	}

//3. 배열에서 회원 정보 삭제용 메소드 작성
	public void deleteMember() {
//	  삭제할 회원의 아이디를 입력받음
//	  리턴받은 인덱스에 대한 회원정보 출력함
//	  정말로 삭제하시겠습니까? (y/n) : 출력
//	  입력값이 대소문자 상관없이 'Y' 이면, 해당 인덱스의
//	  레퍼런스를 null로 처리함
//	  단, 검색한 회원의 인덱스가 0 또는 중간 위치일 경우에는
//	  지울 위치 뒤의 주소들을 하나씩 앞으로 옮김
//	  마지막 인덱스일 경우에만 null 처리함
//	  삭제 후 memberCount 1 줄임
		System.out.print("삭제하실 아이디를 입력해주세요. :");
		String deleteID = sc.next();
		for (int i = 0; i < mar.length; i++) {
			if (deleteID.equals(mar[i].getId())) {
				System.out.println("삭제할 아이디가 조회되었습니다.");
				System.out.println(mar[i].memberInfo());
				System.out.print("정말 지우시겠습니까?( Y | N )");
				if (sc.next().toUpperCase().charAt(0) == 'Y') {
					mar[i] = null;
					if (mar[i] != mar[memberCount - 1]) {
						for (int j = i; j < memberCount - 1; j++)// j는 0부터 출발해서 5보다 작을때까지 즉 0 1 2 3 4 5
							mar[j] = mar[j + 1];
						memberCount--;
					}
				}
				break;
			} // if
		} // for
	}

//4. 배열에 기록된 현재 회원 전체 정보 출력용 메소드 작성
	public void printAllMember() {
//	  Member 클래스의 memberInfo() 사용 출력처리함
		for (int i = 0; i < memberCount; i++)
			System.out.println(mar[i].memberInfo());
	}

	public int searchMemberId(String id) {
//		  전달받은 아이디와 일치하는 회원이 있는지 찾음
//		  회원이 존재하면, 반복을 종료하고 해당 인덱스를 
//		  존재하지 않으면 -1을 리턴 처리함
		for (int i = 0; i < memberCount; i++)
			if (id.equals(mar[i].getId())) {
				return i;
			}
		return -1;
	}

//	6. 이름을 이용한 회원정보 검색용 메소드 작성
	public int searchMemberName(String name) {
//	  전달받은 이름과 일치하는 회원이 있는지 찾음
//	  회원이 존재하면, 반복을 종료하고 해당 인덱스를 
//	  존재하지 않으면 -1을 리턴 처리함
		for (int i = 0; i < memberCount; i++) {
			if (name.equals(mar[i].getName())) {
				return i;
			}
		}

		return -1;

	}

//	7. 이메일주소를 이용한 회원정보 검색용 메소드 작성
	public int searchMemberEmail(String email) {
//	  전달받은 이메일과 일치하는 회원이 있는지 찾음
//	  회원이 존재하면, 반복을 종료하고 해당 인덱스를 
//	  존재하지 않으면 -1을 리턴 처리함
		for (int i = 0; i < memberCount; i++) {
			if (email.equals(mar[i].getEmail())) {
				return i;
			}
		}
		return -1;

	}

//	8. 한 사람의 회원 정보 출력용 메소드 작성
	public void printMember(int index) {
		System.out.println(mar[index].memberInfo());
//	  전달받은 인덱스에 대한 회원정보 출력함
//	  >> Member 클래스의 memberInfo() 메소드 사용함
	}

//9. 아이디순 오름차순 정렬하는 메소드 작성
	public void sortIDAsc() {
//	  현재 등록된 회원에 대한 배열을 복사함
//	  복사본에 대해 Select Sort 방식의 오름차순 정렬 처리
//	  정렬이 끝나면 각 레퍼런스별 memberInfo()를 사용 출력함
		System.arraycopy(mar, 0, marc, 0, mar.length);
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (marc[i].getId().compareTo(marc[j].getId()) > 0) {
					temp = marc[i];
					marc[i] = marc[j];
					marc[j] = temp;
				}
			}
		}
		for (int i = 0; i < memberCount; i++) {
			System.out.println(marc[i].memberInfo());
		}
	}

//10. 아이디순 내림차순 정렬하는 메소드 작성
	public void sortIDDes() {
//	  현재 등록된 회원에 대한 배열을 복사함
//	  복사본에 대해 Select Sort 방식의 내림차순 정렬 처리
//	  정렬이 끝나면 각 레퍼런스별 memberInfo()를 사용 출력함
		System.arraycopy(mar, 0, marc, 0, mar.length);
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (marc[i].getId().compareTo(marc[j].getId()) < 0) {
					temp = marc[i];
					marc[i] = marc[j];
					marc[j] = temp;
				}
			}
		}
		for (int i = 0; i < memberCount; i++) {
			System.out.println(marc[i].memberInfo());
		}
	}

//11. 나이순 오름차순 정렬하는 메소드 작성
	public void sortAgeAsc() {
//	  현재 등록된 회원에 대한 배열을 복사함
//	  복사본에 대해 Select Sort 방식의 오름차순 정렬 처리			
//	  정렬이 끝나면 각 레퍼런스별 memberInfo()를 사용 출력함
		System.arraycopy(mar, 0, marc, 0, mar.length);
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (marc[i].getAge() > marc[j].getAge()) {
					temp = marc[i];
					marc[i] = marc[j];
					marc[j] = temp;
				}
			}
		}
		for (int i = 0; i < memberCount; i++) {
			System.out.println(marc[i].memberInfo());
		}
	}

//12. 나이순 내림차순 정렬하는 메소드 작성
	public void sortAgeDes() {
//	  현재 등록된 회원에 대한 배열을 복사함
//	  복사본에 대해 Select Sort 방식의 내림차순 정렬 처리			
//	  정렬이 끝나면 각 레퍼런스별 memberInfo()를 사용 출력함
		System.arraycopy(mar, 0, marc, 0, mar.length);
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (marc[i].getAge() < marc[j].getAge()) {
					temp = marc[i];
					marc[i] = marc[j];
					marc[j] = temp;
				}
			}
		}
		for (int i = 0; i < memberCount; i++) {
			System.out.println(marc[i].memberInfo());
		}
	}

//13. 성별순 내림차순 정렬하는 메소드 작성
	public void sortGenderDes() {
//	  현재 등록된 회원에 대한 배열을 복사함
//	  복사본에 대해 Select Sort 방식의 오름차순 정렬 처리			
//	  정렬이 끝나면 각 레퍼런스별 memberInfo()를 사용 출력함
		System.arraycopy(mar, 0, marc, 0, mar.length);
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (marc[i].getGender() < marc[j].getGender()) {
					temp = marc[i];
					marc[i] = marc[j];
					marc[j] = temp;
				}
			}
		}
		for (int i = 0; i < memberCount; i++) {
			System.out.println(marc[i].memberInfo());
		}
	}

//14. MemberMenu 클래스에서 회원정보 수정 기능에서 사용함
//	인덱스를 전달받아, 
//	인덱스 위치에 기록된 객체의 주소를 리턴하는 메소드 작성
	public Member findMember(int index) {
//	  배열 인덱스에 기록된 주소를 리턴함
		return mar[index];
	}
}// class
