package com.skilldistillery.jets;

public class FighterJet extends Plane implements CombatReady {

	public FighterJet(double speed, int range, long price, String model, String name) {
		super(speed, range, price, model, name);
	}
	
	@Override
	public void fight(PlaneImpl inputPlane) {
		System.out.println(inputPlane.getName() + " fighting! ");
	}


	@Override
	public void allFight(PlaneImpl[] inputArr) {
		
		for (int i = 0; i < inputArr.length; i++) {
//			inputArr[i].fight();
		}
		
	}
	
	

}
