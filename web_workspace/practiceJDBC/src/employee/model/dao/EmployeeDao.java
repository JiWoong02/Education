package employee.model.dao;

//import common.JDBCTemplate;
//클래스가 가진 static 메소드만 임포트할 수 있음
//import static 패키지명.클래스명.메소드명;
//import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.close;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import employee.exception.EmployeeException;
import employee.model.dto.Employee;

//dao (database access object) : 비즈니스 로직 처리용 클래스 => jdbc
// 쿼리문 작성하고, 쿼리문 실행시키고 결과 받아서  처리하는 모델 dao 클래스임
public class EmployeeDao {
	 private Properties prop = new Properties();
	//dao 객체 생성시, 별도로 작성된 쿼리문을 가진 query.properties 파일을 읽어오게 처리함
	public EmployeeDao() {
		try {
			prop.load(new FileReader("resources/query.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Method : 실행시킬 쿼리문(sql문) 하나당 메소드 하나씩 작성함

	// 1. 직원 전체 조회
	// 제너릭을 지정하면 꺼낼때도 모두 Employee 타입
	public ArrayList<Employee> selectAll(Connection conn) throws EmployeeException {
			ArrayList<Employee> list = new ArrayList<Employee>();
			Statement stmt = null;
			ResultSet rset = null;
			String quary = "SELECT * FROM EMPLOYEE;";
			try {
				stmt=conn.createStatement();
				rset = stmt.executeQuery(quary);
			
			while (rset.next()) { // true 리턴 => 해당 위치에 행이 있다면
				// 행의 컬럼값 하나씩 꺼내서 Employee 객체에 저장하고
				// 변수 = rset.get필드자료형("컬럼명" | 컬럼나열순번);
				Employee emp = new Employee();
				emp.setEmpId(rset.getString("EMP_ID"));
				emp.setEmpName(rset.getString("EMP_NAME"));
				emp.setEmpNo(rset.getString("EMP_NO"));
				emp.setEmail(rset.getString("EMAIL"));
				emp.setPhone(rset.getString("PHONE"));
				emp.setHireDate(rset.getDate("HIRE_DATE"));
				emp.setJobId(rset.getString("JOB_ID"));
				emp.setSalary(rset.getInt("SALARY"));
				emp.setBonusPct(rset.getDouble("BONUS_PCT"));
				emp.setMarriage(rset.getString("MARRIAGE"));
				emp.setMgrId(rset.getString("MGR_ID"));
				emp.setDeptId(rset.getString("DEPT_ID"));
				list.add(emp);
				// 리스트에 추가함
			}
		} catch (Exception e) {
//			e.printStackTrace();	// 에러 로그(log) 파일에 에러 메세지 출력 저장 처리함
			throw new EmployeeException(e.getMessage());
		} finally {
//				JDBCTemplate.close(rset);
			close(rset);
//				JDBCTemplate.close(stmt);
			close(stmt);
		}
		return list;
	}

	// 2.전달받은 사번으로 직원 한 명 조회해서 리턴
	public Employee selectEmployee(Connection conn,String empId) throws EmployeeException {
		Employee emp = null; // 해당 사번의 직원이 없을 수도 있기 때문에 초기값 null
		String query = prop.getProperty("selectone");
//		String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID = '" + empId + "'";
//		String query = "SELECT * FROM EMPLOYEE WHERE EMP_ID = ? ";

		// Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {	
			pstmt = conn.prepareStatement(query); 
			pstmt.setString(1, empId);
			rset = pstmt.executeQuery(); 
			if (rset.next()) { 
				emp = new Employee(); 
				emp.setEmpId(rset.getString("EMP_ID"));
				emp.setEmpName(rset.getString("EMP_NAME"));
				emp.setEmpNo(rset.getString("EMP_NO"));
				emp.setEmail(rset.getString("EMAIL"));
				emp.setPhone(rset.getString("PHONE"));
				emp.setHireDate(rset.getDate("HIRE_DATE"));
				emp.setJobId(rset.getString("JOB_ID"));
				emp.setSalary(rset.getInt("SALARY"));
				emp.setBonusPct(rset.getDouble("BONUS_PCT"));
				emp.setMarriage(rset.getString("MARRIAGE"));
				emp.setMgrId(rset.getString("MGR_ID"));
				emp.setDeptId(rset.getString("DEPT_ID"));
			}
		} catch (Exception e) {
//			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		} finally {
			close(rset);
			close(pstmt);
		}
		return emp;
	}

	// 6.전달받은 부서코드로 해당 부서에 소속된 직원 리스트 리턴
	public ArrayList<Employee> selectDeptList(Connection conn,String deptId) throws EmployeeException {
		ArrayList<Employee> list = new ArrayList<Employee>();
		String query = prop.getProperty("selectdept");
//		String query = "SELECT * FROM EMPLOYEE WHERE DEPT_ID = '" + deptId + "'";
//		String query = "SELECT * FROM EMPLOYEE WHERE DEPT_ID = ?";
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			// 3. 문장 객체 생성하기 : Statement, PreparedStatement 사용
			// 원래 PreparedStatement로 주로 사용
			// Statement 사용-----------------------------------------------
			pstmt = conn.prepareStatement(query);// Statement도 끝나면 닫아야 됨
			pstmt.setString(1, deptId);
			// 4. 쿼리문 전송하고 결과받기
			// select 쿼리문 전송용 메소드 : executeQuery(쿼리문장) : ResultSet 리턴함
			// dml 쿼리문(insert, update, delete) 전송용 메소드 : excuteUpdate(쿼리문장) : int 리턴함
			// rset = stmt.executeQuery(query); // ResultSet 도 끝나면 닫아야 됨
			rset = pstmt.executeQuery();
//			System.out.println("dao selectAll() 실행 결과 확인 : " + rset);

			// 5. 받은 결과를 list에 옮기기 : 결과 매핑 처리함
			while (rset.next()) { // true 리턴 => 해당 위치에 행이 있다면
				// 행의 컬럼값 하나씩 꺼내서 Employee 객체에 저장하고
				// 변수 = rset.get필드자료형("컬럼명" | 컬럼나열순번);
				Employee emp = new Employee();
				emp.setEmpId(rset.getString("EMP_ID"));
				emp.setEmpName(rset.getString("EMP_NAME"));
				emp.setEmpNo(rset.getString("EMP_NO"));
				emp.setEmail(rset.getString("EMAIL"));
				emp.setPhone(rset.getString("PHONE"));
				emp.setHireDate(rset.getDate("HIRE_DATE"));
				emp.setJobId(rset.getString("JOB_ID"));
				emp.setSalary(rset.getInt("SALARY"));
				emp.setBonusPct(rset.getDouble("BONUS_PCT"));
				emp.setMarriage(rset.getString("MARRIAGE"));
				emp.setMgrId(rset.getString("MGR_ID"));
				emp.setDeptId(rset.getString("DEPT_ID"));
				list.add(emp);
				// 리스트에 추가함
			}
		} catch (Exception e) {
//			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}

	// 7.전달받은 직급코드로 해당 직급의 직원 리스트 리턴
	public ArrayList<Employee> selectJobtList(Connection conn,String jobId) throws EmployeeException {
		ArrayList<Employee> list = new ArrayList<Employee>();
		String query = prop.getProperty("selectjob");
//		String query = "SELECT * FROM EMPLOYEE WHERE JOB_ID = '" + jobId + "'";
//		String query = "SELECT * FROM EMPLOYEE WHERE JOB_ID = ? ";
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, jobId);
			// 4. 쿼리문 전송하고 결과받기
			// select 쿼리문 전송용 메소드 : executeQuery(쿼리문장) : ResultSet 리턴함
			// dml 쿼리문(insert, update, delete) 전송용 메소드 : excuteUpdate(쿼리문장) : int 리턴함
			// rset = stmt.executeQuery(query); // ResultSet 도 끝나면 닫아야 됨
			rset = pstmt.executeQuery();
//			System.out.println("dao selectAll() 실행 결과 확인 : " + rset);
			// 5. 받은 결과를 list에 옮기기 : 결과 매핑 처리함
			while (rset.next()) { // true 리턴 => 해당 위치에 행이 있다면
				// 행의 컬럼값 하나씩 꺼내서 Employee 객체에 저장하고
				// 변수 = rset.get필드자료형("컬럼명" | 컬럼나열순번);
				Employee emp = new Employee();
				emp.setEmpId(rset.getString("EMP_ID"));
				emp.setEmpName(rset.getString("EMP_NAME"));
				emp.setEmpNo(rset.getString("EMP_NO"));
				emp.setEmail(rset.getString("EMAIL"));
				emp.setPhone(rset.getString("PHONE"));
				emp.setHireDate(rset.getDate("HIRE_DATE"));
				emp.setJobId(rset.getString("JOB_ID"));
				emp.setSalary(rset.getInt("SALARY"));
				emp.setBonusPct(rset.getDouble("BONUS_PCT"));
				emp.setMarriage(rset.getString("MARRIAGE"));
				emp.setMgrId(rset.getString("MGR_ID"));
				emp.setDeptId(rset.getString("DEPT_ID"));
				list.add(emp);
				// 리스트에 추가함
			}
		} catch (Exception e) {
//			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}

	// 전달받은 이름 또는 이름패턴에 해당되는 직원 리스트 리턴
	public ArrayList<Employee> selectEmpNametList(Connection conn,String empName) throws EmployeeException {
		ArrayList<Employee> list = new ArrayList<Employee>();
		String query = prop.getProperty("selectname");
//		String query = "SELECT * FROM EMPLOYEE WHERE EMP_NAME LIKE '%" + empName + "%'";
//		String query = "SELECT * FROM EMPLOYEE WHERE EMP_NAME LIKE ?";
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			// 3. 문장 객체 생성하기 : Statement, PreparedStatement 사용
			// 원래 PreparedStatement로 주로 사용
			// Statement 사용-----------------------------------------------
//			stmt = conn.createStatement();// Statement도 끝나면 닫아야 됨
			pstmt = conn.prepareStatement(query);

			// ? 에 값 적용
			pstmt.setString(1, "%" + empName + "%");
			// 문자 패턴은 여기서 적용
			// 4. 쿼리문 전송하고 결과받기
			// select 쿼리문 전송용 메소드 : executeQuery(쿼리문장) : ResultSet 리턴함
			// dml 쿼리문(insert, update, delete) 전송용 메소드 : excuteUpdate(쿼리문장) : int 리턴함
//			rset = stmt.executeQuery(query); // ResultSet 도 끝나면 닫아야 됨
			rset = pstmt.executeQuery();
//			System.out.println("dao selectAll() 실행 결과 확인 : " + rset);

			// 5. 받은 결과를 list에 옮기기 : 결과 매핑 처리함
			while (rset.next()) { // true 리턴 => 해당 위치에 행이 있다면
				// 행의 컬럼값 하나씩 꺼내서 Employee 객체에 저장하고
				// 변수 = rset.get필드자료형("컬럼명" | 컬럼나열순번);
				Employee emp = new Employee();
				emp.setEmpId(rset.getString("EMP_ID"));
				emp.setEmpName(rset.getString("EMP_NAME"));
				emp.setEmpNo(rset.getString("EMP_NO"));
				emp.setEmail(rset.getString("EMAIL"));
				emp.setPhone(rset.getString("PHONE"));
				emp.setHireDate(rset.getDate("HIRE_DATE"));
				emp.setJobId(rset.getString("JOB_ID"));
				emp.setSalary(rset.getInt("SALARY"));
				emp.setBonusPct(rset.getDouble("BONUS_PCT"));
				emp.setMarriage(rset.getString("MARRIAGE"));
				emp.setMgrId(rset.getString("MGR_ID"));
				emp.setDeptId(rset.getString("DEPT_ID"));
				list.add(emp);
				// 리스트에 추가함
			}
		} catch (Exception e) {
//			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		} finally {
			close(rset);
			close(pstmt);
			close(conn);
		}

		return list;
	}

	// DML 처리용 메소드 구현부 ------------------------------------------------
	// 5. 전달받은 사번으로 해당 직원 정보 삭제
	public int delete(Connection conn,String empId) throws EmployeeException {
		int result = 0;
//		String query = "DELETE FROM EMPLOYEE WHERE EMP_ID ='"+empId+"'";
//		String query = "DELETE FROM EMPLOYEE WHERE EMP_ID = ? ";
		String query = prop.getProperty("delete");
//		Statement stmt=null;
		PreparedStatement pstmt = null;

		try {
			// 3. 문장 객체 만들기
//			stmt=conn.createStatement();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, empId);
			// 4. 쿼리문 전송하고 결과받기
//			result=stmt.executeUpdate(query);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// 모든 예외를 하나로 처리하게 다형성 이용함
//			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		} finally {
				close(pstmt);
				}
		return result;
	}

	// 전달받은 직원정보로 새로운 행으로 추가 등록
	public int insert(Connection conn,Employee emp) throws EmployeeException {
		int result = 0;
		String query = prop.getProperty("insert");
//		String query = "INSERT INTO EMPLOYEE VALUES (TO_CHAR(SEQ_EMPID.NEXTVAL), '"
//							  + emp.getEmpName() +"','"
//							  + emp.getEmpNo() +"','"
//							  + emp.getEmail() +"','"
//							  + emp.getPhone() +"','"
//							  + emp.getHireDate() +"','"
//							  + emp.getJobId() +"',"
//							  + emp.getSalary() +","
//							  + emp.getBonusPct() +",'"
//							  + emp.getMarriage() +"','"
//							  + emp.getMgrId() +"','"
//							  + emp.getDeptId() +"')"
//							  ;
//		String query = "INSERT INTO EMPLOYEE VALUES " + "(TO_CHAR(SEQ_EMPID.NEXTVAL),"
//				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

//		Statement stmt=null;
		PreparedStatement pstmt = null;

		try {
			// 3. 문장 객체 만들기
//			stmt=conn.createStatement();
			pstmt = conn.prepareStatement(query);
			// ? 에 값 적용
			pstmt.setString(1, emp.getEmpName());
			pstmt.setString(2, emp.getEmpNo());
			pstmt.setString(3, emp.getEmail());
			pstmt.setString(4, emp.getPhone());
			pstmt.setDate(5, emp.getHireDate());
			pstmt.setString(6, emp.getJobId());
			pstmt.setInt(7, emp.getSalary());
			pstmt.setDouble(8, emp.getBonusPct());
			pstmt.setString(9, emp.getMarriage());
			pstmt.setString(10, emp.getMgrId());
			pstmt.setString(11, emp.getDeptId());

			// 4. 쿼리문 전송하고 결과받기
//			result=stmt.executeUpdate(query);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// 모든 예외를 하나로 처리하게 다형성 이용함
//			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		} finally {
			close(pstmt);
		}

		return result;
	}

	// 전달받은 직원 정보로 해당 직원 정보 수정 처리
	public int update(Connection conn,Employee emp) throws EmployeeException {
		int result = 0;
//		String query = "UPDATE EMPLOYEE "
//							+ "SET SALARY =" +emp.getSalary()
//							+ " ,BONUS_PCT =" + emp.getBonusPct()
//							+ " ,JOB_ID = '"+emp.getJobId()+"'"
//							+ " ,DEPT_ID = '"+emp.getDeptId()+"'"
//							+ "WHERE EMP_ID = '" + emp.getEmpId()+"'";
//		String query = "UPDATE EMPLOYEE" + " SET SALARY = ?" + " ,BONUS_PCT = ?" + " ,JOB_ID = ?" + " ,DEPT_ID = ?"
//				+ " WHERE EMP_ID = ?";
		String query = prop.getProperty("update");
//		Statement stmt=null;
		PreparedStatement pstmt = null;

		try {
			// 3. 문장 객체 만들기
//			stmt=conn.createStatement();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, emp.getSalary());
			pstmt.setDouble(2, emp.getBonusPct());
			pstmt.setString(3, emp.getJobId());
			pstmt.setString(4, emp.getDeptId());
			pstmt.setString(5, emp.getEmpId());
			// 4. 쿼리문 전송하고 결과받기
//			result=stmt.executeUpdate(query);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// 모든 예외를 하나로 처리하게 다형성 이용함
//			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		} finally {
			close(pstmt);
		}
		return result;
	}

}
