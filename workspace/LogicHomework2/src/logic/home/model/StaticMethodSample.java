package logic.home.model;

public class StaticMethodSample {

	public void testMathRandom() {
		// Math 클래스의 랜덤값 구하는 메소드 : 1~45사이의 임의의 정수 출력
		//(int)(Math.random() * {최대값 - 최소값 +1}) + 최소값
		System.out.println("랜덤값 : " + ((int)(Math.random() *45)+1));
		
	}

	public void testMathAbs() {
		// Math 클래스의 실수값에 대한 절대값 구하는 메소드 : -12.77 절대값 출력하기
		System.out.println("절대값 : " + Math.abs(-12.77));
	}

	public void testMathMax() {
		// Math 클래스의 두 정수중 큰값 구하는 메소드 : 120, 54 중 큰값 출력하기
		System.out.println("120, 54중 큰 값은? : " + Math.max(120, 54));
		
	}

}
