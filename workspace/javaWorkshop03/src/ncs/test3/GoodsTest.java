package ncs.test3;

import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Goods goods = new Goods();
		System.out.println("상품정보를 입력해주세요.");
		System.out.print("상품명 : ");
		goods.setName(sc.nextLine());
		System.out.print("가격 : ");
		goods.setPrice(sc.nextInt());
		System.out.print("수량 : ");
		goods.setQuantity(sc.nextInt());
		
		System.out.println("입력된 결과는 다음과 같습니다.");
		System.out.println(goods.toString());
		System.out.println("총 구매 가격 : "+ (goods.getPrice()*goods.getQuantity())+" 원");
	}


}
