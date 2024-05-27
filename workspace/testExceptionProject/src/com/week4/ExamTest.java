package com.week4;

import java.util.Scanner;

public class ExamTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExamString es = new ExamString();
		
		System.out.print("문자열을 입력해주세요. : ");
		String str = sc.next();
		System.out.print("문자를 입력해주세요.");
		char ch = sc.next().charAt(0);
		System.out.println("첫글자를 대문자로 바꾼 값 : "+ es.preChar(str));
		System.out.println(str+"에 포함된 "+ ch+"의 갯수 : "+ es.charSu(str, ch));
		
	}

}
