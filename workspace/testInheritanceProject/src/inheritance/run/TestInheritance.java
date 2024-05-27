package inheritance.run;

import inheritance.sample.Shape;

public class TestInheritance {

	public static void main(String[] args) {
		//  상속관계에서의 생성자 호출 구조 테스트
		Shape shape = new Shape();
		
		//상속을 받은 클래스는 부모의 멤버를 자신의 것처럼 사용할 수 있음
		System.out.println(shape.information());

		// 자바로 만든 모든 클래스는 자동으로 java.lang.objedt 의 후손으로 만들어짐
		// 모든 클래스는 Object가 제공하는 메소드를 자신의 것처럼 사용할 수 있음
		System.out.println(shape.hashCode());
		System.out.println(shape.toString());
		
		Shape ref = shape; //주소복사 ( 얕은 복사, Shallow Copy)
		System.out.println(ref == shape); //true
		System.out.println(shape.equals(ref)); //true
		//java.lang.Object 의 레퍼런스.equals(레퍼런스) 는 주소 비교하는 메소드임
		
	}
	

}
