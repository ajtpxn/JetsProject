package com.skilldistillery.jets;

public class CargoPlane extends Plane implements CargoCarrier {
	
	private int tonsOfCargo = 0;

	public CargoPlane(double speed, int range, long price, String model, String name) {
		super(speed, range, price, model, name);
	}
	
	public CargoPlane(double speed, int range, long price, String model, String name, int tonsOfCargo) {
		super(speed, range, price, model, name);
		this.tonsOfCargo = tonsOfCargo;
	}
	

	@Override
	public void loadCargo() {
		
		System.out.println("Plane loaded with " + tonsOfCargo + " tons of cargo.");
		
	}

	public int getTonsOfCargo() {
		return tonsOfCargo;
	}

	public void setTonsOfCargo(int tonsOfCargo) {
		this.tonsOfCargo = tonsOfCargo;
	}

}
