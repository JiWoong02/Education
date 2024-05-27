package var.practice;

public class TestExample {
	public void example() {
		String name;
		int age;
		double height;
		double weight;
		char gender;
		String phone; //String은 클래스인데 왜 new를 적지 않을까? 예외조항. Only String 클래스만.
		String email;
		
		name="한지웅";
		age = 16;
		height = 171.6;
		weight = 67.2;
		gender = 'M';
		phone = "010-8215-5709";
		email = "smkr96@naver.com";
		
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("키 :" + height);
		System.out.println("몸무게 :" + weight);
		System.out.println("성별 :" + gender);
		System.out.println("전화번호 :" + phone);
		System.out.println("이메일 :" + email);
		
	}
	
		public void example2() {
			//변수 선언시 바로 값 기록할 수 있다. => 변수 초기화 라고 함
			//초기값 : 변수방 만들고 첫번째로 기록되는 값을 말함
			//자료형 변수명 = 초기값;
			
			String name="한지웅";
			int age= 16;
			double height= 171.6;
			double weight= 67.2;
			char gender= 'M';
			String phone= "010-8215-5709";
			String email= "smkr96@naver.com";
			
			System.out.println("이름 :" + name);
			System.out.println("나이 :" + age);
			System.out.println("키 :" + height);
			System.out.println("몸무게 :" + weight);
			System.out.println("성별 :" + gender);
			System.out.println("전화번호 :" + phone);
			System.out.println("이메일 :" + email);
			
		}
	public static void main(String[] args) {
		TestExample test = new TestExample();
		test.example();
		System.out.println();// 아무 내용 없으면 빈 줄 추가
		test.example2();
	}

}
