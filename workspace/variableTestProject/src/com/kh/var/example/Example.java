package com.kh.var.example;

import java.util.Scanner;

public class Example {	public void example1() {
	Scanner sc2 = new Scanner(System.in);
	
	System.out.print("첫 번째 정수를 입력하세요 : ");
	int num1 = sc2.nextInt();
	System.out.print("첫 번째 정수를 입력하세요 : ");
	int num2 = sc2.nextInt();
	
	
	System.out.println("더하기 결과 : " +(num1+num2));
	System.out.println("빼기 결과 : " + (num1-num2));
	System.out.println("곱하기 결과 : " + (num1*num2));
	System.out.println("나누기한 몫 : " + (num1/num2));
	System.out.println("나누기한 나머지 : " + (num1%num2));
}
	public void example2() {
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("가로 값을 입력해 주세요 :");
		double width = sc2.nextDouble();
		System.out.print("세로 값을 입력해 주세요 :");
		double length = sc2.nextDouble();
		
		System.out.println("면적 : " +(width*length));
		System.out.println("둘레 : " + (2*(width+length)));
		
	}
	public void example3() {
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("사과는 영어로?");
		String word = sc2.next();
		System.out.println("첫번째 문자 : " + word.charAt(0));
		System.out.println("두번째 문자 : " + word.charAt(1));
		System.out.println("세번째 문자 : " + word.charAt(2));
		
	}

	}
