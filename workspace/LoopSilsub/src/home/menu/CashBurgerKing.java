package home.menu;

import java.util.Scanner;

public class CashBurgerKing {
	Scanner sc = new Scanner(System.in);

	public void selectMenu() {
		int price=0,tot,totalPrice = 0;
		String orderList = ""; String menu = "";
		char answer = 'n';
		do {
			answer = 'n';
			System.out.println("*** 메뉴를 선택하세요 ***" + "\n");
			System.out.println("1. 불고기버거	3500원");
			System.out.println("2. 치킨버거	3200원");
			System.out.println("추가 ****************");
			System.out.println("3. 감자튀김	1000원");
			System.out.println("4. 치즈스틱	400원");
			System.out.println("5. 샐러드		2000원");
			System.out.println("음료수 ***************");
			System.out.println("6. 콜라		700원");
			System.out.println("7. 에이드		1200원");
			System.out.println("8. 커피		1000원");
			System.out.println("********************");
			System.out.print("메뉴 선택 : ");
			int select = sc.nextInt();
//			if (select < 1 || select > 9) {
//				System.out.println("올바른 번호를 입력해주세요.");
//			} else {
				switch (select) {
				case 1:
					menu = "불고기버거";
					price = 3500;
					break;
				case 2:
					menu = "치킨버거";
					price = 3200;
					break;
				case 3:
					menu = "감자튀김";
					price = 1000;
					break;
				case 4:
					menu = "치즈스틱";
					price = 400;
					break;
				case 5:
					menu = "샐러드";
					price = 2000;
					break;
				case 6:
					menu = "콜라";
					price = 700;
					break;
				case 7:
					menu = "에이드";
					price = 1200;
					break;
				case 8:
					menu = "커피";
					price = 1000;
					break;
				default:
					System.out.println("없는 항목을 선택하였습니다.");
					System.out.println("다시 선택해주세요.");
					answer='y';
				}
				if(answer=='y')
					continue;
				
				System.out.println("메뉴 선택 : " + select + "\n" + menu + "를 선택하셨습니다.");
				System.out.print("수량은 ? ");
				int ea = sc.nextInt();
				System.out.println(ea + " 개 주문하셨습니다.");
				
				tot = price * ea;
				orderList += menu + " : " + ea + "개  - " + price + " 원 " + "\n";
				totalPrice += tot;
				
				
				System.out.print("추가주문 하시겠습니까?(y/n)");
				answer = sc.next().charAt(0);
				
		}while (answer=='y');
		
		System.out.println("* 주문하신 정보는 다음과 같습니다. *");
		System.out.println("------------------------------------------------");
		System.out.print(orderList);
		System.out.println("------------------------------------------------");
		System.out.println("총 가격 : " + totalPrice + "원");

	}
}
