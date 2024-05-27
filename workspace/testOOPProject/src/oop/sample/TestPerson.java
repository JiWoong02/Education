package oop.sample;

public class TestPerson {

	public static void main(String[] args) {
		// 클래스 사용 => 객체를 만들어서 사용
		// 클래스타입 레퍼런스 = new 생성자(초기값, 초기값, .......);
		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.println("p1이 가진 객체의 주소 : " + p1.hashCode());
		System.out.println("p2이 가진 객체의 주소 : " + p2.hashCode());
		
		//메소드 실행
		//void(반환(return)되는 값 없음)이면서 매개변수 없는 메소드 실행 : 레퍼런스.메소드();
		//실행할 메소드 앞에 레퍼런스. 을 표기하는 이유 : 메소드 안에 this 에게 주소 전달하는 방법
		p1.display();
		p2.display();
		
		//객체(인스턴스) 생성 후에 객체 안에 필드(인스턴스 변수)값 변경 : setter 사용
		//void이고 매개변수가 있는 메소드 실행 : 레퍼런스.메소드(전달값)
		p1.setName("홍길동");
		p1.setAge(27);
		p1.setGender('남');
	
		p1.display();
		
		p2.setName("장세민");
		p2.setAge(31-1);
		p2.setGender('남');
		
		p2.display();
		
		//객체 안의 필드 값이 클래스 밖에서 필요할 때 getter 사용함
		//반환값이 있고 매개변수 없는 메소드 실행 : 반환값 받을 변수 = 레퍼런스.메소드();
		//나이의 평균을 구해서 출력한다면
		int p1Age = p1.getAge();
		int p2Age = p2.getAge();
		
		int ageAvg = (p1Age+p2Age)/2;
		System.out.println("나이 평균 : " + ageAvg);
		
		//반환되는 값을 바로 계산에 사용해도 됨 => 값을 사용할 자리에 반환값 있는 메소드를 바로 사용할 수 있음
		System.out.println("나이 평균2 : " + ((p1.getAge()+p2.getAge())/2));
	}

}
