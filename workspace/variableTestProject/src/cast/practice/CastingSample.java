package cast.practice;

import java.util.Scanner;

public class CastingSample {
	
	public void printUniCode() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자입력 :");		
		char word = sc.next().charAt(0);
		
		System.out.println(word + " is unicode : " + (int)word );
					
	}

	public void calculatorScore() {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("국어점수 :");
			double kor = sc.nextDouble();
			
			System.out.print("영어점수 :");
			double eng = sc.nextDouble();
			
			System.out.print("수학점수 :");
			double math = sc.nextDouble();
			
			int total =(int)(kor + eng + math);
			int avg = (int)((kor + eng + math)/3);
			
			System.out.println("총점 : " + total);
			System.out.println("평균 : " + avg);
		}
		
	}
	public void printBitCount() {
		
		try (Scanner sc = new Scanner(System.in)){
		
		System.out.print("정수 입력 :");
		
		int value = sc.nextInt();
		
		System.out.println(value + "의 2진수에 포함된 비트 1의 갯수는 " +
									Integer.bitCount(value) + "개 입니다.");
		
		//static이 붙은 메소드는 클래스명, 메소드명() 으로 사용함
		}
		
	}

}
