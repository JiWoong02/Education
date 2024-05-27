package array;

public class Test10 {

	public static void main(String[] args) {
		// 2차원 배열에 들어있는 데이터들 중
		// 3의 배수만 골라내서 새로운 1차원배열에 기록하고
		// 출력한다. 단 중복 값은 하나만 기록되게 한다.
		int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };
		int[] copyAr = new int[16];
		int index = 0;
		int zeroCount = 0;
		// 3의배수 골라내서 새로운 배열에 넣기
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((array[i][j] % 3) == 0) {
					copyAr[index] = array[i][j];
					index++;
				}
			}
		}
		// 중복 0값으로 처리
		for (int i = 0; i < copyAr.length; i++) {
			for (int j = i + 1; j < copyAr.length - 1; j++) {
				if (copyAr[i] == copyAr[j]) {
					copyAr[j] = 0;
				}
			}
		}
//		 땡기기

		for (int i = 0; i < copyAr.length-1; i++) {
		if(copyAr[i]==0) {
			copyAr[i]=copyAr[i+1];
				copyAr[i+1]=0;
			}
	}
//		0갯수세기
		for (int i = 0; i < copyAr.length; i++) {
		if(copyAr[i]==0) {
			zeroCount++;
			}
	}
		

		// 출력
		System.out.print("copyAr    : ");
		for (int i = 0; i < copyAr.length; i++) {
			if (copyAr[i] != 0) {
				System.out.print(copyAr[i]+"\t");
			}
		}

	}

}
