package oop.sample;

public class TestPerson2 {

	public static void main(String[] args) {
		// 매개변수 있는 생성자 사용
		Person p1 = new Person("최수종",48,'남');
		Person p2 = new Person("신사임당",50,'여');
		
		p1.display();
		p2.display();
	}
}
