package oop.sample;

import java.util.Scanner;

public class PersonManager {

		//키보드로 값을 입력받아서, 필드값 처리하는 메소드
		public Person inputPerson() {
			Scanner sc = new Scanner(System.in);
			Person p = new Person();
			
			System.out.print("이름 : ");
			p.setName(sc.next());
			System.out.print("나이 : ");
			p.setAge(sc.nextInt());
			System.out.print("성별[남|여] : ");
			p.setGender(sc.next().charAt(0));
			return p;
		}
}
