package test.controller;

public class Test3 {

	public static void main(String[] args) {
		// 1부터 100까지의 모든 정수들의 합과 평균을 구하는 프로그램을 작성한다. 
		int i =0 ;
		double sum = 0.0;
		while( i != 101) {
			sum += i;
			i++;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/i);
	}

}
