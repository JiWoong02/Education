package logic.home.model;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {

	public void testScanner() {
		// Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int a = sc.nextInt();
		System.out.print("실수를 입력하세요. : ");
		double b = sc.nextDouble();
		System.out.print("문자열 입력하세요. : ");
		String c = sc.next();
		System.out.print("문자를 입력하세요. : ");
		char d = sc.next().charAt(0);
		System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
	}

	public void testDate() {
		// Date 클래스 사용 : 오늘 날짜, 현재 시간 정보 출력하기
		Date dt = new Date();
		Calendar cd = Calendar.getInstance();
		System.out.println(dt);
//		if (dt.getDate() < 10) {
//			System.out.println("오늘 날짜 : " + dt.getMonth() + 1 + "월 " + '0' + dt.getDate + "일");
//		} else {
//			System.out.println("오늘 날짜 : " + dt.getMonth() + 1 + "월 " + dt.getDate + "일");
//		}
//		System.out.println("오늘 날짜 : " + dt.getMonth() + 1 + "월 " + '0' + dt.getDate + "일");
//		System.out.println("현재 시간 : " + dt.getHours() + "시 " + dt.getMinutes() + "분");
		//abstract 미완성이라는 뜻. 미완성은 new 할 수 없음
	}

	public void testRandom() {
		// Random 클래스 사용 : 정수와 실수에 대한 난수 출력하기
		Random rd = new Random();
		System.out.println("정수 난수 : " + rd.nextInt() + "\n실수 난수 : " + rd.nextDouble());
	}

}
