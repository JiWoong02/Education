package com.test.practice;

import java.util.Scanner;

public class Example {
	public void sample1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int mat = sc.nextInt();
		int tot = kor + eng + mat;
		double avg = (double)(tot)/3;
		String pass = (avg>=60&&kor>=40&&eng>=40&&mat>=40)?"합격":"불합격";
		System.out.println("시험 결과 : "+ pass);
	}
	public void sample2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해 주세요 : ");
		String name = sc.next();
		System.out.print("학년을 입력해 주세요 : ");
		int grade = sc.nextInt();
		System.out.print("반을 입력해 주세요 : ");
		int clas = sc.nextInt();
		System.out.print("번호를 입력해 주세요 : ");
		int num = sc.nextInt();
		System.out.print("성별을 입력해 주세요 (M/F) : ");
		char gender = sc.next().charAt(0);
		String gender2= gender=='M'?"남":"여";
		System.out.print("성적을 입력해 주세요 : ");
		float score = sc.nextFloat();
		
		System.out.println(grade + "학년 "+clas+"반 " + num+"번 "+ gender2+"학생 "+name+"은 "  + "성적이 "+score+"이다." );
		
	}
	public void sample3() {
		System.out.print("정수를 입력해 주세요 : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println(num>0?"양수다":"양수가 아니다.");
	}
	public void sample4() {
		System.out.print("정수를 입력해 주세요 : ");
		int num = new Scanner(System.in).nextInt();
		String str = num%2==0?"짝수다":"홀수다";	
		System.out.println(str);
	}
	public void sample5() {
		/*java.lang.Double 참조
		 * double 자료형의 최대값, 최소값, 비트수, 바이트
		 * 그외 상수필드의 값 모두 출력조회함
		 */
		System.out.println("double 자료형의 최대값 : " + Double.MAX_VALUE );
		System.out.println("double 자료형의 최소값 : " + Double.MIN_VALUE );
		System.out.println("double 자료형의 비트수 : " + Double.SIZE );
		System.out.println("double 자료형의 할당크기 : " + Double.BYTES);
		System.out.println("double 자료형의 최대 지수 : " + Double.MAX_EXPONENT);
		System.out.println("double 자료형의 최소 지수 : " + Double.MIN_EXPONENT);
		System.out.println("double 자료형의 일반 : " + Double.MIN_NORMAL);
	}
	
	//문제 6
	public void sample6() {
		//고객이름(customerName), 나이(age), 성별(gender, 남/여), 전화번호(phone), 
		//포인트점수(point, 소숫점아래 둘째자리까지 입력받음), 특이사항(etc)을 입력받아 출력 처리함
		//특이사항 입력 예 : 보라색을 좋아하고 무스크향을 즐겨 사용함
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해 주세요 : ");
		String customerName = sc.next();
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		System.out.print("성별을 입력해 주세요(남/여) : ");
		char gender = sc.next().charAt(0);
		System.out.print("전화번호를 입력해 주세요 : ");
		String phone = sc.next();
		System.out.print("포인트를 입력해 주세요(소수점 둘째자리 까지) : ");
		Double point = sc.nextDouble();
		System.out.print("특이사항을 입력해 주세요 : ");
		sc.nextLine(); //입력버퍼에 남은 엔터키 제거처리
		String etc = sc.nextLine(); //공백이 포함된 문자열 (엔터도 값으로 읽음)
		System.out.println("고객 이름 : " + customerName);
		System.out.println( "고객 나이 : " + age );
		System.out.println( "고객 성별 : " + gender);
		System.out.println("고객 전화번호 : " + phone);
		System.out.println("고객 포인트 : " + point);
		System.out.println( "고객 특이사항 : " + etc );
		
	}
}
