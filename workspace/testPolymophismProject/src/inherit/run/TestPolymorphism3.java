package inherit.run;

import inherit.model.dto.Customer;
import inherit.model.dto.Person;
import inherit.model.dto.Student;

public class TestPolymorphism3 {
	
	//다형성은 주로 메소드 중복의 갯수를 줄이기 위해 사용함
	public static void print(Object[] array) {
//		for(Person p: par) {
		for(Object p : array) {
			System.out.println(p);
		}
	}
	public static Object[] initArray(int su) {
		Object[] par = new Object[su];
		par[0] = new Customer("김철수", 28, '남', "kimchul96@naver.com", "010-9876-3632", "경기도 용인시 수지구", 1350.77);
		par[1] = new Customer("김상수", 14, '여', "gamcjjl16@naver.com", "010-9216-1433", "경기도 성남시 분당구", 1703.53);
		par[2] = new Customer("김동수", 26, '남', "kamcqrl56@naver.com", "010-9516-5432", "서울시 서초구 신논현동 77", 2016.15);
		par[3] = new Student("김철수", 28, '남', "kimchul96@naver.com", "010-9876-3632", 12, "유아교육학과", 4.5);
		par[4] = new Student("김상수", 14, '여', "gamcjjl16@naver.com", "010-9216-1433", 31, "법학과", 3.6);
		par[5] = new Student("김동수", 26, '남', "kamcqrl56@naver.com", "010-9516-5432", 9, "한의학과", 4.3);
		return par;
	}
	public static void main(String[] args) {
		// 다형성 테스트 3 : 메소드 매개변수, 리턴타입에 적용
		Object[] arr =initArray(6);
		print(arr);		
	}
	
}
