package ncs.test5;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력해주세요. : ");
		int first = sc.nextInt();
		System.out.println();
		System.out.print("두 번째 정수를 입력해주세요. : ");
		int second = sc.nextInt();
		if(first>=0&&first<=9&&second>=0&&second<=9) {
		Calculate cal = new Calculate();
		System.out.println(cal.sum(first, second));
		System.out.println(cal.substract(first, second));
		System.out.println(cal.multiply(first, second));
		System.out.println(cal.divide(first, second));}
		else {System.out.println("다시 진행하세요");}
	}
}
