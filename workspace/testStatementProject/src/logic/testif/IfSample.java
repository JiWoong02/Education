package logic.testif;

import java.util.Scanner;

public class IfSample {
	//조건문 if만 사용한 경우의 샘플 클래스
	//제시한 조건을 만족하는 경우에만 실행 내용이 작동되게 하는 구문임
	//if(조건표현식) { 조건의 결과가 참일 때 실행할 구문들 }
	//조건표현식은 반드시 참(true) | 거짓(false)의 결과가 나오게끔 작성해야 함
	public void test1(){
		//정수를 하나 입력받아서, 양수일 때만 입력된 수의 구구단 출력 처리
		//양수가 아니면 실행할 내용 없음
		System.out.print("정수 하나 입력 : ");
		int dan = new Scanner(System.in).nextInt();
		
		if(dan>0) {
			//dan 의 값이 양수일 때만 작동
			for(int su=1; su<10; su++){
				System.out.println(dan + " * " + su + " = " + (dan*su));
			}
		}
	}
	public void test2() {
		//문자를 하나 입력받아, 양수이면서 대문자일 때만 유니코드가 출력되게 처리
		System.out.print("문자 하나 입력 : ");
		char word = new Scanner(System.in).next().charAt(0);
		if(word>0&&(word>='A'&&word<='Z')) {
			System.out.println(word + "의 유니코드는 " + (int)word + " 입니다.");
		}
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		//콘솔에 "회원이면 1, 비회원이면 2 입력 : " 출력
		System.out.print("회원이면 1, 비회원이면 2를 입력해 주세요 : ");
		int num=sc.nextInt();
		/*
		 * 입력값이 1일 때는
		 * "로그인할 아이디 : " 출력하고, 아이디 입력받음
		 * "암호 : " 출력하고, 암호 입력받음
		 * 아이디와 암호를 확인출력 처리
		 * */
		if(num==1) {
			System.out.print("로그인할 아이디 : ");
			String id = sc.next();
			System.out.print("암호 : ");
			String pw = sc.next();
			System.out.print("입력하신 아이디는 "+ id +" 입니다.");
			System.out.println("입력하신 암호는 "+ pw + " 입니다.");
		}
		/* 입력값이 2일 때는 
		 * "회원 가입하셔야 합니다." 출력하고
		 * "이름 : " 출력하고, 이름 입력받음
		 * "아이디 지정 : " 출력하고, 아이디 입력받음
		 * "암호 지정 : " 출력하고, 암호 입력받음
		 * "이메일 : "출력하고, 이메일 입력받음
		 * "전화번호 : " 출력하고, 전화번호 입력받음
		 * "성별[남/여] : " 출력하고, 성별 입력받음
		 * "나이 : " 출력하고, 나이 입력받음
		 * 
		 * 입력받은 값 모두 출력 처리
		 */
		if(num==2) { 
				 System.out.print("회원 가입하셔야 합니다."+"\n"+"이름 : ");
				 String name = sc.next();
				 System.out.print("아이디 지정 : ");
				 String id = sc.next();
				 System.out.print("암호 지정 : ");
				 String pw = sc.next();
				 System.out.print("이메일 : ");
				 String email = sc.next();
				 System.out.print("전화번호 : ");
				 String phone = sc.next();
				 System.out.print("성별[남/여] : ");
				 char gender = sc.next().charAt(0);
				 System.out.print("나이 : ");
				 int age = sc.nextInt();
				 
				 System.out.println("입력하신 내용이 맞습니까?"
						 					+"\n"+"이름 : " +name
						 					+"\n"+"아이디 : " + id
						 					+"\n"+"암호 : " + pw
						 					+"\n"+"이메일 : " + email
						 					+"\n"+"전화번호 : " + phone
						 					+"\n"+"성별[남/여] : " + gender
						 					+"\n"+"나이 : " + age	);		
		}
	}
}
