package logic.home.model;

import java.util.Scanner;

public class SwitchSample {

	public void calculator() {
		Scanner sc = new Scanner(System.in);
		// 두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기
		System.out.println("첫 번째 정수를 입력해주세요. : ");
		int first = sc.nextInt();
		System.out.println("두 번째 정수를 입력해주세요. : ");
		int second = sc.nextInt();
		System.out.println("연산문자를 하나 입력해주세요(+, -, *, /, %) : ");
		char cal = sc.next().charAt(0);
		int result = 0;
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
		}
		System.out.println("계산 결과 : " + first + " " + cal + " " + second + " = " + result);

	}

	public void fruitPrice() {
		// 과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("과일 이름을 입력해주세요(사과, 오렌지, 바나나, 수박) : ");
		String fruit = sc.next();
int price = 0;
String name ="";
		switch (fruit) {
		case "사과": name = "사과";price = 1500;
			break;
		case "오렌지":name = "오렌지";price = 2500;
			break;
		case "바나나":name = "바나나";price = 800;
			break;
		case "수박" : name = "수박";price = 5000;
			break;
		default:
			System.out.println(fruit +"은/는 없는 과일 입니다. 사과, 오렌지, 바나나, 수박 중에 입력해 주세요.");
		}
		if(price!=0) {
		System.out.println(name +"의 가격은 "+price+"원 입니다.");}

	}

}
