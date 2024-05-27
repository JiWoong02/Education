package inherit.polymorphism.model;

public class Triangle implements IShape {

	//Field
	private double base;
	private double height;
	
	public Triangle() {}
	
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public double getHypotenuse() {
		return Math.sqrt(this.base*this.base+this.height*this.height);
	}

	@Override
	public double area() {
		return (this.base*this.height)/2;
	}

	@Override
	public double perimeter() {
		//둘레길이 = 밑변 + 높이 + 빗변길이
		return this.base+this.height+this.getHypotenuse();
	}

}
