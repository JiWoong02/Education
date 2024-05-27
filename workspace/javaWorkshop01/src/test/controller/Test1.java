package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 100 사이의 정수를 입력해 주세요.");
		int a = sc.nextInt();
		if (a <= 100 && a >= 0) {
			System.out.println(((a%2)==0)?"2의 배수입니다.":"2의 배수가 아닙니다.");
		} else {
			System.out.println("1부터 100사이의 정수를 입력해 주세요.");
		}

	}

}
