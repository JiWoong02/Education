package two.array;

import java.util.Scanner;

public class TwoArraySample {
	// 2차원배열 기능 제공용

	public void testTwoArray() {
		// 배열 선언과 할당시에 배열기호[]가 한 개 사용 : 1차원배열
		// 1차원배열 : 자료형이 같은 변수들의 묶음
		// 자료형이 같은 1차원배열들의 묶음 : 2차원배열
		// 배열 선언과 할당시에 배열기호 [][] 두 개 사용

//		int[] ar = {10, 20, 30};
//		int[] br = {11, 22, 33};
//		int[] cr = {15, 25, 35};

		int[][] tar = { { 10, 20, 30 }, { 11, 22, 33 }, { 15, 25, 35 } }; // 3행 3열 정변배열
		// int[] tar[] = {{10, 20, 30},{11, 22, 33},{15,25, 35}};
		// int tar[][] = {{10, 20, 30},{11, 22, 33},{15,25, 35}};

		System.out.println("행갯수 : " + tar.length + " 행"); // 3행

		for (int i = 0; i < tar.length; i++) {
			System.out.println(i + "행이 참조하는 1차원배열의 방갯수 : " + tar[i].length + " 열"); // 각 행별 열갯수(1차원 배열의 방갯수)
		}

		// 모든 값 출력 처리 : 테이블 구조로 주로 표현함 (3행3열 => 3줄 3칸)
		for (int row = 0; row < tar.length; row++) { // 행반복 : 0행, 1행, 2행
			// 각 행별 열 반복 처리
			for (int column = 0; column < tar[row].length; column++) {
				System.out.print(tar[row][column] + "   ");
			} // inner for
			System.out.println(); // 각 행 끝나고 줄바꿈
		} // outer for
	} // method

	public void testTwoArray2() {
		// 2차원배열 선언 : 배열 레퍼런스(주소저장용)변수 만들기
		// 자료형[][] 배열명;|| 자료형[] 배열[];|| 자료형 배열명 [][];
		int[][] tar; // 지역변수 : stack 메모리에 할당됨

		// 2차원배열의 첫번째 new 할당은 레퍼런스(주소)변수들의 배열할당이다.
		tar = new int[3][]; // 열의 갯수는 생략할 수 있음
		// 2차원배열의 두번째 new 할당은 1차원배열 공간 할당이다.
		tar[0] = new int[5];
		tar[1] = new int[7];
		tar[2] = new int[3];
		// 자바는 2차원배열이 참조하는 1차원배열들의 값(방) 갯수가 달라도 됨 : 가변배열이라고 함

		System.out.println("tar.lenth : " + tar.length + "행");

		for (int i = 0; i < tar.length; i++) {
			System.out.println(i + "행이 참조하는 1차원 배열의 방갯수 : " + tar[i].length + "열");
		}
		// 모든 값 출력 처리 : 테이블 구조로 주로 표현함 (3행3열 => 3줄 3칸)
		for (int row = 0; row < tar.length; row++) { // 행반복 : 0행, 1행, 2행
			// 각 행별 열 반복 처리
			for (int column = 0; column < tar[row].length; column++) {
				System.out.print(tar[row][column] + "   ");
			} // inner for
			System.out.println(); // 각 행 끝나고 줄바꿈
		} // outer for
	} // method

	public void testTwoArray3() {
		// 정변배열 : 각 행별 열 갯수가 같은(동일한) 배열
		int[][] tar = new int[5][3];

		for (int row = 0; row < tar.length; row++) {
			System.out.print(row + "행 : ");
			for (int line = 0; line < tar[row].length; line++) {
				tar[row][line] = line + 1; // 1, 2, 3 순으로 기록함
				System.out.print(tar[row][line] + "  ");
			}
			System.out.println();
		} // out for
	}// method

	public void testTwoArray4() {
		// 가변배열 : 행이 참조하는 1차원배열의 갯수가 다를 때
		int[][] tar = new int[3][];
		// 위의 선언은 heap 메모리에 주소 기록할 레퍼런스 3개를 배열로 할당함

		tar[0] = new int[5];
		tar[1] = new int[3];
		tar[2] = new int[7];
		for (int row = 0; row < tar.length; row++) {
			System.out.print(row + "행 : ");
			for (int line = 0; line < tar[row].length; line++) {
				tar[row][line] = line + 1; // 1, 2, 3 순으로 기록함
				System.out.print(tar[row][line] + "  ");
			}
			System.out.println();
		} // out for

	}

	public void munjae1() {
		int[][] tar = new int[4][4];
		for (int row = 0; row < tar.length; row++) {
			if (row < 3) {
				for (int line = 0; line < tar[row].length; line++) {
					if (line < 3) {
						tar[row][line] = (int) (Math.random() * 100) + 1;
						System.out.print(tar[row][line] + "   ");
					} else {
						tar[row][line] = tar[row][0] + tar[row][1] + tar[row][2];
						System.out.print(tar[row][line] + "   ");
					}
				}
				System.out.println();
			} else {
				for (int line = 0; line < tar[row].length; line++) {
					if (line < 3) {
						tar[row][line] = tar[0][line] + tar[1][line] + tar[2][line];
						System.out.print(tar[row][line] + "   ");
					} else {
						tar[row][line] = tar[row][0] + tar[row][1] + tar[row][2];
						System.out.print(tar[row][line] + "   ");
					}
				}
				System.out.println();
			}
		}
	}

	public void munjae2() {
		System.out.print("원하는 열 갯수를 입력해 주세요 : ");
		int num = new Scanner(System.in).nextInt() + 1;
		int[][] tar = new int[3][num];
		for (int i = 0; i < tar.length; i++) {
			for (int j = 0; j < tar[i].length; j++) {
				if (j == tar[i].length - 1) {
					for (int k = 0; k < j; k++) {
						tar[i][j] += tar[i][k];
					}
					// System.out.print(tar[i][j]+" ");
				} else {
					tar[i][j] = (int) (Math.random() * 100) + 1;
					// System.out.print(tar[i][j]+" ");
				}
			} // System.out.println();
		}
		for (int i = 0; i < tar.length; i++) {
			if (tar[i][num - 1] % 5 == 0) {
				System.out.print(i + "행 : ");
				for (int j = 0; j < tar[i].length; j++) {
					if (j == tar[i].length - 1) {
						System.out.print("    합계 : " + tar[i][j]);
					} else {
						System.out.print(tar[i][j] + "  ");
					}
				}
				System.out.println();
			} else {
				System.out.println(i + "행은 합이 5의 배수가 아닙니다.");
			}
		}
	}

	public void munjae4() {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[7][7];
		// 0열 : 학생번호, 1열 : 국어점수, 2열 : 수학점수 , 3열 : 영어점수, 4열 : 총점, 5열 : 평균, 6열 : 등수
		// 0열~4열은 입력받음 총점과 평균은 입력과 동시에 계산처리해서 기록
		// 6행 1열 : 국어 전체 평균, 2열 수학 전체 평균, 3열 영어 잔체 평균 => 세로열 합계/6
		// 6명의 평균을 가지고 등수처리 => 자신을 1등으로 지정함 다른 학생들의 평균값과 자신의 평균을 비교함 자신의 평균값이 크면 등수 1증가
		// 각행별 열의 모든값들을 출력함
		for (int i = 0; i < score.length-1; i++) {
			System.out.print("학생번호를 입력해 주세요 : ");
			score[i][0] = sc.nextInt();
			System.out.print("국어점수를 입력해 주세요 : ");
			score[i][1] = sc.nextInt();
			System.out.print("수학점수를 입력해 주세요 : ");
			score[i][2] = sc.nextInt();
			System.out.print("영어점수를 입력해 주세요 : ");
			score[i][3] = sc.nextInt();
			score[i][4] = score[i][1] + score[i][2] + score[i][3];
			score[i][5] = score[i][4] / 3;
			score[i][6] = 1;
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (score[i][5] < score[j][5]) {
					score[i][6]++;
				}
			}
		}//등수처리
		score[6][1] = (score[0][1] +score[1][1] +score[2][1] +score[3][1] +score[4][1] +score[5][1])/6; //국어 평균
		score[6][2] = (score[0][2] +score[1][2] +score[2][2] +score[3][2] +score[4][2] +score[5][2])/6; //수학 평균
		score[6][3] = (score[0][3] +score[1][3] +score[2][3] +score[3][3] +score[4][3] +score[5][3])/6; //영어 평균
		
		//출력구문
		System.out.printf("%4s%4s%4s%4s%4s%4s%4s \n", "번호", "국어", "영어","수학","총점","평균","등수");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%7d",score[i][j]);
			}System.out.println();
		}

	}
}
// class
