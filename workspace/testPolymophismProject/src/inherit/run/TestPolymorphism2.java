package inherit.run;

import inherit.model.dto.Customer;
import inherit.model.dto.Person;
import inherit.model.dto.Student;

public class TestPolymorphism2 {
	public static void main(String[] args) {
		// 다형성 테스트 2 : 객체배열에 적용
//		Person[] par = new Person[6];
		Object[] par = new Object[6];
		par[0] = new Customer("김철수", 28, '남', "kimchul96@naver.com", "010-9876-3632", "경기도 용인시 수지구", 1350.77);
		par[1] = new Customer("김상수", 14, '여', "gamcjjl16@naver.com", "010-9216-1433", "경기도 성남시 분당구", 1703.53);
		par[2] = new Customer("김동수", 26, '남', "kamcqrl56@naver.com", "010-9516-5432", "서울시 서초구 신논현동 77", 2016.15);
		par[3] = new Student("김철수", 28, '남', "kimchul96@naver.com", "010-9876-3632", 12, "유아교육학과", 4.5);
		par[4] = new Student("김상수", 14, '여', "gamcjjl16@naver.com", "010-9216-1433", 31, "법학과", 3.6);
		par[5] = new Student("김동수", 26, '남', "kamcqrl56@naver.com", "010-9516-5432", 9, "한의학과", 4.3);
		
//		for(Person p: par) {
		for(Object p : par) {
			System.out.println(p);
		}
		
	}
}
