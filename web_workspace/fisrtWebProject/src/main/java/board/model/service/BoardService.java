package board.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import board.model.dao.BoardDao;
import board.model.dto.Board;
import static common.JDBCTemplate.*;


public class BoardService {
	private BoardDao bdao = new BoardDao();
	
	public ArrayList<Board> selectTop3(){
		Connection conn = getConnection();
		ArrayList<Board> list = bdao.selectTop3(conn);
		close(conn);
		return list;
	}
}
