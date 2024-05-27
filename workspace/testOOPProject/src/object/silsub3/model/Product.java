package object.silsub3.model;

public class Product {
	private String productID;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	public Product() {}
	public Product(String productID, String productName, String productArea, int price, double tax) {
		this.productID=productID;
		this.productName=productName;
		this.productArea=productArea;
		this.price=price;
		this.tax=tax;
	}
	public void information() {
		System.out.println(this.productID+"\t"+this.productName+"\t"+this.productArea+"\t"+this.price+"\t"+this.tax+"\t");
	}
	public void setProductID(String productID) {
		this.productID=productID;
	}
	public void setProductName(String productName) {
		this.productName=productName;
	}
	public void setProductArea(String productArea) {
		this.productArea=productArea;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setTax(double tax) {
		this.tax=tax;
	}
	public String getProductID() {
		return this.productID;
	}
	public String getProductName() {
		return this.productName;
	}
	public String getProductArea() {
		return this.productArea;
	}
	public int getPrice() {
		return this.price;
	}
	public double getTax() {
		return this.tax;
	}
}
