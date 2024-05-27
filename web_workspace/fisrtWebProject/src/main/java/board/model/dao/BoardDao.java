package board.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import static common.JDBCTemplate.*;

import board.model.dto.Board;

public class BoardDao {
		
	public ArrayList<Board> selectTop3(Connection conn){
		ArrayList<Board> list = new ArrayList<Board>();
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT BOARD_NUM,BOARD_TITLE, BOARD_READCOUNT "
				+ "FROM(SELECT ROWNUM rnum, BOARD_NUM,BOARD_TITLE, BOARD_READCOUNT "
				+ "        FROM(SELECT * FROM BOARD "
				+ "                    WHERE BOARD_LEV = 1 "
				+ "                    ORDER BY BOARD_READCOUNT DESC)) "
				+ "WHERE ROWNUM BETWEEN 1 AND 3";
		try {
			stmt = conn.createStatement();
			rset=stmt.executeQuery(query);
			while(rset.next()) {
				Board board = new Board();
				board.setBoardNum(rset.getInt("BOARD_NUM"));
				board.setBoardTitle(rset.getString("BOARD_TITLE"));
				board.setBoardReadCount(rset.getInt("BOARD_READCOUNT"));
				list.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		return list;
	}
}
