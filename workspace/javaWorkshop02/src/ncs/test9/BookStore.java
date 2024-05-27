package ncs.test9;

public class BookStore {

	public static void main(String[] args) {

		Book bk = new Book("프로그래밍", "HTML5", 30000, 0.15);
		System.out.println("기본정보");
		System.out.println(bk.getBookName()+" " + bk.getBookPrice());
		BookUpdate bku = new BookUpdate(bk);
		bku.updateBookPrice();
		bk = bku.getBookData();
		System.out.println("변경된 정보");
		System.out.println(bk.getBookName()+" " + bk.getBookPrice());
		
		
	}

}
