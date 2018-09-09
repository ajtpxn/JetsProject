package com.skilldistillery.jets;

import java.util.Arrays;

public class Airfield {
	
	private Plane[] planes = new Plane[12];
	
	public Plane[] airfield() {
		
		planes[0] = new FighterJet(12, 123, 100, "F-1", "FighterOne");
		planes[1] = new CargoPlane(23, 456, 2000, "C-130", "CargoOne  ");
		planes[2] = new FighterJet(43, 321, 40, "F-1", "FighterTwo");
		planes[3] = new CargoPlane(200, 789, 400, "C-130", "CargoTwo  ");
		planes[4] = new FighterJet(200, 324, 354, "F-1", "FighterThree");
		planes[5] = new CargoPlane(2, 1234, 400, "C-130", "CargoThree");
		planes[6] = new FighterJet(400, 263, 231, "F-1", "FighterFour");
		planes[7] = new CargoPlane(19, 300, 400, "C-130", "CargoFour");
		
		
		for (int i = 0; i < planes.length; i++) {
			
		}
		
		
		return planes;
	}

	

}
