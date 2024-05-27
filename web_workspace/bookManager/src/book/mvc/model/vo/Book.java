package book.mvc.model.vo;

import java.sql.Date;

public class Book {
	private int book_id;
	private String title;
	private String author;
	private String publisher;
	private Date publish_date;
	private int price;
	public Book(int book_id, String title, String author, String publisher, Date publish_date, int price) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publish_date = publish_date;
		this.price = price;
	}
	public Book() {
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", publish_date=" + publish_date + ", price=" + price + "]";
	}
	
	
}
