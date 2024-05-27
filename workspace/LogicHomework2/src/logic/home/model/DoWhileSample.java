package logic.home.model;

import java.util.Scanner;

public class DoWhileSample {
	Scanner sc = new Scanner(System.in);

	public void addDashToken() {
		// 문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기
		System.out.print("문자열을 입력해 주세요 : ");
		String str = sc.next();
		int count=0;
		do {
			if (count + 1 != str.length()) {
				System.out.print(str.charAt(count) + "-");
			} else {
				System.out.print(str.charAt(count));
			}
			count += 1;
		} while (str.length() != count);
	}

	public void burgerKingMenu() {
		String menu = "", orderList = "";
		char answer ='y';
		int price = 0 ,totPrice = 0, ea = 0;
		do {
		System.out.println("\n-----------메뉴판-----------\n");
		System.out.println("1. 불고기 버거 : 4000원");
		System.out.println("2. 새우 버거 : 3500원");
		System.out.println("3. 콜라 : 1500원");
		System.out.println("4. 사이다 : 2000원");
		System.out.print("메뉴 입력 : ");
		int no = sc.nextInt();
		switch(no) {
		case 1 : menu = "불고기 버거";
					price = 4000; break;
		case 2 : menu = "새우 버거";
		price = 3500; break;
		case 3 : menu = "콜라";
		price = 1500; break;
		case 4 : menu = "사이다";
		price = 2000; break;
		default : System.out.println("잘못된 번호를 입력했습니다. 다시 입력해주세요");
		}
		System.out.print("몇 개 주문하시겠습니까? : ");
		ea = sc.nextInt();
		orderList += menu +"  " +ea+"개 " +price + "원\n";
		totPrice += price*ea;
		System.out.print("추가로 주문하시겠습니까?(y/n)");
		answer = sc.next().charAt(0);
		}while(answer!='n');
		System.out.println("\n-------------주문내역-------------\n");
		System.out.println(orderList);
		System.out.println("--------------------------------------");
		System.out.println("총 금액 : " + totPrice + "원");

	}

	public void isStringAlphabet() {
		// 문자열 입력받아, "모든 글자 영문자다"/"영문자 아니다." 출력하기
		System.out.print("문자열을 입력해 주세요");
		String str = sc.next();
		int index = 0 ;
		char torf ='0';
		do {
			if((str.charAt(index)>='a'&&str.charAt(index)<='z')
					||(str.charAt(index)>='A'&&str.charAt(index)<='Z')) {			
			}else {torf = 'f';}
			index +=1;
		}while(str.length()!=index);
		if(torf=='f') {System.out.println("모든 글자가 영문자가 아닙니다.");}
		else {System.out.println("모든 글자가 영문자 입니다.");}
	}

}
