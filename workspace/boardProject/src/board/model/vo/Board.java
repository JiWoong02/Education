package board.model.vo;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {
	private int boardNo;
	private String boardTitle;
	private String boardWriter;
	private Date boardDate;
	private String boardContent;
	private int readCount;
	public Board() {
		super();
	}
	public Board(int boardNo,String boardTitle, String boardWriter, Date boardDate, String boardContent, int readCount) {
		super();
		this.boardTitle = boardTitle;
		this.boardNo = boardNo;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
		this.boardContent = boardContent;
		this.readCount = readCount;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	@Override
	public String toString() {
		return "["+boardNo +"] 게시글 제목 : "+boardTitle+ "\n 작성자아이디 : " + boardWriter + "\n 작성 날짜 : " + boardDate
				+ "\n 글내용 : " + boardContent + "\n 조회수 : " + readCount;
	}
	
}
