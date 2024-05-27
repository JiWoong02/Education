package cast.practice;

import java.util.Scanner;

public class CastingSample {
	Scanner sc = new Scanner(System.in);
	
	public void printUnicode() {
		System.out.print("문자를 입력하세요 : ");
		char unicode = sc.next().charAt(0);
		System.out.println(unicode+ " is unicode : " + (int)unicode);
	}
	public void calculatorScore() {
		System.out.print("당신의 국어 점수는 몇 점 인가요? ");
		double kor = sc.nextDouble();
		System.out.print("당신의 영어 점수는 몇 점 인가요? ");
		double eng = sc.nextDouble();
		System.out.print("당신의 수학 점수는 몇 점 인가요? ");
		double mat = sc.nextDouble();
		System.out.println("총점 : " + (kor + eng + mat));
		System.out.println("평균 : " + ((kor + eng + mat)/2));
	}
	public void printBitCount() {
		
		
	}
	
}
