package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// 키보드로 2개의 정수형 데이터를 입력 받아, 
		//두 수가 모두 1부터 9까지의 수일 때만 두 수의 곱
		//이 한자리 수인지 두자리 수인지를 출력한다. 
		//함수 안에서 모든 코드 작업 진행
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 9사이의 첫 번째 정수를 입력해주세요.");
		int first = sc.nextInt();
		if (first > 9 || first < 1) {
			System.out.println("1부터 9사이의 숫자를 입력해주세요.");
		} else {
			System.out.println("1부터 9사이의 두 번째 정수를 입력해주세요.");
			int second = sc.nextInt();
			if (second > 9 || second < 1) {
				System.out.println("1부터 9사이의 숫자를 입력해주세요.");
			} else {
				String str = String.valueOf(first*second);
				if(str.length()==1) {
					System.out.println("한자리 수 입니다.");
				}else {
					System.out.println("두자리 수 입니다.");
				}
			}
		}
	}

}
