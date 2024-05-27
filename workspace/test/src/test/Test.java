package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Book book = new Book();
		book.setTitle("hello");
		book = null;
		
		Book book2 = null;
		
		System.out.println(book);

	}

}

class Book {
	private String title;
	private String author;
	
	public Book() {
		super();
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
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
	
}