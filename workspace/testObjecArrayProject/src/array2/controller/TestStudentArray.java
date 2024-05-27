package array2.controller;

import java.util.Scanner;

import array2.model.Student;

public class TestStudentArray {

	public static void main(String[] args) {
		// 객체배열실습 문제 2
//		1. 최대 10명의 학생 정보를 기록할 수 있게 배열 할당함
//		2. 학생 정보가 한명씩 추가될 때 마다 카운트함
//			=> while() 문 사용함
//			   계속 추가할 것인지 물어보고, 대소문자 상관없이 'y'이면
//			   계속 객체 추가하고 키보드로 값 입력받아 기록함.
//		3. 키보드로 3명의 학생 정보를 입력받아, 각 객체에 저장함
//		4. 현재 입력된 학생들의 점수의 평균을 구하여 출력함
//		5. 현재 기록된 학생들의 정보를 모두 출력함
		Student[] std = new Student[10];
		Scanner sc = new Scanner(System.in);
		int count = 0, totalScore = 0;
		while (true) {
			System.out.println(count + 1 + "번째 학생의 정보를 입력합니다.");
			std[count] = new Student();
			System.out.print("클래스 (A | B | C) :");
			std[count].setSclass(sc.next().toUpperCase().charAt(0)); // 대문자로 기록 처리
			System.out.println();
			System.out.print("학생의 이름 : ");
			std[count].setSname(sc.next());
			System.out.println();
			System.out.print("점수 : ");
			std[count].setScore(sc.nextInt());
			System.out.println();
			totalScore += std[count].getScore();
			count++;
			System.out.println("계속하시겠습니까?(y | n)");
			if (sc.next().toUpperCase().charAt(0) != 'Y') {
				break;
			}
		} // while
			System.out.println("학생들 점수의 평균 : " + totalScore/count);
			for(int i=0; i<count;i++) {
				System.out.println(std[i].information());
			}
	}// method

}// class
