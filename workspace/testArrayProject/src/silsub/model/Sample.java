package silsub.model;

import java.util.Scanner;

/**
 * 2차원 배열 실습문제 풀이용 클래스이다. 3개의 문제를 3개의 메소드로 작성해서 제공하고 있다.
 */

public class Sample {
	/**
	 * 문제 실행시 사용할 키보드 입력용 필드이다.
	 */
	private Scanner sc = new Scanner(System.in);

	/**
	 * 
	 * \Sample 클래스의 기본 생성자이다.
	 */
	public Sample() {
	}

	/**
	 * 1. 4행4열 2차원배열 선언 및 생성 2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음 3. 아래의 내용처럼
	 * 처리함 0열 1열 2열 3열 0행 값 값 값 0행 값들의 합계 1행 값 값 값 1행 값들의 합계 2행 값 값 값 2행 값들의 합계 3행
	 * 0열합계 1열합계 2열합계 가로+세로합계
	 */
	public void munjae1() {
		int[][] matrix = new int[4][4];
		// 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = (int) (Math.random() * 100) + 1;
			}
		}
		// 가로 행 합계, 세로 열 합계, 총합계 : 가로합 + 세로합
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix[i].length - 1; j++) {
				matrix[i][3] += matrix[i][j]; // 가로합계
				matrix[3][i] += matrix[j][i]; // 세로합계
			}
			matrix[3][3] += matrix[i][3] + matrix[3][i];
		}
		// 출력 확인
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%7d", matrix[i][j]);// 포맷을 이용해서 8진수 16진수 형태로 출력가능
														// %7d : 7칸차지하는 10진수로 출력해라
			}
			System.out.println();
		}
	}

	public void munjae1_1() {
		int[][] matrix = new int[4][4];
		// 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = (int) (Math.random() * 100) + 1;
				matrix[i][3] += matrix[i][j]; // 가로합계
				matrix[3][j] += matrix[i][j]; // 세로합계
				matrix[3][3] += matrix[i][j] * 2; // 총합계 : 가로합 + 세로합
			}
		}

		// 출력 확인
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%7d", matrix[i][j]);// 포맷을 이용해서 8진수 16진수 형태로 출력가능
														// %7d : 7칸차지하는 10진수로 출력해라
			}
			System.out.println();
		}
	}// munjae 1_1

	/**
	 * 1. 3행짜리 2차원배열 선언 및 생성 2. 각 행별 열갯수는 키보드로 입력받아 생성함 3. 1~100사이의 임의의 정수를 모든 방에
	 * 기록함 4. 각 행별 열의 합계가 5의 배수인 행열값만 출력함
	 */
	public void munjae2() {
		int[][] tar = new int[3][];
		int[] sum = new int[3];
		for (int i = 0; i < tar.length; i++) {
			System.out.print(i + "행의 열갯수 : ");
			tar[i]=new int[sc.nextInt()];
			//1~100사이의 정수 기록
			for(int j=0; j< tar[i].length; j++) {
				tar[i][j] = (int)(Math.random()*100)+1;
				sum[i] += tar[i][j];
			}
		}
		
		//각 행별 열의 합계가 5의 배수인 행열값만 출력함
		for(int i =0; i < tar.length; i++) {
			if(sum[i]%5==0) {
				System.out.print(i + "행 : ");
				for(int j=0; j<tar[i].length; j++) {
					System.out.printf("%-7d", tar[i][j]);
				}
				System.out.println(i + "행 합계 : " + sum[i]);
			}
		}
	}
}
