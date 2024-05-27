package test.object;

public class TestObject {

	public static void main(String[] args) {
		// 자바 언어로 만들어지는 모든 클래스는 java.lang.Object 의 후손이다.
		// 즉, Object 가 제공하는 메소드 모두 사용할 수 있다.
		Book book = new Book();
		Book ref = book; //주소 복사 (얕은 복사)  : Shallow Copy
		
		System.out.println("hashCode : " + book.hashCode());
		System.out.println("eqauls : " + book.equals(ref)); //true  
		System.out.println("toString : " + book.toString());
		System.out.println("getClass : " +book.getClass()); //getClass()  => Class 리턴함 =>오버라이딩된 toString() 이 작동됨
		Class var = book.getClass();
		String varStr = var.toString();
		System.out.println("getClass : "+ varStr);
	} // main

} // class

//하나의 java 파일 안에 클래스(파일명) 하나 작성이 원칙임
//하나의 java 파일 안에 클래스 여러 개 작성할 수도 있음
//주의사항 : 파일명으로 사용된 클래스만 public class 로 지정할 수 있음
//			     파일명이 아닌 클래스는 public 사용할 수 없음
class Book {
	private String title; // 도서제목

	public Book() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}

}
