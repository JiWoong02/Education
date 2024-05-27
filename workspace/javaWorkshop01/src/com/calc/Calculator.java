package com.calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// main의 argument로 1자리 정수형(1부터 9까지만)
		// 값을 2개 입력받아 4칙연산 결과를 출력한다.
		// 입력값은 모두 int 형으로 처리한다.
		// 함수 안에서 모든 코드 작업 진행
		// 두 정수의 합, 차, 곱, 나누기한 몫을
		// 출력한다.
		// 단, 나누는 수(분모)가 0이거나 0보다
		// 작으면 결과는 0 처리한다.
		
		
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		if (first > 9 || first < 1) {
			System.out.println("1부터 9사이의 숫자를 입력해주세요.");
		} else {
			if (second > 9 || second < 1) {
				System.out.println("1부터 9사이의 숫자를 입력해주세요.");
			} else {
				System.out.println("합 : " + (first + second));
				System.out.println("차 : " + (first - second));
				System.out.println("곱 : " + (first * second));
				System.out.println("나누기 : " + (first / second));
			}
		}

	}

}
