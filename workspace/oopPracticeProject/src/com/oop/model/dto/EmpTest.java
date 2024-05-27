package com.oop.model.dto;

import java.util.Scanner;

public class EmpTest {
	public static void main(String[] args) {
		EmpTest test = new EmpTest();
		test.mainMenu();
	}

	public static void modifyMenu(Employee e) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n*********** 사원 정보 수정메뉴 ************\n");
			System.out.println("1. 이름변경 ");
			System.out.println("2. 급여변경");
			System.out.println("3. 부서변경");
			System.out.println("4. 직급변경");
			System.out.println("5. 이전 메뉴로 이동");

			System.out.print("원하는 메뉴번호를 입력해주세요. :");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("변경할 이름을 입력해 주세요. : ");
				String changeName = sc.next();
				e.setEmpName(changeName);
				break;
			case 2:
				System.out.print("변경할 급여를 입력해 주세요. : ");
				String changeSalary = sc.next();
				e.setEmpName(changeSalary);
				;
				break;
			case 3:
				System.out.print("변경할 부서를 입력해 주세요. : ");
				String changeDept = sc.next();
				e.setEmpName(changeDept);
				;
				break;
			case 4:
				System.out.print("변경할 직급을 입력해 주세요. : ");
				String changeJob = sc.next();
				e.setEmpName(changeJob);
				return;
			case 5:
				;
				return;
			default:
				System.out.println("잘못된 번호를 입력하셨습니다. 번호를 다시 입력하세요.");
				continue;
			}
		} while (true);
	}
	public static void mainMenu() {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		EmpTest emptest = new EmpTest();
		do {
			System.out.println("\n*********** 사원 정보 관리 프로그램 ************\n");
			System.out.println("1. 새 사원 정보 입력 ");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원정보 출력");
			System.out.println("9. 끝내기");

			System.out.println("원하는 메뉴번호를 입력해주세요.");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				emp.empInput();
				break;
			case 2:
				modifyMenu(emp);
				break;
			case 3:
				System.out.print("정말로 지우시겠습니까? (y/n): ");
				char answer = sc.next().charAt(0);
				if (answer == 'y')
					emp =null;
				else if (answer == 'n')
					return;
				else
					System.out.println("'y'또는 'n'을 입력해주세요.");
				;
				break;
			case 4:
				emp.empOutput();
			case 9:
				;
				break;
			default:
				System.out.println("잘못된 번호를 입력하셨습니다. 번호를 다시 입력하세요.");
				continue;
			}
		} while (true);

	}
}
