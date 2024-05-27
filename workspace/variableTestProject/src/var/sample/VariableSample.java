package var.sample;
//메인이 없으므로 기능만 제공하는 클래스 main method가 없음
public class VariableSample {

	//멤버함수 (method) == 기능
	//접근제한자 [예약어] 반환자료형 메소드명([자료형 매개변수명 or 빈 공간 선택]){  기능에 대한 처리내용 코드 작성}   
	//void 반환자료 없다는 뜻
	//[] 대괄호는 안을 빈공간으로 해도 되고 써도 된다는 의미이다.
	public void makeVariable() {
		/* 1. 변수 선언 : 메모리(RAM)에 값(DATA)을 기록할 방 (공간)을 만드는 것
		 * 자료형 변수명;
		 * 자료형(DATA TYPE :  값의 종류) : 값을 구분하기 위한 단어
		 * 자료형은 기본 자료형(Primitive Type)과 참조 자료형(Reference Type)이 구분됨
		 * 기본자료형은 boolean, byte, short, int, long, float, double, char 8개가 제공됨
		 * 변수명은 네이밍 룰에 맞춰서 임의대로 지어주면 됨
		 */
		boolean flag; // 1 or 0 한 개만 기록하면 되는데 왜 boolean은 1비트가 아닌 1바이트 인가? 컴퓨터가 값을 다루는 최소 단위 1바이트
		byte bnum; //1바이트 방, 정수 숫자만 기록가능 
		short snum;//2바이트 방
		int score;//4바이트 정수만
		long pay;
		float area;//4바이트 실수형
		double perimeter;//8바이트 실수형
		char grade;//글자 "하나" 기록 2바이트
		//bnum snum같은 변수명은 권장하지 않는다.
		
		
		/*2. 준비된 변수 방에 cpu가 사용할 값을 기록해 넣음
		 * 대입연산자 = 사용함
		 * 변수명 = 기록할 값; 또는 변수명 = 계산식;
		 * 변수 선언식 사용된 자료형에 해당되는 값만 변수에 기록할 수 있음
		 */
		flag = false; //참(true), 거짓(false)
		bnum = 100; // 1byte : -128 ~ 127
		snum = 12345; // 2byte : -2의 15승 -32768 ~ 32767
		score = 95; // 4byte : -2의 31승 -2147483648 ~ 2147483647
		pay = 5000000000L; //8byte : -2의 63승 long형에 해당하는 정수값을 표시할 때는 뒤에 대문자 L을 붙일 것
		area = 34.5f; //4byte : 소숫점 아래 7째자리까지 취급함, float 형 실수 값뒤에는 반드시 f 를 표기해야 함
		perimeter = 250d; //8byte : 정밀도가 15째자리까지 취급함 , 기본은 인트로 들어가지만 더블로 변환되어 들어감 250.0으로 기록, d를 붙여도 됨 (생략가능)
		grade = 'A' ; //문자 하나를 표기할 때는 반드시 작은 따옴표 '
		
		/*3. 값 사용 : 값이 기록된 변수명을 코드 구문으로 사용하면, 변수방 안의 값을 읽어감*/
		System.out.println("flag : " + flag);// print ln -> 프린트하고 자동으로 줄 바꿈
		System.out.println("bnum :" + bnum);
		System.out.println("snum :" + snum);
		System.out.println("score :" + score);
		System.out.println("pay :" + pay);
		System.out.println("area :" + area);
		System.out.println("perimeter :" + perimeter);
		System.out.println("grade :" + grade); // main 메소드가 아니기에 실행할 수 없다
	}
}
