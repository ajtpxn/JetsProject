package com.skilldistillery.jets;

public class FighterJet extends Plane {

	public FighterJet(double speed, int range, long price, String model, String name) {
		super(speed, range, price, model, name);
	}
	
	
	
	public void fight() {
		System.out.println(" fighting ");
	}
	
	

}
