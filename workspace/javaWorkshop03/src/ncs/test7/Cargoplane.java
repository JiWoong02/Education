package ncs.test7;

public class Cargoplane extends Plane {
	public Cargoplane() {}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	@Override
	public void refuel(int fuel) {

	}// 주유
	@Override
	public void flight(int distance) {

	}// 운항
	
	
}
