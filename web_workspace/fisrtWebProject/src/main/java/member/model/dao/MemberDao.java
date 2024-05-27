package member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import member.model.dto.User;
import static common.JDBCTemplate.close;

public class MemberDao {

	public User selectLogin(Connection conn, User user) {
		User loginUser = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "SELECT * FROM USERS WHERE USERID = ? AND USERPWD = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getUserPwd());
			
			rset=pstmt.executeQuery();
			
			//결과매핑 : select 해 온 컬럼값들을 dto 객체의 각 필드값으로 옮겨 저장 처리
			if(rset.next()) {//BOF 에서 한칸 내려서 행이 있는지 확인
				loginUser = new User();
				loginUser.setUserName(rset.getString("USERNAME"));// 컬럼명, 컬럼나열순번
				loginUser.setUserId(rset.getString("USERID"));//조회된 컬럼값 적용
				loginUser.setUserPwd(user.getUserPwd());// 매개변수 값을 적용할 수도 있음
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return loginUser;
	}
	
}
