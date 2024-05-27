package inherit.polymorphism.model;

public class Rectangle implements IShape {
	//Field
	private double width, height;

	public Rectangle() {}
	
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public double area() {
		return this.getWidth()*this.getHeight();
	}

	@Override
	public double perimeter() {
		return 2*(this.getWidth()+this.getHeight());
	}

}
