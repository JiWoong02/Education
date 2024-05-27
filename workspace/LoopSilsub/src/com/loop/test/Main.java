package com.loop.test;

public class Main {
	public static void main(String[] args) {
		
		public static void menu() {
			System.out.println("반복문 실습 실행 테스트 +++++++++++++++++");
			System.out.println("1. 문제1");
			System.out.println("1. 문제1");
			System.out.println("1. 문제1");
			System.out.println("1. 문제1");
			System.out.println("1. 문제1");
			System.out.println("메뉴 번호 선택 : ");
			Scanner sc = new Scanner(System.in);
		}
		ForWhile test = new ForWhile();
//		test.printStar1();
//		test.printStar2();
		CashBurgerKing ctest= new CashBurgerKing();
		ctest.selectMenu();
//		ctest.selectMenu();
		WhileTest wtest = new WhileTest();
//		wtest.countInputCharacter();
	}

}
