package logic.home.model;

import java.util.Scanner;

public class IfSample {
	Scanner sc = new Scanner(System.in);

	public void maxNumber() {
		// 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기
		System.out.print("첫 번째 정수를 입력해 주세요. : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수를 입력해 주세요. : ");
		int second = sc.nextInt();
		System.out
				.println("첫 번째 입력값 : " + first + "\n" + "두 번째 입력값 : " + second + "\n큰 값 : " + Math.max(first, second));

	}

	public void minNumber() {
		// 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기
		System.out.print("첫 번째 정수를 입력해 주세요. : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수를 입력해 주세요. : ");
		int second = sc.nextInt();
		System.out.println(
				"첫 번째 입력값 : " + first + "\n" + "두 번째 입력값 : " + second + "\n" + "작은 값 :" + Math.min(first, second));

	}

	public void threeMaxMin() {
		// 세 개의 정수를 입력받아, 세 수중 가장 큰수와 가장 작은수 출력하기
		System.out.print("첫 번째 정수를 입력해 주세요. : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수를 입력해 주세요. : ");
		int second = sc.nextInt();
		System.out.print("세 번째 정수를 입력해 주세요. : ");
		int third = sc.nextInt();
		int max, min;
		if (first > second) {
			max = Math.max(first, third);
			min = Math.min(second, third);
		} else if (first > third) {
			max = Math.max(first, second);
			min = Math.min(second, third);
		} else {
			max = Math.max(second, third);
			min = first;
		}
		System.out.println("첫 번째 입력값 : " + first + "\n두 번째 입력값 : " + second + "\n세 번째 입력값 : " + third + "\nMAX :" + max
				+ "\nMIN :" + min);
	}

	public void checkEven() {
		// 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기
		System.out.print("정수를 입력해 주세요. : ");
		int first = sc.nextInt();
		if (first < 0) {
			System.out.println("양수로 입력해 주세요.");
		} else {
			if (first % 2 == 0) {
				System.out.println("입력한 수 : " + first + "\n짝수다");
			} else {
				System.out.println("입력한 수 : " + first + "\n홀수다");
			}
		}
	}

	public void isPassFail() {
		// 국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기
		System.out.print("국어점수를 입력해 주세요. : ");
		int kor = sc.nextInt();
		System.out.print("영어점수를 입력해 주세요. : ");
		int eng = sc.nextInt();
		System.out.print("수학점수를 입력해 주세요. : ");
		int mat = sc.nextInt();

		int tot = kor + eng + mat;
		double avg = (double) tot / 3;

		if (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("국어점수 : " + kor + "\n영어점수 : " + eng + "\n수학점수 : " + mat + "\n총점 : " + tot + "\n평균" + avg
					+ "\n축하합니다. 합격입니다!");
		} else {
			System.out.println("국어점수 : " + kor + "\n영어점수 : " + eng + "\n수학점수 : " + mat + "\n총점 : " + tot + "\n평균" + avg
					+ "\n불합격입니다");
		}

	}

	public void scoreGrade() {
		// 점수를 입력받아, 학점 확인하기
		System.out.print("점수를 입력해 주세요. : ");
		int score = sc.nextInt();
		String grade = " ";
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else if (score < 60) {
			grade = "F";
		}
		if (score >= 60) {
			if (Integer.toString(score).charAt(1) >= '8') {
				grade += "+";
			} else if (Integer.toString(score).charAt(0) <= '3') {
				grade += "-";
			} else {
				grade += "0";
			}
		}
		System.out.println("점수 : " + score + "\n학점 : " + grade);

	}

	public void checkPlusMinusZero() {
		// 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기
		System.out.print("정수를 입력해 주세요. : ");
		int first = sc.nextInt();
		String str = " ";
		if (first > 0) {
			str = "양수";
		} else if (first == 0) {
			str = "0";
		} else {
			str = "음수";
		}
		System.out.println("입력하신 숫자 " + first + "은/는 " + str + "입니다.");
	}

	public void whatCaracter() {
		// 문자 하나를 입력받아, 영어대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기
		System.out.print("문자를 하나 입력해주세요. ");
		char ch = sc.next().charAt(0);
		String str = "";
		if (ch >= 'A' && ch <= 'Z') {
			str = "대문자";
		} else if (ch >= 'a' && ch <= 'z') {
			str = "소문자";
		} else if (ch >= '0' && ch <= '9') {
			str = "숫자문자";
		} else {
			str = "기타문자";
		}
		System.out.println("입력하신 문자 " + ch + "은/는 " + str + "입니다.");
	}

}
