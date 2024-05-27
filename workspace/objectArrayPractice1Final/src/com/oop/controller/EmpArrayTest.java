package com.oop.controller;

import com.oop.model.dto.Employee;

public class EmpArrayTest {

	public static void main(String[] args) {
//		Employee[] emp = new Employee[3];
		int[] yearSalary = new int[3];
//		emp[0] = new Employee();
//		emp[1] = new Employee(201503, "박길동", 29, 'M', "010-1234-5678", "경기도 의정부시");
//		emp[2] = new Employee(201004, "김철수", "개발부", "과장", 34, 'M', 4500000, 0.15, "010-2143-9876", "서울시 노원구 노원동 123");
		
		
		//객체 배열의 초기화
		Employee[] emp = new Employee[]{
				new Employee(),
				new Employee(201503, "박길동", 29, 'M', "010-1234-5678", "경기도 의정부시"),
				new Employee(201004, "김철수", "개발부", "과장", 34, 'M', 4500000, 0.15, "010-2143-9876", "서울시 노원구 노원동 123")
				};
		
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].empInformation());
		}
		emp[0].setEmpNo(201305);
		emp[0].setEmpName("이영희");
		emp[0].setDept("총무부");
		emp[0].setJob("대리");
		emp[0].setAge(28);
		emp[0].setGender('F');
		emp[0].setSalary(3750000);
		emp[0].setBonusPoint(0.1);
		emp[0].setPhone("010-9512-7534");
		emp[0].setAddress("경기도 동두천");
		
		emp[1].setDept("기획부");
		emp[1].setJob("사원");
		emp[1].setSalary(2900000);
		emp[1].setBonusPoint(0.05);
		for (int i = 0; i < emp.length; i++) {
			yearSalary[i] = (int) (emp[i].getSalary() + emp[i].getSalary() * emp[i].getBonusPoint()) * 12;
			System.out.println(emp[i].getEmpName() + "의 연봉 : " + yearSalary[i]);
		}
		System.out.println("직원들의 연봉의 평균 : " + (yearSalary[0] + yearSalary[1] + yearSalary[2]) / 3);

	}

}
