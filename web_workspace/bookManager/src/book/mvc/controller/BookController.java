package book.mvc.controller;

import java.util.ArrayList;

import book.mvc.model.dao.BookDao;
import book.mvc.model.vo.Book;

public class BookController {
	public BookController() {}
	BookDao bd = new BookDao();
	public int insertBook(Book b) {
		return bd.insertBook(b);
	}
	public int updateBook(Book b) {
		return bd.updateBook(b);
	}	
	public int deleteBook(int bookId) {
		return bd.deleteBook(bookId);
	}	
	public Book searchBook(int bookId) {
		return bd.selectBook(bookId);
	}
	public ArrayList<Book> searchBookTitle(String bookTitle) {
		return bd.searchBookTitle(bookTitle);
	}
	public ArrayList<Book> selectAll() {
		return bd.selectAllBooks();
	}
	
}
