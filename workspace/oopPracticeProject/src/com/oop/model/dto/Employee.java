package com.oop.model.dto;

import java.util.Scanner;

public class Employee {
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	public void empInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사원번호를 입력해 주세요 : ");
		this.empNo = sc.nextInt();
		System.out.print("이름 입력해 주세요 : ");
		this.empName = sc.next();
		System.out.print("소속부서를 입력해 주세요 : ");
		this.dept = sc.next();
		System.out.print("직급을 입력해 주세요 : ");
		this.job = sc.next();
		System.out.print("나이를 입력해 주세요 : ");
		this.age = sc.nextInt();
		System.out.print("성별 입력해 주세요 : ");
		this.gender = sc.next().charAt(0);
		System.out.print("급여를 입력해 주세요 : ");
		this.salary = sc.nextInt();
		System.out.print("보너스포인트를 입력해 주세요 : ");
		this.bonusPoint = sc.nextDouble();
		System.out.print("핸드폰번호를 입력해 주세요 : ");
		this.phone = sc.next();
		System.out.print("주소를 입력해 주세요 : ");
		this.address = sc.next();	
	}
	public void empOutput() {
		System.out.println("사원번호 : " +empNo );
		System.out.println("이름 : " +empNo );
		System.out.println("소속부서 : " +dept );
		System.out.println("직급 : " +job );
		System.out.println("나이 : " +age );
		System.out.println("성별 : " +gender );
		System.out.println("급여 : " +salary );
		System.out.println("보너스포인트 : " +bonusPoint );
		System.out.println("연봉 : " + (int)((salary*12)+salary*bonusPoint));
		System.out.println("핸드폰번호 : " +phone );
		System.out.println("주소 : " +address );
	}
	public void setEmpName(String newname) {
		this.empName = newname;
	}
	public void setSalary(int newSalary) {
		this.salary = newSalary;
	}
	public void setDept(String newDept) {
		this.dept = newDept;
	}
	public void setJob(String newJob) {
		this.job = newJob;
	}
	public void delete() {
		this.empNo = 0;
		this.empName = "null";
		this.dept = "null";
		this.job = "null";
		this.age = 0;
		this.gender = '0';
		this.salary = 0;
		this.bonusPoint = 0.0;
		this.phone = "null";
		this.address = "null";
		
	}
}
