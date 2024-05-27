package oop.method.run;

import oop.method.sample.MethodSample;

public class TestMethodSample {

	public static void main(String[] args) {
		// MethodSample 클래스가 가진 메소드 사용 테스트
		MethodSample test = new MethodSample();
		
		//반환값 없고 매개변수 없는 메소드 사용
		//레퍼런스.메소드();
		test.hi();
		
		//반환값 없고 매개변수 있는 메소드 사용
		//레퍼런스.메소드(전달값);
		test.hello(1);
		test.hello(2);
		test.hello(3);
		test.hello(4);
		
		//반환값 있고 매개변수 없는 메소드 사용
		//자료형 변수 = 레퍼런스.메소드();
		int returnValue = test.randomValue();
		System.out.println("리턴값 확인 : " + returnValue);
		
		//반환값이 있는 메소드는 다른 메소드 안에서 사용할 수 있음
		//값을 사용할 위치에 반환값 있는 메소드를 사용하면 됨
		//  => 반환값을 사용한다는 의미임
		System.out.println("리턴값 확인2 : " + test.randomValue());
		
		//반환값 있고 매개변수도 있는 메소드
		//자료형 변수 = 레퍼런스.메소드(전달값, 전달값, ....);
		int value = test.limitRandom(100, 51);
		System.out.println("value : " + value);
		
		System.out.println("리턴값 : " + test.limitRandom(33, 45));

	}

}












