package ncs.test8;

public class Product {
	private String name;
	private int price;
	private int quantity;
	public Product() {}
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity=quantity;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public String information() {
		return "상품명 : " +this.name+"\n가격 : " + this.price+" 원\n수량 : "+ this.quantity + " 개";
	}
}
