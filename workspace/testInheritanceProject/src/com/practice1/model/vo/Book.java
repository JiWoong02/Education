package com.practice1.model.vo;

public class Book {
	// Field
	private String title;
	private String author;
	private int price;

	// 기본 생성자와 매개변수 생성자 작성
	public Book() {
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// Getter and Setter
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
//Object 클래스의 toString() 메소드 오버라이딩
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	// Object 클래스의 equals() 메소드 오버라이딩함
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null)
			if (this.getClass() != obj.getClass())
				return false;
		Book other = (Book) obj;
		return (this.getTitle() == other.getTitle() && this.getAuthor() == other.getAuthor()
				&& this.getPrice() == other.getPrice());
	}

	// Object 클래스의  clone() 메소드 오버라이딩함

	@Override
	public Object clone() {	
		Book other = new Book(this.title,this.author,this.price);
		return other;
	}
	
}
