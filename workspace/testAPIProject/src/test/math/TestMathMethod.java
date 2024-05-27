package test.math;

//사용할 클래스의 모든 멤버(필드, 메소드)가 static 일 때는 
import static java.lang.Math.*;
//import static 패키지명.클래스명.정적메소드명;

public class TestMathMethod {

	public static void main(String[] args) {
		// java.lang.Math 클래스 사용 테스트
		
		// 상수 필드
//		System.out.println(Math.PI);
//		System.out.println(Math.E);
		//import static 이 선언된 경우에는 상수필드나 메소드 앞에 클래스명. 표기하지 않는다.
		System.out.println(PI);
		System.out.println(E);
		
		//메소드
		System.out.println("-12.3의 절대값 : "+ abs(-12.3));
	}

}
