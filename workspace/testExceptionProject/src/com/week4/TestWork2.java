package com.week4;

public class TestWork2 {

	public static void main(String[] args) {
		String str = "J a v a P r o g r a m";
		System.out.println("토큰 처리전 글자 출력 : "+str);
		System.out.println("전 글자갯수 출력 : " + str.length());
		String[] strArray = str.split(" ");
		char [] chArray = new char[strArray.length];
		for(int i=0;i<strArray.length;i++) {
			chArray[i]=strArray[i].charAt(0);
		}
		System.out.println("토큰 처리 후 글자갯수 출력 확인 : "+ chArray.length);
		for(int i=0;i<chArray.length;i++) {
			System.out.print(chArray[i]);
		}System.out.println();
		str = String.valueOf(chArray);
		System.out.println(str.toUpperCase());
	}

}
