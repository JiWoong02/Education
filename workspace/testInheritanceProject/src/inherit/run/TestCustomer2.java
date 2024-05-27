package inherit.run;

import inherit.model.dto.Customer;

public class TestCustomer2 {

	public static void main(String[] args) {
		// 객체배열 사용 테스트
		Customer[] car = new Customer[3];
		
		
		car[0] = new Customer("김철수", 28, '남', "kimchul96@naver.com", "010-9876-3632", "경기도 용인시 수지구", 1350.77);
		car[1] = new Customer("김상수", 14, '여', "gamcjjl16@naver.com", "010-9216-1433", "경기도 성남시 분당구", 1703.53);
		car[2] = new Customer("김동수", 26, '남', "kamcqrl56@naver.com", "010-9516-5432", "서울시 서초구 신논현동 77", 2016.15);
		
		//for 문 사용
		for(int i=0; i < car.length; i++) {
			System.out.println(car[i]);
		}
		//for each 문 사용 : 객체배열, 컬렉션에서 주로 사용함
		//for(클래스타입 레퍼런스 : 배열명) { 레퍼런스.메소드(); }
		for(Customer c : car) {
			System.out.println(c);
		}
		
		//고객들의 포인트 누적 합산 처리
		double totalPoint = 0.0;
		for(Customer c : car) {
			System.out.print(c.getPoint() + " + ");
			totalPoint += c.getPoint();}
		System.out.println();
		System.out.println("누적 포인트 : " + totalPoint);
		

	}

}
