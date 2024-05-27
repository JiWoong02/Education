package test.list;

import java.util.Comparator;

//도서제목을 기준으로 오름차순 정렬에 대해 지정한 클래스임
//Comparator 인터페이스 상속받아야 함
public class BookTitleAscending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// 도서제목들끼리 비교 연산하는 코드를 작성함
		int result = 0;
		
		if(o1 instanceof Book && o2 instanceof Book) {
			Book b1 = (Book)o1;
			Book b2 = (Book)o2;
			
			result=b1.getTitle().compareTo(b2.getTitle());
		}
		
		
		return result;
	}

}
