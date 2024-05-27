package product.model.dto;

public class Product {

	private String product_id;
	private String p_name;
	private int price;
	private String description;

	public Product() {
	}
	
	public Product(String product_id, String p_name, int price, String description) {
		super();
		this.product_id = product_id;
		this.p_name = p_name;
		this.price = price;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "▷상품번호 : " + product_id + ", 상품이름 : " + p_name + "\n    상품가격 : " + price + ", 제품상세 : "
				+ description;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
