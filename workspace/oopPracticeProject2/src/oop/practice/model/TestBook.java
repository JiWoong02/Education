package oop.practice.model;

public class TestBook {

	public static void main(String[] args) {
//		1. Book 클래스에 대한 객체를 디폴트 생성자를 사용해서 생성함
//		2. 매개변수 있는 생성자를 사용해서 두번째 객체 생성함
//		3. 2개의 객체가 가진 정보를 화면출력함
//		<출력예>
//		null	0	0.0	null
//		뇌를 자극하는 JAVA	20000	0.2	김윤영
		Book book= new Book();
		Book book2=new Book("뇌를 자극하는 JAVA	",20000,0.2,"김윤영");
		book.bookinformation();
		book2.bookinformation();
		book.setTitle("자바의 정석");
		book.setPrice(35000);
		book.setDiscountRate(0.1);
		book.setAuthor("윤상섭");
		System.out.println("\n수정된 결과 확인");
		book.bookinformation();
		
		System.out.println("도서명 : " + book.getTitle());
		System.out.println("할인된 가격 : " + (int)(book.getPrice()-(book.getPrice()*book.getDiscountRate()))+" 원");
		System.out.println("도서명 : " + book2.getTitle());
		System.out.println("할인된 가격 : " + (int)(book2.getPrice()-(book2.getPrice()*book2.getDiscountRate()))+" 원");
	}

}
