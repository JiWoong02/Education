package ncs.test7;

public abstract class Plane {
	private String planeName;
	private int fuelSize;
	public Plane() {}
	
	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}

	public abstract void refuel(int fuel);//주유
	public abstract void flight(int distance);//운항
}
