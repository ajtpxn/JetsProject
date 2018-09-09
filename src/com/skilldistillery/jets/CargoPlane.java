package com.skilldistillery.jets;

public class CargoPlane extends Plane implements CargoCarrier {

	public CargoPlane(double speed, int range, long price, String model, String name) {
		super(speed, range, price, model, name);
	}

	@Override
	public void loadCargo() {
		
		System.out.println("Plane loaded.");
		
	}
	
	

}
