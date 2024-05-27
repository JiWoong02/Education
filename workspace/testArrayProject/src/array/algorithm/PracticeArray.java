package array.algorithm;

import java.util.Random;

public class PracticeArray {
		//배열 알고리즘 실습문제
	public void lotto() {
			//1~45사이의 임의의 정수를 중복되지 않게 6개 발생시켜 저장
		Random r = new Random();
			int num [] = new int[6];
			for(int i=0; i<num.length;i++) {
				num[i] = r.nextInt(45) +1;
				for(int j=0;j<i;j++) {
					if(num[j]==num[i]) {
						i--;
						break;
					}
				}
			}
			//오름차순 정렬 처리해서 출력 확인
			
			//출력확인
			for(int i=0; i<num.length;i++) {
				System.out.print(num[i] + "    ");
			}
			lottoAscending(num);
			System.out.println();
			System.out.print("오름차순 정렬 : ");
			for(int i=0; i<num.length;i++) {
				System.out.print(num[i] + "    ");
			}
			lottoDescending(num);
			System.out.println();
			System.out.print("내림차순 정렬 : ");
			for(int i=0; i<num.length;i++) {
				System.out.print(num[i] + "    ");
			}
	}
	public void lottoAscending(int[] as) {
		for(int i =0;i<as.length;i++) {
			for(int j=i+1; j<as.length; j++) {
				if(as[i]>as[j]) {
					numSwap(as, i, j);
				}
			}
		}
		
	}
	public void lottoDescending(int[] as) {
		for(int i =0;i<as.length;i++) {
			for(int j=i+1; j<as.length; j++) {
				if(as[i]<as[j]) {
					numSwap(as, i, j);
				}
			}
		}
	}
	public void numSwap(int[] sw, int a, int b) {
		int temp;
		temp = sw[a];
		sw[a] =sw[b];
		sw[b] = temp;	
	}
}
