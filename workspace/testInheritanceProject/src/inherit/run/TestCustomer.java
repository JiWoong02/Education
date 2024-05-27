package inherit.run;

import inherit.model.dto.Customer;

public class TestCustomer {
	
	public static void main(String[] args) {
		//overriding method test
		Customer c1 = new Customer();
		Customer c2 = new Customer("김철수", 28, '남', "kimchul96@naver.com","010-9876-5432", "경기도 용인시 수지구", 1350.77);
		
		System.out.println(c1.toString());
		System.out.println(c2);	
		Customer c3 = (Customer)c2.clone();
		
		System.out.println(c3);
		System.out.println("두 객체의 내용이 같은지 확인 : "+c3.equals(c2));        //true
		System.out.println("두 레퍼런스가 가진 주소가 같은지 : " + (c2 == c3));   //false
	}

}
