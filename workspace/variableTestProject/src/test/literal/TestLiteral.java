package test.literal;

public class TestLiteral {

	public static void main(String[] args) {
		// 값(Literal)과 접미어, 접두어 테스트
		
		//정수 리터럴은 십진수, 팔진수, 16진수로 표현할 수 있음
		int num1 = 100; //십진수 백을 뜻함
		int num2 = 0100; //8진수 일공공을 뜻함
		int num3 = 0x100; // 16진수 일공공을 뜻함
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);

		float fnum = 3.14f;
		double dnum = 4.56d; //부동소수점형 표기
		double dnum2 = 3.14e3; //지수형(과학용) 표기 3140
		double dnum3 = 3.14e-3; //0.00314
		
		System.out.println("fnum : " + fnum);
		System.out.println("dnum : " + dnum);
		System.out.println("dnum2 : " + dnum2);
		System.out.println("dnum3 : " + dnum3);
		
		char ch1 = 'B';
		char ch2 = '\u0049'; //16진수 네자리로 유니코드 숫자 표시함 즉, 유니코드 73
		char ch3 = '\t'; // '\t'는 tab 키를 뜻함, '\b' : backspace 키, '\r' : home 키
		//'\n' : new line (enter 키)
		
		System.out.println(ch1 + "," + ch3 + "," + ch2);
		
		//문자열과 숫자를 + 하면 문자열 합치기가 된다.
		System.out.println("7" + 7); //77
		System.out.println("" +  7 + 7);//77
		System.out.println(7 + 7 + "");//14
		
		//정수는 계산과정에서 자료형 범위를 초과하는 결과가 나오면 오버플로우 처리됨
		byte b = 127;		//byte : -128 ~ 127
		b = (byte)(b + 1); //자바에서 byte 와 short 자료형 연산의 결과는 무조건 int로 정해놓음
		System.out.println(b);
	}

}