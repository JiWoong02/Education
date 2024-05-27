package oop.method;

import java.util.Scanner;

public class TestNonStaticSample2 {

	public static void main(String[] args) {
		// non-static method 사용 테스트2
		NonStaticSample samp = new NonStaticSample();

		int[] mainAr = samp.intArrayAlloc(5);
		samp.display(mainAr);
		samp.sortDescending(mainAr);
		samp.display(mainAr);
		samp.sortAscending(mainAr);
		samp.display(mainAr);

		// 키보드로 문자열과 문자를 입력받아, countChar() 메소드로 넘겨
		// 카운트 결과를 받아 출력확인함
		Scanner scan = new Scanner(System.in);
		/*
		 * System.out.print("문자열 입력 : "); String s = scan.next();
		 * System.out.print("문자 하나 입력 : "); char c = scan.next().charAt(0);
		 * 
		 * int count = samp.countChar(s, c);
		 * 
		 * System.out.println(s + "에 포함된 " + c + "문자의 갯수 : " + count);
		 */

		// 키보드로 정수 두 개를 입력받아, totalValue() 메소드로 넘기고
		// 결과 받아 출력 확인함
//		System.out.print("첫번째 정수 : ");
//		int first = scan.nextInt();
//		System.out.print("두번째 정수 : ");
//		int second = scan.nextInt();
//
//		int total = samp.totalValue(first, second);
//
//		System.out.println("리턴된 합계 : " + total);

	}

}
