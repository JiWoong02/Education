package exception.silsub1;

import java.util.Scanner;

public class TestSilsub {

	public static void main(String[] args) {
		TestSilsub ts = new TestSilsub();
		ts.silsub1();
		ts.silsub2();
	}
	public void silsub1() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("문자열을 입력해주세요.");
			String a = sc.nextLine();
			System.out.println("문자열에 포함된 영문자 갯수 : "+new CharacterProcess().countAlpha(a));
		} catch (CharCheckException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public void silsub2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력해 주세요.");
		int first = sc.nextInt();
		System.out.println("두 번째 정수를 입력해 주세요.");
		int second = sc.nextInt();
		
		try {
			String itsTrue = (new NumberProcess().checkDouble(first, second))?"배수이다":"배수가 아니다.";
			System.out.println(first+"는 "+second + " 의 "+itsTrue);	
		}catch(NumberRangeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
