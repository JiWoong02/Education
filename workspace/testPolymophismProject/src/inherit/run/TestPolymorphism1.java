package inherit.run;

import java.util.GregorianCalendar;

import inherit.model.dto.Customer;
import inherit.model.dto.Person;
import inherit.model.dto.Student;

public class TestPolymorphism1 {

	public static void main(String[] args) {
		// 다형성(polymorphism) 테스트
		// 다형성 : 상속을 통해 사용할 수 있는 기술
		// 상속관계에 있는 부모클래스는 후손클래스 객체의 주소를 받을 수 있음

		Person p = null;
		//부모타입의 레퍼런스에 후손 객체의 주소 대입 가능합
		p = new Customer("김철수", 28, '남', "kimchul96@naver.com","010-9876-5432", "경기도 용인시 수지구", 1350.77);
		
		System.out.println(p); //p.toString() 과 같음
		
		Customer c = new Customer("김철수", 28, '남', "kimchul96@naver.com","010-9876-5432", "경기도 용인시 수지구", 1350.77);
		
		p=c;
		
		System.out.println(p);  //p.toString() 과 같음
		
		p = new Student("김철수", 28, '남', "kimchul96@naver.com", "010-9876-3632", 12, "유아교육학과", 4.5);
		
		System.out.println(p);
		
		Object obj = new Person("홍길동", 30, '남',"hong66@test.org", "010-1234-5678");
		System.out.println(obj); //obj.toString()
		
		obj = new Customer("김철수", 28, '남', "kimchul96@naver.com","010-9876-5432", "경기도 용인시 수지구", 1350.77);
		System.out.println(obj);
		
		obj = new String("다형성 확인");
		System.out.println(obj);
		
		obj = new GregorianCalendar();
		System.out.println(obj);
		
		//다형성은 부모가 여러 후손들을 다루는 기술임
		//상속관계가 아닌 클래스간에는 사용할 수 없음
		
//		Customer c = new Student();//error
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
