package practice2;

import java.util.Comparator;

public class DescCategory implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// 도서제목들끼리 비교 연산하는 코드를 작성함
		int result = 0;
		if (o1 instanceof Book && o2 instanceof Book) {
			Book b1 = (Book) o1;
			Book b2 = (Book) o2;

			result = b2.getCategory() - b1.getCategory();
			return result;
		}
		return result;

	}
}
