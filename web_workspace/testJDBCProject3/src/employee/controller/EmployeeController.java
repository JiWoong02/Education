package employee.controller;

import java.util.ArrayList;

import employee.exception.EmployeeException;
import employee.model.dto.Employee;
import employee.model.service.EmployeeService;

public class EmployeeController {
	//의존성 주입(Dependency Injection : DI)
	EmployeeService empService = new EmployeeService();
	
	public EmployeeController() {}
	
	//Method
	public ArrayList<Employee> selectList() throws EmployeeException{
		//dao 의 전체조회 메소드 호출
		return empService.selectAll();
	}

	public Employee selectOne(String empId) throws EmployeeException {
		// dao 의 직원 한 명 조회 메소드 호출함		
		return empService.selectEmployee(empId);
	}

	public ArrayList<Employee> selectDept(String deptId) throws EmployeeException {
		// dao 의 부서코드로 직원 리스트 호출함	
		return empService.selectDeptList(deptId);
	}

	public ArrayList<Employee> selectJob(String jobId) throws EmployeeException {
		// dao 의 직급코드로 직원 리스트 호출함
		return empService.selectJobtList(jobId);
	}

	public ArrayList<Employee> selectName(String empName) throws EmployeeException {
		// dao 의 이름패턴으로 직원 리스트 호출함
		return empService.selectEmpNametList(empName);
	}
	
	//DML 처리용 메소드 --------------------------------------------------
	
	public int deleteEmployee(String EmpId) throws EmployeeException {
		// dao 의 사번으로 직원 정보 삭제처리하는 메서드 호출
		return empService.delete(EmpId);
	}

	public int updateEmployee(Employee emp) throws EmployeeException{
		// dao 의 직원 정보 수정 처리용 메서드 호출
		return empService.update(emp);
	}

	public int insertEmployee(Employee emp) throws EmployeeException{
		// dao 의 새 직원 등록 처리용 메서드 호출
		return empService.insert(emp);
	}
}
