package com.loop;

import java.util.Scanner;

public class ForWhile {
	Scanner sc = new Scanner(System.in);

	public void printStar1() {
		System.out.print("정수를 하나 입력해주세요. : ");
		int num = sc.nextInt();
		System.out.println("정수 하나 입력 : " + num);
		if (num > 0) {
			for (int k = 1; k <= num; k++) {
				for (int i = 1; i <= num; i++) {
					if (i == k) {
						System.out.print(i);
						break;
					} else {
						System.out.print('*');
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}

	public void printStar2() {
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		System.out.println("정수 입력 : " + num);
		if (num > 0) {
			for (int k = 1; k <= num; k++) {
				for (int i = 1; i <= k; i++) {
					System.out.print('*');
				}
				System.out.println();
			}

		} else if (num == 0) {
			System.out.println("출력 기능이 없습니다.");
		} else {
			for (int line = 1; line <= -num; line++) {
				for (int i = 1; i <= -num; i++) {
					if (i <= line - 1) {
						System.out.print(' ');
					} else
						System.out.print('*');
				}
				System.out.println();
			}
		}
	}
}
