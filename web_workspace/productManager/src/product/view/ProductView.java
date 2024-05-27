package product.view;

import java.util.ArrayList;
import java.util.Scanner;

import product.controller.ProductController;
import product.exception.ProductException;
import product.model.dto.Product;

public class ProductView {
	private static ProductController pc = new ProductController();
	private static Scanner sc = new Scanner(System.in);

	public ProductView() {
	}

	int count;

	public void displayMenu() { // 메뉴 출력 및 컨트롤러 메소드 호출
		do {
			count = 0;
			System.out.println("1. 전체 조회");
			System.out.println("2. 추가");// 추가후 id로 조회 확인함
			System.out.println("3. 수정");// : id으로 조회 후 가격 수정함");
			System.out.println("4. 삭제");// : id로 조회 후 삭제함");
			System.out.println("5. 검색");// : 이름으로 조회함");
			System.out.println("6. 끝내기");
			System.out.println();
			System.out.print("번호입력 : ");
			int num = sc.nextInt();
			try {
				switch (num) {
				case 1:
					displayList(pc.selectAll());

					break;
				case 2:
					count = pc.insertRow(inputProduct());
					if (count > 0) {
						System.out.println("상품이 추가되었습니다.");
					}
					break;
				case 3:
					count = pc.updateRow(updateProduct());
					if (count > 0) {
						System.out.println("상품이 업데이트 되었습니다.");
					}
					break;
				case 4:
					count = pc.deleteRow(pc.selectRow(inputProductId()));

					if (count > 0) {
						System.out.println("상품이 삭제되었습니다.");
					}
					break;
				case 5:
					String name = inputProductName();
					ArrayList<Product> list =pc.selectName(name);
					if (list.size()>0) {
						System.out.println("입력하신 '"+name+"' 과 일치하는 상품 목록입니다.");
						displayList(list);
					}else {
						System.out.println("입력하신 '"+name+"' 와/과 일치하는 상품이 없습니다.");
					}

					
					break;
				case 6:
					System.out.println("정말 종료하시겠습니까?(y/n)");
					char answer = sc.next().toUpperCase().charAt(0);
					if (answer == 'Y') {
						System.out.println("상품관리 프로그램을 종료합니다.");
						return;
					} else
						break;
				default:
					System.out.println("잘못된 번호입니다. 다시입력해주세요");

				}
			} catch (ProductException e) {
				displayError(e);
			}

		} while (true);

	}

	public static void displayList(ArrayList<Product> list) { // 리스트 출력 처리
		for (int i = 0; i < list.size(); i++) {
			System.out.println("-----------------"+(i+1) + "번 상품 -----------------");
			System.out.println(list.get(i));
		}
		System.out.println("--------------------------------------------");

	}

	public static void displayRow(Product product) { // 한개 상품 출력 처리
		System.out.println(product);
	}

	public static String inputProductName() { // 조회할 상품 이름 입력용
		System.out.println("조회할 상품이름을 입력해주세요");
		return sc.next();
	}

	public static Product inputProduct() { // 새로 등록할 상품 정보 입력용

		System.out.print("상품 번호를 입력해주세요 : ");
		String product_id = sc.next();
		System.out.print("상품 이름을 입력해주세요 : ");
		String p_name = sc.next();
		System.out.print("상품 가격을 입력해주세요 : ");
		int price = sc.nextInt();
		System.out.print("상품 정보를 입력해주세요 : ");
		sc.next();
		String description = sc.nextLine();

		return new Product(product_id, p_name, price, description);
	}

//
	public static Product updateProduct() throws ProductException {// 상품아이디에 대한 상품가격 수정 입력용
		System.out.print("가격 변경할 상품 아이디를 입력해주세요 : ");
		String p_id = sc.next();
		System.out.print("변경할 가격을 입력해주세요 : ");
		int price = sc.nextInt();
		Product pct = pc.selectRow(p_id);
		pct.setPrice(price);
		return pct;
	}

//
	public static String inputProductId() { // 조회 또는 삭제할 상품아이디 입력용
		System.out.println("조회 또는 삭제할 상품아이디를 입력해주세요.");
		return sc.next();
	}

	public static void displayError(Exception e) {
		System.out.println("오류가 발생했습니다 .");
		System.out.println("관리자에게 문의하세요 .");
		System.out.println("오류 메세지 : " + e.getMessage());
	}
}
