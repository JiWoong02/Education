package test.input;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
	//키보드 입력 테스트
		TestScanner ts = new TestScanner(); // 클래스 안에 생성자가 없으면 기본생성자가 자동 추가된다.
		ts.testKeyboardInput();
		

	}
	
	//메인 위에 추가 하든 아래 추가하든 똑같다.
	//java.util.Scanner 클래스를 이용한 키보드 입력 테스트용 메소드
	public void testKeyboardInput() {
		//여긴 testKeyboardInput 메소드 영역
		//자바에서 클래스가 제공하는 메소드를 사용하려면
		//클래스명 레퍼런스 = new 클래스생성자();
		//레퍼런스.메소드();
		Scanner sc = new Scanner(System.in); //System input 시스템 기본 입력장치 즉, 키보드로부터 입력받겠다.
		
//		String name;
//		int age;
//		double pay;	
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("급여를 입력하세요 : ");
		double pay = sc.nextDouble();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("급여 : " + pay + "억원");
	}

}
