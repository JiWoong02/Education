package practice2;

import java.util.ArrayList;

public class BookManager {
	private ArrayList bookList;
	public BookManager() {
		super();
		this.bookList = new ArrayList();
	}
	public BookManager(ArrayList bookList) {
		super();
		this.bookList = bookList;
	}
	public void addBook(Book book) {
		this.bookList.add(book);
	}
	public void deleteBook(int index) {
		if(index == -1) {System.out.println("잘못된 번호입니다.");}
		else{this.bookList.remove(index);}
	}
	public int searchBook(String bTitle) {
		Book [] bkArray = new Book[bookList.toArray().length];
		Object [] objArray = bookList.toArray();
		int result = 0;
		for(int i =0; i<objArray.length;i++) {
			bkArray[i]=(Book)objArray[i];
			if(bkArray[i].getTitle().equals(bTitle)) {
				result = i;
			}else {result = -1;}
		}
		
		return result;
	}
	public void displayAll() {
		System.out.println(this.bookList);
	}
	public Book[] sortedBookList() {
		this.bookList.sort(new AscCategory());
		Book [] bkArray = new Book[bookList.toArray().length];
		Object [] objArray = bookList.toArray();
		for(int i =0; i<objArray.length;i++) {
			bkArray[i]=(Book)objArray[i];
		}
		
		return bkArray;
	}
	public void printBook(int index) {
		if(index==-1) {System.out.println("존재하지 않는 제목입니다.");}
		else{System.out.println(this.bookList.get(index));}
	}
	public void printBookList(Book[] br) {
		for(Book bk : br) {
			System.out.println(bk);
		}
	}

}
