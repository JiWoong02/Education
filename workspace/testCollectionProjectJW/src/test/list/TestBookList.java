package test.list;

import java.util.ArrayList;

public class TestBookList {

	public static void main(String[] args) {
		// Book 객체를 리스트에 저장 처리
		// 객체배열이라면,
//		Book [] books = new Book[저장갯수지정];
		ArrayList bookList = new ArrayList();
		
		bookList.add(new Book("해리포터", 25000));
		bookList.add(new Book("자바의 정석", 45000));
		bookList.add(new Book("sql 이해", 28000));
		bookList.add(new Book("오라클 분석", 35000));
		bookList.add(new Book("개발자 자기개발", 30000));
		
		System.out.println(bookList);
		
		//for 문
		for(int i =0;i < bookList.size();i++) {
			System.out.println(i + " : " + bookList.get(i));
		}
		
		//for each 문
		for(Object obj : bookList) {
			System.out.println(obj);
		}
		
		//sort() 로 정렬 처리 : 저장된 객체의 필드값 중에서 정렬 기준으로 사용할 필드 지정
		//sort(Comparator 레퍼런스) : 정렬기준이 지정된 Comparator 후손클래스를 사용함
		//즉, Comparator 를 상속받은 후손클래스를 먼저 만들어야 함 => compare 를 오버라이딩 : 정렬기준 정함
		
		System.out.println("도서제목 기준 오름차순 정렬 ----------------------------------");
		bookList.sort(new BookTitleAscending());
		for(Object obj : bookList) {
			System.out.println(obj);
		}
		
		System.out.println("도서가격 기준 내림차순 정렬 ----------------------------------");
		bookList.sort(new BookPriceDescending());
		for(Object obj : bookList) {
			System.out.println(obj);
		}
	}

}
