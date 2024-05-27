package practice3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BookManagerMap {
	private HashMap booksMap;

	public BookManagerMap() {
		booksMap = new HashMap();
	}

	public BookManagerMap(HashMap hm) {
		booksMap = hm;
	}

	public void putBook(Book book) {
		booksMap.put(book.getbNo(), book);
	}

	public void removeBook(String key) {
		booksMap.remove(key);
	}

	public String searchBook(String bTitle) {
		Iterator bookIter = booksMap.entrySet().iterator();
		while (bookIter.hasNext()) {
			Map.Entry mEbook = (Map.Entry) bookIter.next();
			Book bk = (Book) mEbook.getValue();
			if (bk.getTitle().equals(bTitle)) {
				return bk.getbNo();
			}
		}
		return null;
	}

	public void displayAll() {
		Set keys = booksMap.keySet();
		for (Object key : keys) {
			System.out.println(booksMap.get(key));
		}
	}

	public Book[] sortedBookMap() {
		Collection values = booksMap.values();
		Book temp = new Book();
		Object[] objArray = values.toArray();
		Book[] bkArray = new Book[objArray.length];
		for(int i =0; i<objArray.length;i++) {
			bkArray[i]=(Book)objArray[i];
		}
		for (int i = 0; i < bkArray.length; i++) {
			for (int j = i; j < bkArray.length; j++) {
				if (bkArray[i].getTitle().compareTo(bkArray[j].getTitle()) < 0) {
					temp = bkArray[i];
					bkArray[i] = bkArray[j];
					bkArray[j] = temp;
				}
			}
		}
		return bkArray;
	}

	public void PrintBookMap(Book[] br) {
		for (Book b : br) {
			System.out.println(b);
		}
	}

	public void printBook(String key) {
		System.out.println(booksMap.get(key));
	}

}
