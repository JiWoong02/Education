package logic.home.model;

public class BreakSample {

	public void sumBreak() {
		// 1~100까지 정수들의 합계 출력하기(break문 사용)
		int sum = 0;
		for(int i=1;;i++) {
			sum += i;
			if(i==100) {
				break;
			}
		}System.out.println("1부터 100까지의 합 : " + sum);
	}

	public void guguDanBreak() {
		// 구구단 1단~9단까지 출력하되, * 5 계산에서 반복문 빠지기(break 이름 사용)
		for(int dan=1;dan<10;dan++) {
			for(int su=1;su<10;su++) {
				if(su==5) {
					break;
				}
				System.out.println(dan + " * " + su + " = "+ dan*su);
			}
			System.out.println("-------------------------------------");
		}
	}

}
