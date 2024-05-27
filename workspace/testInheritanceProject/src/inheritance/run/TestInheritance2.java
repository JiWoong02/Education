package inheritance.run;

import inheritance.sample.Shape;

public class TestInheritance2 {

	public static void main(String[] args) {
		// 후손 객체 생성시, 부모 생성자 작동 테스트
		Shape sp1 = new Shape(); //기본생성자
		//부모의 x, y = 0.0, Shape 의 area, perimeter = 0.0 초기화
		Shape sp2 = new Shape(12.5,7.89, 123.45,456.77);
		//부모의 x = 12.5 , y = 7.89, Shape 의 area = 123.45 , perimeter = 456.77 초기화
		
		System.out.println(sp1.information());  //오버라이딩된 Shape 의 information() 이 실행됨
 		System.out.println(sp2.information());  //오버라이딩된 Shape 의 information() 이 실행됨
		
		System.out.println(sp1.toString()); //오버라이딩된 toString() 실행
		System.out.println(sp2.toString()); //오버라이딩된 toString() 실행
		
		System.out.println(sp1); //오버라이딩된 toString() 실행
		System.out.println(sp2); //오버라이딩된 toString() 실행
		
		Shape sp3 = new Shape(sp2);
		System.out.println(sp3.hashCode());
		System.out.println(sp2.hashCode());
		
		System.out.println(sp3);
		System.out.println(sp2);
		
		//equals() 오버라이딩되어 있음 : 각 필드값이 같은지 조회용 변경했음
		System.out.println(sp3.equals(sp2));   //true
		System.out.println(sp3 == sp2); //false  
		
		Shape sp4 = new Shape(10, 10, 100, 200);
		System.out.println(sp4);
		Shape sp5 = (Shape)sp4.clone();  //반환형이 Object 임 => Shape 에 대입 안 됨 (타입이 다름)
		System.out.println(sp5);
		
		System.out.println(sp4==sp5);//레퍼런스 비교는 주소 비교다 .
	}

}
