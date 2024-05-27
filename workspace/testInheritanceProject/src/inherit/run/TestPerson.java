package inherit.run;

import inherit.model.dto.Person;

public class TestPerson {

	public static void main(String[] args) {
		// overriding method test
		Person p1 = new Person();
		Person p2 = new Person("홍길동", 30, '남',"hong66@test.org", "010-1234-5678");
		
		//toString() 사용 테스트
		
		System.out.println("p1 : " + p1.toString());
		System.out.println("p2 : " + p2.toString());
		
		System.out.println("p1 : " + p1); //print 시에 .toString 은 생략해도 된다.
		System.out.println("p2 : " + p2);
		
		//equals() 사용
		Person p3 = p2;
		System.out.println("주소 비교 : " + (p2 == p3));  //true
		
		Person p4 = (Person)p2.clone();  //실행시 동적 바인딩(dynamic binding) 됨
		System.out.println("주소 비교 : " + (p2==p4));   //false		
		System.out.println("두 객체의 필드값들이 모두 일치하는지 확인 : "+p2.equals(p4));  //true
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
