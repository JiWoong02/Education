package array.algorithm;

import java.util.Random;

public class ArrayAlgorithm {
	// swap 공식 : 두 변수 방의 값을 교환하는 것(바꾸는 것)
	public void swap() {
		int a = 12, b = 23;
		System.out.println("before a : " + a + ", b : " + b);

		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("after : a " + a + ", b : " + b);
	}

	public void shuffle() {
		// 배열공간의 기록된 값들을 섞기 처리
		int[] ar = new int[20];
		Random r = new Random();
		// 1부터 45까지의 값들을 기록 처리
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(45) + 1;
		}

		// 출력 확인
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "  ");
		}
		System.out.println();

		// 100번을 0번째 값과 임의의 순번방의 값을 바꾸기함
		for (int count = 1; count <= 100; count++) {
			// 임의의 순번방
			int index = r.nextInt(ar.length); // 20 : 0 ~19

			int temp = ar[0]; // 새로운 변수에 0번자리 값을 넣어놓음
			ar[0] = ar[index]; // 랜덤으로 뽑힌 자리의 수와 0번자리 수를 바꿈
			ar[index] = temp; // 바뀐자리의 수에 원래 0번자리의 수를 넣음
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "  ");
		}
		System.out.println();

	}

	// 중복 발생값 기록 안되게 처리
	public void setInit() {
		// 1부터 100사이의 임의의 정수를 10개 중복되지 않게 배열에 기록 처리
		Random r = new Random();
		int[] ar = new int[10];
		// 중복되지 않게 값 기록
		for (int i = 0; i < ar.length; i++) {
			ar[i] = r.nextInt(100) + 1;
			// 중복 확인 검사
			for (int j = 0; j < i; j++) {
				if (ar[i] == ar[j]) {
					i--;// break 하기전에 하나를 줄임, 현재 위치에 다시 값을 기록하기 위해, 증감식으로 가기전에 인덱스 1줄임
					break;
				}
			}
		} // 출력확인
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "  ");
		}
		System.out.println();
		
		//10개 정수 오름차순정렬
		selectSortAscending(ar);
		System.out.print("오름차순 정렬 결과 : ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "  ");
		}
		System.out.println();
		//10개 정수 내림차순 정렬
		selectSortDescending(ar);
		System.out.print("내림차순 정렬 결과 : ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "  ");
		}
		System.out.println();
		
	}

	// select sort 방식으로 오름차순 정렬 처리
	// Ascending : 작은 값에서 큰 값 순으로 재배치하는 것
	// 숫자의 경우, 1234순으로, 문자의 경우는 abcd 순으로, 가나다라 순 정렬
	public void selectSortAscending(int[] ar) {
		for (int step = 0; step < ar.length - 1; step++) {
			for (int i = step + 1; i < ar.length; i++) {
				if (ar[step] > ar[i])
					intSwap(ar, step, i);
			}
		}
	}

	// select sort 방식으로 내림차순 정렬 처리
	// Descending : 큰 값에서 작은 값 순으로 재배치하는 것
	// 숫자는 9876 순으로, 문자의 경우는 zyx 순으로, 하파타 순
	public void selectSortDescending(int[] ar) {
		for (int step = 0; step < ar.length - 1; step++) {
			for (int i = step + 1; i < ar.length; i++) {
				if (ar[step] < ar[i])
					intSwap(ar, step, i);
			}
		}

	}

	// 배열 공간의 값들을 교환하는 메소드
	public void intSwap(int[] ar, int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
}
