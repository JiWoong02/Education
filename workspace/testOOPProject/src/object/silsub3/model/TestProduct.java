package object.silsub3.model;

public class TestProduct {

	public static void main(String[] args) {
// - main() 에서 구현함
//		1. 매개변수 있는 생성자를 사용해서 3개의 객체를 생성함
//		2. 객체가 가진 필드값 출력확인
//		<출력예>
//		ssgnote6	  갤럭시노트6  경기도수원  960000  10.0
//		lgxnote5	  LG스마트폰5  경기도평택  780000  0.7
//		ktnorm3	  KT일반폰3   서울시강남  25000  0.3
		Product pdt1 = new Product("ssgnote6", "갤럭시노트6", "경기도수원", 960000, 10.0);
		Product pdt2 = new Product("lgxnote5", "LG스마트폰5", "경기도평택", 780000, 0.7);
		Product pdt3 = new Product("ktnorm3", "KT일반폰3", "서울시강남", 25000, 0.3);
		
		pdt1.information();
		pdt2.information();
		pdt3.information();
		
		pdt1.setPrice(1200000);
		pdt2.setPrice(1200000);
		pdt3.setPrice(1200000);
		pdt1.setTax(0.5);
		pdt2.setTax(0.5);
		pdt3.setTax(0.5);
		
		pdt1.setTax(0.05);
		pdt2.setTax(0.05);
		pdt3.setTax(0.05);
		
		int includeTaxPrice1 = (int)(pdt1.getPrice()+(pdt1.getPrice()*pdt1.getTax()));
		int includeTaxPrice2 = (int)(pdt2.getPrice()+(pdt2.getPrice()*pdt2.getTax()));
		int includeTaxPrice3 = (int)(pdt3.getPrice()+(pdt3.getPrice()*pdt3.getTax()));
		
		System.out.println("상품명 : " + pdt1.getProductName());
		System.out.println("부가세 포함 가격  : " + includeTaxPrice1);
		System.out.println("상품명 : " + pdt2.getProductName());
		System.out.println("부가세 포함 가격  : " + includeTaxPrice2);
		System.out.println("상품명 : " + pdt3.getProductName());
		System.out.println("부가세 포함 가격  : " + includeTaxPrice3);
	}

}
