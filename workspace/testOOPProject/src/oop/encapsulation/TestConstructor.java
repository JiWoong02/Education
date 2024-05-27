package oop.encapsulation;

public class TestConstructor {

	public static void main(String[] args) {
		// 생성자 사용 테스트
		// 생성자 사용 : 클래스타입 레퍼런스 = new 생성자();
		Student s1 = new Student(); // 기본생성자 사용함
		System.out.println("s1 이 가진 주소 : " + s1.hashCode());
		Student s2 = new Student(12, "한지웅", 17, "010-1234-5678");
		// 매개변수 4개 있는 생성자 사용
		// 모든 필드값 전달받아 초기화하는 생성자 사용
		System.out.println("s2 가 가진 주소 : " + s2.hashCode());
		Student s3 = new Student(15, "황진이", 19, "010-8765-4321", '여', "방송댄스", "HelloWorld@naver.com", "서울시 서초구 신논형동 77",
				99.21);
		System.out.println("s3 이 가진 주소 : " + s3.hashCode());
		
		s1.printInformation();
		s2.printInformation();
		s3.printInformation();
		
		//setter 사용 필드값 변경
		s2.setMajor("식품영양");
		s2.setEmail("hong123@yahoo.co.kr");
		s2.setGender('남');
		s2.setAddress("경기도 용인시 수지구");
		s2.setScore(15.33);
		
		s2.printInformation();
		
		//s1 이 참조하는 객체의 인스턴스변수 값 모드 수정 처리
		
		s1.setMajor("기계공학");
		s1.setEmail("huuuee@yahoo.co.kr");
		s1.setGender('여');
		s1.setAddress("경기도 성남시 분당구");
		s1.setScore(26.33);
		s1.setAge(21);
		s1.setName("김아무개");
		s1.setPhone("031-264-5709");
		s1.setSno(16);
		
		
		
		
		
		s1.printInformation(); //확인
		
	}

	
	
	
}
