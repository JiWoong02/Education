package logic.home.model;

import java.util.Scanner;

public class VariableSample {

	//클래스 안에 생성자가 존재하지 않으면, java virtual machine(jvm)이 컴파일할 때
	//기본생성자를 (public클래스명(){}) 클래스에 자동 추가하면서 컴파일함
	
	public void myProfile() {
		//내 신상정보 변수에 담아 출력하기
		String name = "한지웅";
		int age = 27;
		double height = 172.2;
		double weight = 67.3;
		String phone = "010-8215-5709";
		char gender = '남';
		String email = "smkr96@naver.com";
		System.out.println("제 이름은 " + name +"입니다. 나이는 " + age + "세 이며, 성별은 " 
				+ gender + "자이고, \n키는 " + height +"cm 몸무게는" + weight +"kg 입니다.\n"
				+ "핸드폰 번호는 " +phone+"이고, 이메일은 " + email+"입니다.");
	}

	public void empInformation() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사번을 입력해주세요 : ");
		String empId = sc.next();
		System.out.print("이름을 입력해주세요 : ");
		String empName = sc.next();
		System.out.print("주민등록번호를 입력해주세요 : ");
		String empNo = sc.next();
		System.out.print("소속부서를 입력해주세요 : ");
		String deptName = sc.next();
		System.out.print("직급 입력해주세요 : ");
		String jobTitle = sc.next();
		System.out.print("급여를 입력해주세요 : ");
		int salary = sc.nextInt();
		System.out.print("보너스포인트를 입력해주세요(소숫점 아래 둘째자리 까지) : ");
		double bonusPoint = sc.nextDouble();
		
		int pay = (int)(salary*12+salary*bonusPoint);
		System.out.println("사번 : " + empId);
		System.out.println("이름 : " + empName);
		System.out.println("주민등록번호 : " + empNo);
		System.out.println("소속부서 : " + deptName);
		System.out.println("직급 : " + jobTitle);
		System.out.println("연봉 : " + pay);
		
		
		
	}

	public void defaultValue() {
		//기본 자료형 변수의 초기값 확인하기
		//변수 초기화 : 변수 방 만들면서 바로 초기값을 기록시킴
		//초기값 : 변수 방에 첫번째로 기록되는 값
		//작성 : 자료형 변수명 = 초기값;
		boolean flag = false;
		char ch = '\u0000'; // 유니코드 , 그러고 뒤에 16진수 4자리를 입력  0000-> 16진수 0번값
		byte bnum = 0;
		short snum = 0;
		int inum = 0;
		long lnum =0L;
		float fnum =0.0f;
		double dnum = 0.0;

		
		System.out.println("flag : " + flag);
		System.out.println("ch : " + ch);
		System.out.println("bnum : " + bnum);
		System.out.println("snum : " + snum);
		System.out.println("inum : " + inum);
		System.out.println("lnum : " + lnum);
		System.out.println("fnum : " + fnum);
		System.out.println("dnum : " + dnum);
		
	}

}
