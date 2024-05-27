package com.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class NumberOk {

	static int answer;

	public static void main(String[] args) {
//		main 메서드 : 임의의 난수(1~100사이의 정수)를 발생시켜
//	    키보드로 입력된 값과 비교하여, 임의의 정수를 
//	    알아 맞히는 프로그램
		Random r = new Random();
		NumberOk no = new NumberOk();
		Scanner sc = new Scanner(System.in);
		answer = r.nextInt(100);
		String str = " ";
		int num = 0;
		int count = 0;
		char ans = '0';
		do {
			num = no.getNumber();
			count++;
			if (no.questionNumber(num) == -1) {
				System.out.println("작다.");
			} else if (no.questionNumber(num) == 1) {
				System.out.println("크다.");
			} else {
				System.out.println("맞았습니다." + count);
				System.out.print("계속 하시겠습니까?(y/n) : ");
				ans = sc.next().charAt(0);
				if (ans == 'n') {
					break;
				}
				{
					answer = r.nextInt(100);
					count = 0;
				}
			}
		} while (true);
	}

	public int getNumber() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		try {
			System.out.println("1부터 100사이의 숫자를 입력해주세요. :");
			String str = br.readLine();
			num = Integer.parseInt(str);
			return num;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}

	public int questionNumber(int num) {
		return answer == num ? 0 : num > answer ? -1 : 1;
	}

}
