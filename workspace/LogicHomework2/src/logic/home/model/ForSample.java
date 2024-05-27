package logic.home.model;

import java.util.Scanner;

public class ForSample {
	static Scanner sc = new Scanner(System.in);

	public void sum1To10() {
		// 1~10까지 정수들의 합계 구하기
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i + " + ");
			if (i == 10) {
				System.out.println(i + " = " + sum);
			}
		}
	}

	public void sumEven1To100() {
		// 1~100사이의 짝수들의 합게 구하기
		int sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
			System.out.print(i + " + ");
			if (i == 100) {
				System.out.println(i + " = " + sum);
			}
		}
	}

	public void oneGugudan() {
		// 정수 하나 입력받아, 그 수의 구구단 출력하기
		System.out.print("정수를 입력해 주세요 : ");
		int num = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}

	}

	public void sumMinToMax() {
		// 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기
		System.out.print("첫 번째 정수를 입력해 주세요 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수를 입력해 주세요 : ");
		int second = sc.nextInt();
		int min = Math.min(first, second);
		int max = Math.max(first, second);
		int sum = 0;
		for (int i = min; i <= max; i++) {
			sum += i;
			if (i != max) {
				System.out.print(i + " + ");
			} else
				System.out.print(i + " = " + sum);
		}
	}

	// 6~9까지라면 6+7+8+9 min+0 + min+1 + min +2 + min + (max-min) }

	public void printStar() {
		// 줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표문자 출력하기
		System.out.print("줄 수를 입력해 주세요 : ");
		int height = sc.nextInt();
		System.out.print("칸 수를 입력해 주세요 : ");
		int length = sc.nextInt();

		for (int line = 1; line <= height; line++) {
			for (int i = 1; i <= length; i++) {
				System.out.print('*');
				if (i == length) {
					System.out.println();
				}
			}
		}

	}

	public void printNumberStar() {
		// 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기
		for (int line = 1; line <= 7; line++) {
			for (int i = 1; i <= 7; i++) {
				if (i == line) {
					System.out.print(i);
				}
				{
					System.out.print('*');
				}
				if (i == 7) {
					System.out.println();
				}
			}
		}

	}

	public void printTriangleStar() {
		// 줄수를 입력받아, 삼각형 모양으로 별표문자 출력하기(양수:직각삼각형, 음수:역삼각형)
		System.out.print("줄 수를 입력해 주세요 : ");
		int line = sc.nextInt();
		if (line > 0) {
			for (int i = 1; i <= line; i++) {
				for (int k = 1; k <= i; k++) {
					System.out.print('*');
				}
				System.out.println();
			}
		} else {
			line = -line;
			for (int i = 1; i <= line; i++) {
				for (int k = line - i; k >= 0; k--) {
					System.out.print('*');
				}
				System.out.println();
			}

		}

	}

	public void guguDan() {
		// 구구단 2단부터 9단까지 출력하기
		for (int dan = 2; dan < 10; dan++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);
			}
			System.out.println("----------------------------------------------");
		}

	}

}
