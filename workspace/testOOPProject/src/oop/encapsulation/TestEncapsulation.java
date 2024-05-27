package oop.encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		// 필드 캡슐화 접근 테스트
		Student std = new Student();
		System.out.println("std : " + std); //자동으로 부모인 Object의 메소드인 toString을 사용
		System.out.println("std : " + std.toString());
		System.out.println(std.hashCode());
		
		// 클래스가 소유한 멤버(필드, 메소드)에 접근하려면
		// 주소.필드명, 주소, 메소드명()
		//std.name = "홍길동"; //private 이므로 접근 불가능
	}

}
