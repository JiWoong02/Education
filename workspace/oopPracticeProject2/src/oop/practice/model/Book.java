package oop.practice.model;

public class Book {
	//Field
	private String title;
	private int price;
	private double discountRate;
	private String author;
	//Constructor
	public Book() {
	}

	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	//Method
	public void bookinformation() {
		System.out.println(this.title +"\t" +this.price +"\t" +this.discountRate +"\t" +this.author);
//		System.out.println("책 제목 : " + this.title);
//		System.out.println("가격 : " + this.price);
//		System.out.println("할인율 : " + this.discountRate);
//		System.out.println("저자명 : " + this.author);
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate=discountRate;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public String getTitle() {
		return this.title;
	}
	public int getPrice() {
		return this.price;
	}
	public double getDiscountRate() {
		return this.discountRate;
	}
	public String getAuthor() {
		return this.author;
	}
}
