package test.method;

public class TestNonStaticSample {

	public static void main(String[] args) {
		// non-static method 실습문제 실행 테스트
		NonStaticSample test = new NonStaticSample();
		
		//1.
		test.printLottoNumbers();
		//2.
		test.outputChar(7, '★');
		//3.
		//char ch = test.alphabette();
		//System.out.print("리턴된 알파벳 문자 : " + ch);
		System.out.println("리턴된 알파벳 문자 : " + test.alphabette());
		//4.
		//String result = test.mySubstring("yellow banana", 7, 10);
		//System.out.println("리턴된 문자열 : " + result);
		System.out.println("리턴된 문자열 : " + test.mySubstring("yellow banana", 7, 10));

	}

}
