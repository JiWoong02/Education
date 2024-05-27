package com.loop;

import java.util.Scanner;

public class WhileTest {
	public void countInputCharacter() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		int count=0, index;
		for (index=0; index<str.length(); index++) {
			char c = str.charAt(index);
			
			if(!((c>='a'&&ch<='z')||(c>='A'&&ch<='Z'))) {
				System.out.println("영문자가 아닙니다.");
				break;
			}
			
			if(c==ch) {count++;}
		}
		if(index== str.length()) {
		System.out.println("문자열 입력 : " + str);
		System.out.println("문자 입력 : " + ch);
		System.out.println("포함된 갯수 : " + count);
		}
	}
}
