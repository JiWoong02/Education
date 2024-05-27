package oop.staticmethod;

public class TestStaticMethod {

	public static void main(String[] args) {
		// static method 사용 테스트
		
		// static 이 붙은 필드나 메소드는 main 이 시작될 때 자동으로 static 메모리에 할당됨
		System.out.println("StaticMethod 클래스의 value 필드값 확인 : " + StaticMethod.getValue());
		
		StaticMethod.setValue("apple");
		System.out.println("StaticMethod 클래스의 value 필드값 확인 : " + StaticMethod.getValue());
		
		//1.
		StaticMethod.toUpper();
		System.out.println("StaticMethod 클래스의 value 필드값 확인 : " + StaticMethod.getValue());
		
		//2.
		StaticMethod.setChar(3, 't');
		System.out.println("StaticMethod 클래스의 value 필드값 확인 : " + StaticMethod.getValue());
		
		//3.
		//int length = StaticMethod.valueLength();
		//System.out.println("글자갯수 : " + length);
		System.out.println("글자갯수 : " + StaticMethod.valueLength());
		
		//4.
		//String result = StaticMethod.valueConcat(" banana");
		//System.out.println("결과 : " + result);
		System.out.println("결과 : " + StaticMethod.valueConcat(" banana"));
	}

}







