package oop.encapsulation;

import java.util.Scanner;

public class TestSetter {

	public void inputStudent1() {
		//키보드 입력값들을 변수에 따로 저장하고
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수강생 번호 : ");
		int sno = sc.nextInt();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("전화번호 : ");
		String phone = sc.next();
		//변수들을 생성자의 초기값으로 사용
		Student std = new Student(sno, name, age, phone);
		std.printInformation();
	}

	public void inputStudent2() {
		Scanner sc = new Scanner (System.in);
		//기본생성한 다음
		Student st = new Student();
		//키보드로 입력받은 값으 setter  사용해서 기록
		System.out.print("수강생 번호 : ");
		st.setSno(sc.nextInt()); 
		System.out.print("이름 : ");
		st.setName(sc.next()); 
		System.out.print("나이 : ");
		st.setAge(sc.nextInt()); 
		System.out.print("전화번호 : ");
		st.setPhone(sc.next()); 
		st.printInformation();
	}

	public static void main(String[] args) {
		// 객체 인스턴스 변수에 값 기록 방법 : 키보드로 입력받아 처리
		TestSetter test = new TestSetter();

		// 첫번째, 따로 변수에 저장한 다음 생성자를 사용
		test.inputStudent1();

		// 두번째, 기본생성 후에 setter 로 키보드 입력값으로 변경
		test.inputStudent2();
	}

}
