package employee.controller;

import java.util.ArrayList;

import employee.model.dao.EmployeeDao;
import employee.model.dto.Employee;

public class EmployeeController {
	//의존성 주입(Dependency Injection : DI)
	EmployeeDao empDao = new EmployeeDao();
	
	public EmployeeController() {}
	
	//Method
	public ArrayList<Employee> selectList(){
		//dao 의 전체조회 메소드 호출
		return empDao.selectAll();
	}

	public Employee selectOne(String empId) {
		// dao 의 직원 한 명 조회 메소드 호출함		
		return empDao.selectEmployee(empId);
	}

	public ArrayList<Employee> selectDept(String deptId) {
		// dao 의 부서코드로 직원 리스트 호출함	
		return empDao.selectDeptList(deptId);
	}

	public ArrayList<Employee> selectJob(String jobId) {
		// dao 의 직급코드로 직원 리스트 호출함
		return empDao.selectJobtList(jobId);
	}

	public ArrayList<Employee> selectName(String empName) {
		// dao 의 이름패턴으로 직원 리스트 호출함
		return empDao.selectEmpNametList(empName);
	}
	
	//DML 처리용 메소드 --------------------------------------------------
	
	public int deleteEmployee(String EmpId) {
		// dao 의 사번으로 직원 정보 삭제처리하는 메서드 호출
		return empDao.delete(EmpId);
	}

	public int updateEmployee(Employee emp) {
		// dao 의 직원 정보 수정 처리용 메서드 호출
		return empDao.update(emp);
	}

	public int insertEmployee(Employee emp) {
		// dao 의 새 직원 등록 처리용 메서드 호출
		return empDao.insert(emp);
	}
}
