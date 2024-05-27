package my.exception;

public class TestCalculator {

	public static void main(String[] args) {
		// 사용자 정의 예외클래스 테스트
		Calculator calc = new Calculator();
		
		try {
			System.out.println("더하기 결과 : "+calc.sum(23, 55));
//			System.out.println("더하기 결과 : "+calc.sum(23, -55));
			
			System.out.println("나누기 결과 : " + calc.devide(23, 5));
//			System.out.println("나누기 결과 : " + calc.devide(23, 0));
		} catch (MyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (NotDivideZeroException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}
