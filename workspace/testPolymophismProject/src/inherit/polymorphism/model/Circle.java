package inherit.polymorphism.model;

public class Circle implements IShape {

	private double radius;
	
	public Circle() {}
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}



	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.getRadius()*this.getRadius()*Math.PI;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return this.getRadius()*2*Math.PI;
	}

}
