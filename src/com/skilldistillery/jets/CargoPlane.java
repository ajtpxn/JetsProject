package com.skilldistillery.jets;

public class CargoPlane extends Plane implements CargoCarrier {
	
	private int tonsOfCargo = 0;

	public CargoPlane(double speed, int range, long price, String model, String name) {
		super(speed, range, price, model, name);
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
	
	public void getThisClass() {

		System.out.println("this.getClass().getSimpleName(): " + this.getClass().getSimpleName());
		System.out.println("super.getClass().getSimpleName(): " + super.getClass().getSimpleName());
		System.out.println("this.getClass(): " + this.getClass());
		
		boolean isCargoCarrier = false;
		
		System.out.println(isCargoCarrier);
		System.out.println(CargoCarrier.class);
		System.out.println(CargoCarrier.class);
		
		
		if (this.getClass() instanceof ) {
			System.out.println("yest");
			System.out.println(CargoCarrier.class);
			System.out.println(this.getClass() instanceof CargoCarrier.class);
		}
			
	
	}

}
