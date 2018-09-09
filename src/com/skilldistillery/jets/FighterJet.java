package com.skilldistillery.jets;

public class FighterJet extends Plane implements CombatReady {

	public FighterJet(double speed, int range, long price, String model, String name) {
		super(speed, range, price, model, name);
	}
	
	@Override
	public void fight() {
		System.out.println(getName() + " fighting! ");
	}


	@Override
	public void allFight(Plane[] inputArr) {
		
		for (int i = 0; i < inputArr.length; i++) {
			((FighterJet) inputArr[i]).fight();
		}
		
	}

	
	

}
