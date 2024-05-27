package practice1;

import java.util.Random;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		Lotto.lottoDisplay();

	}
	public static void lottoDisplay() {
//		1. 1 ~ 45 사이의 정수를 중복되지 않게, 6개 발생시켜
//		2. 자동 오름차순정렬되게 처리하는 Set 계열에 보관하고 
//		3. int[]로 바꾸어 출력함.
		Random r = new Random();
		TreeSet numbers = new TreeSet();
		while(true) {
			numbers.add(r.nextInt(45)+1);
			if(numbers.size()==6) {break;}
		}
		int[] lottoNumber = new int[numbers.size()];
		Object [] objArray = numbers.toArray();
		for(int i=0;i<objArray.length;i++) {
			lottoNumber[i] =(Integer)objArray[i];  //Object => Integer => int : auto unboxing
			System.out.print(lottoNumber[i] + "  ");
		}
		System.out.println();
		
		
	}
}
