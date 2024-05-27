package ncs.test7;

public class Airplane extends Plane {

	public Airplane() {
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	public void refuel(int fuel) {
		
	}// 주유
	@Override
	public void flight(int distance) {
		this.setFuelSize(this.getFuelSize()-(distance*3));
	}// 운항
}
