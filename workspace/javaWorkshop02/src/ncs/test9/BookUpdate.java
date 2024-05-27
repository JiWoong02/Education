package ncs.test9;

public class BookUpdate {
	private Book bookData;

	public BookUpdate() {
	}

	public BookUpdate(Book bookData) {
		this.bookData = bookData;
	}

	public Book getBookData() {
		return this.bookData;
	}

	public void setBookData(Book bookData) {
		this.bookData = bookData;
	}

	public void updateBookPrice() {
		this.bookData.setBookPrice(this.bookData.getBookPrice() * (1 - this.bookData.getBookDiscount()));
	}
}
