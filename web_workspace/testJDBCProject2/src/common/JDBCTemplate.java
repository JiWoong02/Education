package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//공통모듈 : 모든 model 클래스들이 공통으로 
//				 사용할 코드를 따로 작성해서 제공하는 클래스를 말함
//싱글톤(SingleTone) 디자인 패턴을 적용함
// - 프로그램 구동되는 동안 메모리에 딱 한번, 한개만 기록 할당함 => static 사용함
// - 여러 클래스가 같이 공유하여 사용하는 방식임 
public class JDBCTemplate {
		//생성자 필요 없음 => 모두 static 에 할당시킬 것이므로
		
		public static Connection getConnection() {
			Connection conn  = null;
			
			try {
				//1. 드라이브 등록
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//2. dbms 연결
				conn = DriverManager.getConnection
						("jdbc:oracle:thin:@127.0.0.1:1521:xe","c##student","student");
				conn.setAutoCommit(false);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return conn;
		}
		
		public static void close(Connection conn) {
			try {
				if(conn != null && !conn.isClosed()) { //DB에 연결 되어 있고, 닫힌 상태가 아니라면 닫아라
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void close(Statement stmt) {
			try {
				if(stmt != null && !stmt.isClosed()) { //stmt 가 null이 아니고, stmt가 닫혀있지 않으면 닫아라
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}// PreparedStatement는 Statement의 자식이므로 따로 만들 필요X
		
		public static void close(ResultSet rset) {
			try {
				if(rset != null && !rset.isClosed()) { //rset 가 null이 아니고, rset가 닫혀있지 않으면 닫아라
					rset.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void commit(Connection conn) {
			try {
				if(conn != null && !conn.isClosed()) { //DB에 연결 되어 있고, 닫힌 상태가 아니라면 커밋해라
					conn.commit();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void rollback(Connection conn) {
			try {
				if(conn != null && !conn.isClosed()) { //DB에 연결 되어 있고, 닫힌 상태가 아니라면 롤백해라
					conn.rollback();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
