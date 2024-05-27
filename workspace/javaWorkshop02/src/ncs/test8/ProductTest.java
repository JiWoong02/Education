package ncs.test8;

public class ProductTest {

	public static void main(String[] args) {
		Product pdt = new Product("갤럭시 s7", 563500, 3);
		System.out.println(pdt.information());
		System.out.println("총 구매 가격 : " + pdt.getPrice()*pdt.getQuantity() + " 원");
	}

}
