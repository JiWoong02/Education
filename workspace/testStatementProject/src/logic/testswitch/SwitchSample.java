package logic.testswitch;

import java.util.Scanner;

public class SwitchSample {
	/*
	 * switch(변수 또는 계산식) { //값이 뭐냐? (변수 == 값) case 값: 값이 맞았을 때 실행할 문장; break; case
	 * 값: ................; break; ......... default: 위에 제시한 값이 모두 아닐 때 실행할 문장; } =>
	 * default는 사용 안 할수도 있다. => case 에 사용하는 값은 양의 정수, 문자 리터럴, 문자열값
	 */

	public void test1() {
		// 정수를 하나 입력받아서
		// 1이면 "입장하세요." 라고 출력
		// 2이면 "줄 서세요." 라고 출력
		// 3이면 "퇴장하세요." 출력
		// 제시한 값이 모두 아니면 "즐겁게 구경하세요." 출력 처리함
		System.out.println("정수를 입력해주세요 : ");
		int num = new Scanner(System.in).nextInt();
		switch (num) {
		case 1:
			System.out.println("입장하세요");
			break;
		case 2:
			System.out.println("줄 서세요");
			break;
		case 3:
			System.out.println("퇴장하세요");
			break;
		default:
			System.out.println("즐겁게 구경하세요.");
		}
	}

	public void calculator() {
		/*
		 * 입력 예 : 첫번째 정수 : 25 두번째 정수 : 7 연산문자 (+, -, *, /, %) : + 출력 예 : 25 + 7 = 32 =>
		 * 입력된 연산문자에 따라 계산식과 결과가 출력되게 구현
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력해주세요 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수를 입력해주세요 : ");
		int second = sc.nextInt();
		System.out.print("연산문자를 선택해주세요.(+, -, *, /, %) : ");
		char cal = sc.next().charAt(0);

		/*
		 * switch(cal) { case '+' : System.out.println(first+" "+cal + " " +
		 * second+" = " + (first + second)); break; case '-' :
		 * System.out.println(first+" "+cal + " " + second+" = " + (first - second));
		 * break; case '*' : System.out.println(first+" "+cal + " " + second +" = " +
		 * (first * second)); break; case '/' : System.out.println(first+" "+cal + " " +
		 * second+" = " + (first / second)); break; case '%' :
		 * System.out.println(first+" "+cal + " " + second +" = " + (first % second));
		 * break; default : System.out.println("연산기호를 제대로 입력해 주세요." + "\n"+"다시 입력하세요.");
		 * }
		 */
		int result; // 지역변수는 반드시 초기화해야 함
		result = 0;
		switch (cal) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;
		case '%':
			result = first % second;
			break;
		default:
			System.out.println("연산기호를 제대로 입력해 주세요." + "\n" + "다시 입력하세요.");
		}
		if (result != 0) {
			System.out.println(first + " " + cal + " " + second + " = " + result);
		}
	}

	public void calculator2() {
		/*
		 * 과일명(String)과 수량(int)을 입력받아, 가격을 계산해서 출력 과일에 따라 한개의 가격 저장용 변수 준비 : int price;
		 * 사과 1200 배 2500 포도 5000 오렌지 500 키위 350 그외 다른 과일은 0
		 * 
		 * 총구매가격 : price * 수량 출력 : 사과 한 개의 가격은 1200원 구매수량은 5개 총 구매가격 : 6000원
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하실 과일을 입력해주세요(사과, 배, 포도, 오렌지, 키위) : ");
		String fruit = sc.next();
		int price = 0;
		switch (fruit) {
		case "사과":
			price = 1200;
			break;
		case "배":
			price = 2500;
			break;
		case "포도":
			price = 5000;
			break;
		case "오렌지":
			price = 500;
			break;
		case "키위":
			price = 350;
			break;
		default:
			System.out.println(fruit + "는 없는 과일입니다." + "\n" + "과일이름을 다시 입력해주세요.");
		}
		if (price != 0) {
			System.out.print("구매하실 수량을 입력해주세요 : ");
			int ea = sc.nextInt();
			System.out.println(fruit + " 한 개의 가격은 " + price + "원" + "\n" + "구매 수량 : " + ea + "개" + "총 구매 가격 : "
					+ (price * ea) + "원");
		}
	}

	public void calculator2ChangeIfElse() {

		Scanner sc = new Scanner(System.in);
		System.out.print("구매하실 과일을 입력해주세요(사과, 배, 포도, 오렌지, 키위) : ");
		String fruit = sc.next();
		int price = 0;
		// 입력된 과일명이 판매되는 과일일 때만 아래 내용이 작동되게 함

		// 기본자료형(Primitive Type) 변수방에는 값이 기록됨
		// 연산자는 값을 계산함
		// 즉 "=="는 String을 계산할 수 없다. 서로의 주소를 비교하기 때문에
		// String메소드의 equals를 사용!!!!!!
		// 여기서 fruit은 클래스(Reference Type)를 자료형으로 만든 변수 => 레퍼런스 변수
		// 레퍼런스 변수방에는 할당된 객체의 주소가 기록됨
		// 레퍼런스.메소드(전달값)

		if (fruit.equals("사과")) {
			price = 1200;
		} else if (fruit.equals("배")) {
			price = 2500;
		} else if (fruit.equals("포도")) {
			price = 5000;
		} else if (fruit.equals("오렌지")) {
			price = 500;
		} else if (fruit.equals("키위")) {
			price = 350;
		} else {
			System.out.println(fruit + "는 없는 과일입니다." + "\n" + "과일이름을 다시 입력해주세요.");
		}
		if (price != 0) {
			System.out.print("구매하실 수량을 입력해주세요 : ");
			int ea = sc.nextInt();
			System.out.println(fruit + " 한 개의 가격은 " + price + "원" + "\n" + "구매 수량 : " + ea + "개 " + "총 구매 가격 : "
					+ (price * ea) + "원");
		}
		
//		switch를 if 문으로 변경
//		if (fruit.equals("사과")) {
//			price = 1200;
//		}  if (fruit.equals("배")) {
//			price = 2500;	
//		}  if (fruit.equals("포도")) {
//			price = 5000;
//		}  if (fruit.equals("오렌지")) {
//			price = 500;
//		}  if (fruit.equals("키위")) {
//			price = 350;
//		} else {
//			System.out.println(fruit + "는 없는 과일입니다." + "\n" + "과일이름을 다시 입력해주세요.");
//		}
//		if (price != 0) {
//			System.out.print("구매하실 수량을 입력해주세요 : ");
//			int ea = sc.nextInt();
//			System.out.println(fruit + " 한 개의 가격은 " + price + "원" + "\n" + "구매 수량 : " + ea + "개" + "총 구매 가격 : "
//					+ (price * ea) + "원");
//		}
	}
}
