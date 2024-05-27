package book.mvc.model.dao;

import static common.JDBCTemp.close;
import static common.JDBCTemp.commit;
import static common.JDBCTemp.getConnection;
import static common.JDBCTemp.rollback;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import book.mvc.model.vo.Book;

public class BookDao {
	
	public BookDao() {}
	
	public int insertBook(Book b) {// 새로운 레코드 정보를 전달받아 쿼리문에 적용, 테이블에 추가함
		String query = "INSERT INTO BOOK VALUES(TO_CHAR(seq_bid.NEXTVAL),?,?,?,?,?)";
		int result = 0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getAuthor());
			pstmt.setString(3, b.getPublisher());
			pstmt.setDate(4, b.getPublish_date());
			pstmt.setInt(5, b.getPrice());

			result = pstmt.executeUpdate();
			if (result > 0) {
				commit(conn);
			} else {
				rollback(conn);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}

		return result;
	}

	public int updateBook(Book b) {// 수정할 정보를 전달받아 테이블의 내용 변경함
		String query = "UPDATE BOOK SET TITLE=?," + "AUTHOR=?," + "PUBLISHER=?," + "PUBLISH_DATE=?," + "PRICE=? "
				+ "WHERE BOOK_ID = ?";
		int result = 0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getAuthor());
			pstmt.setString(3, b.getPublisher());
			pstmt.setDate(4, b.getPublish_date());
			pstmt.setInt(5, b.getPrice());
			pstmt.setInt(6, b.getBook_id());

			result = pstmt.executeUpdate();
			if (result > 0) {
				commit(conn);
			} else {
				rollback(conn);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		return result;
	}

	public int deleteBook(int bid) {// 삭제할 책아이디을 전달받아 테이블의 정보 삭제함
		String query = "DELETE FROM BOOK WHERE BOOK_ID = ?";
		int result = 0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bid);
			result = pstmt.executeUpdate();
			if (result > 0) {
				commit(conn);
			} else {
				rollback(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		return result;
	}

	public ArrayList<Book> selectAllBooks() {//테이블의 모든 정보를 조회해서 리스트에 담아 리턴
		ArrayList<Book> list = new ArrayList<Book>();

		String query = "SELECT * FROM BOOK";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				Book bk = new Book();
				bk.setBook_id(rset.getInt("BOOK_ID"));
				bk.setTitle(rset.getString("TITLE"));
				bk.setAuthor(rset.getString("AUTHOR"));
				bk.setPublisher(rset.getString("PUBLISHER"));
				bk.setPublish_date(rset.getDate("PUBLISH_DATE"));
				bk.setPrice(rset.getInt("PRICE"));
				
				list.add(bk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
			close(conn);
		}
		return list;
	}
	
	public ArrayList<Book> searchBookTitle(String bookTitle){//책제목을 넘겨받아, 해당 도서조회해서 리스트에 담아 리턴
		ArrayList<Book> list = new ArrayList<Book>();
		String query = "SELECT * FROM BOOK WHERE TITLE LIKE ?";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Book bk = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%"+bookTitle+"%");
			rset = pstmt.executeQuery();
			while (rset.next()) {
				bk = new Book();
				bk.setBook_id(rset.getInt("BOOK_ID"));
				bk.setTitle(rset.getString("TITLE"));
				bk.setAuthor(rset.getString("AUTHOR"));
				bk.setPublisher(rset.getString("PUBLISHER"));
				bk.setPublish_date(rset.getDate("PUBLISH_DATE"));
				bk.setPrice(rset.getInt("PRICE"));
				list.add(bk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
			close(conn);
		}
		return list;
	}
	
	public Book selectBook(int bookId) {//책 아이디를 전달받아 해당 도서 조회해서 객체에 담아 리턴

		String query = "SELECT * FROM BOOK WHERE BOOK_ID= ?";
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Book bk = null;
		try {
			pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, bookId);
				rset = pstmt.executeQuery();
				if (rset.next()) {
				bk = new Book();
				bk.setBook_id(rset.getInt("BOOK_ID"));
				bk.setTitle(rset.getString("TITLE"));
				bk.setAuthor(rset.getString("AUTHOR"));
				bk.setPublisher(rset.getString("PUBLISHER"));
				bk.setPublish_date(rset.getDate("PUBLISH_DATE"));
				bk.setPrice(rset.getInt("PRICE"));
				}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
			close(conn);
		}

		return bk;
	}
	
	
}
