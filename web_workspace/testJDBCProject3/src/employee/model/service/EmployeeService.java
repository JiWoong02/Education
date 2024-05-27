package employee.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import employee.exception.EmployeeException;
import employee.model.dao.EmployeeDao;
import employee.model.dto.Employee;

//Connection 관리와 트랜잭션 관리가 목적인 모델 서비스 클래스임
public class EmployeeService {
	//의존성 주입(Dependency Injection : DI)
	EmployeeDao empDao = new EmployeeDao();

	public ArrayList<Employee> selectAll() throws EmployeeException {
		Connection conn = getConnection();
		ArrayList<Employee> list = empDao.selectAll(conn);
		close(conn);
		return list;
		
	}

	public Employee selectEmployee(String empId) throws EmployeeException {
		Connection conn = getConnection();
		Employee emp = empDao.selectEmployee(conn, empId);
		close(conn);
		return emp;
		
	}

	public ArrayList<Employee> selectDeptList(String deptId) throws EmployeeException {
		Connection conn = getConnection();
		ArrayList<Employee> list = empDao.selectDeptList(conn, deptId);
		close(conn);
		return list;
	}

	public ArrayList<Employee> selectJobtList(String jobId) throws EmployeeException {
		Connection conn = getConnection();
		ArrayList<Employee> list = empDao.selectJobtList(conn, jobId);
		close(conn);
		return list;
	}

	public ArrayList<Employee> selectEmpNametList(String empName) throws EmployeeException {
		Connection conn = getConnection();
		ArrayList<Employee> list = empDao.selectEmpNametList(conn, empName);
		close(conn);
		return list;
	}
	
	//DBL 처리용 메소드 : 트랜잭션 처리 반드시 필요함 -------------------------------------
	public int delete(String empId) throws EmployeeException {
		Connection conn = getConnection();
		int result = empDao.delete(conn, empId);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int update(Employee emp) throws EmployeeException {
		Connection conn = getConnection();
		int result = empDao.update(conn, emp);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int insert(Employee emp) throws EmployeeException {
		Connection conn = getConnection();
		int result = empDao.insert(conn, emp);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
}
