package inherit.run;

import inherit.model.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// 오버라이딩 메소드, super() 테스트
		Student s1 = new Student();
		Student s2 = new Student(123, "건축학과", 4.3);
		Student s3 = new Student("홍진호", 42, '남', "hont77@yahoo.co.kr", "010-5547-7913", 531, "통계학과", 2.4);
		
		//toString()
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//clone()
		Student s4 = (Student)s3.clone();
		System.out.println(s4);
		System.out.println("주소 확인 s3 : " + s3.hashCode());
		System.out.println("주소 확인 s4 : " + s4.hashCode());
		System.out.println(s3==s4);
		
		//equals()
		System.out.println(s3.equals(s4));
		
		
		
		
		
		
		
		
		
	}
}
