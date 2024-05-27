package test.poly;

import java.util.Date;

import inherit.model.dto.Customer;
import inherit.model.dto.Student;

public class TestPolymorphism {

	public static void main(String[] args) {
		// 다형성 기술을 사용하는 목적 : 메소드 오버로딩을 줄일 수 있음
		printObject(new String("다형성 적용 메소드 오버로딩 테스트"));
		printObject(new java.util.Date());
		printObject(new Customer());
		printObject(new Student());
	}
	
	//다형성을 이용하면 오버로딩된 메소드의 갯수를 줄일 수 있다.
	
	private static void printObject(Object ref) {
		System.out.println(ref);
	}
	
	//메소드 오버로딩 : 취급하는 데이터의 종류가 다를 때 메소드 오버로딩 사용함
	
	
	
//	private static void printObject(Student ref) {
//		System.out.println(ref);
//	}
//	private static void printObject(Customer ref) {
//		System.out.println(ref);
//	}
//	
//
//	private static void printObject(Date ref) {
//		System.out.println(ref);
//	}
//
//	private static void printObject(String ref) {
//		System.out.println(ref);
//
//	}

}
