package oop.array;

import java.util.GregorianCalendar;

public class TestPersonArray {

	public static void main(String[] args) {
		// Person 객체 배열 테스트
		/*
		 * Person p1 = new Person("홍길동","010-1234-5678","직장동료", new
		 * GregorianCalendar(1996,1,29) ); Person p2 = new
		 * Person("유성민","010-5542-5469","직장동료", new GregorianCalendar(1985,9,13) );
		 * Person p3 = new Person("이주학","010-6571-1124","직장동료", new
		 * GregorianCalendar(1976,4,9) );
		 * 
		 * System.out.println(p1.information()); System.out.println(p2.information());
		 * System.out.println(p3.information());
		 */
		Person[] par = new Person[3]; // Person 객체의 주소보관용 레퍼런스 변수방 3개를 배열로 만들었음.
										// 여기서 new는 배열을 만드는것. 객체3개를 만들라는게 아니에용
		// 각 레퍼런스에는 null 로 초기화되었음
		for (int i = 0; i < par.length; i++) {
			System.out.println("par[" + i + "] : " + par[i]);
		}

		par[0] = new Person("홍길동", "010-1234-5678", "직장동료", new GregorianCalendar(1996, 1, 29));
		par[1] = new Person("유성민", "010-5542-5469", "직장동료", new GregorianCalendar(1985, 9, 13));
		par[2] = new Person("이주학", "010-6571-1124", "직장동료", new GregorianCalendar(1976, 4, 9));

		for (int i = 0; i < par.length; i++) {
			System.out.println(par[i].information());
		}
	}// main
}// class
