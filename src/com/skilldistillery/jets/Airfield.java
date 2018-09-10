package com.skilldistillery.jets;

import java.util.Arrays;

public class Airfield {
	
	private Plane[] planes = new Plane[12];
	
	public Plane[] airfield() {
		
		planes[0] = new FighterJet(520, 123, 10_000_000, "F-1", "FighterOne");
		planes[1] = new CargoPlane(230, 456, 20_000_000, "C-130", "CargoOne  ");
		planes[2] = new FighterJet(430, 321, 40_000_000, "F-2", "FighterTwo");
		planes[3] = new CargoPlane(300, 789, 400_000_000, "C-230", "CargoTwo  ");
		planes[4] = new FighterJet(1200, 324, 354_000_000, "F-3", "FighterThree");
		planes[5] = new CargoPlane(90, 1234, 40_000_000, "C-330", "CargoThree");
		planes[6] = new FighterJet(403, 263, 231_000_000, "F-4", "FighterFour");
		planes[7] = new CargoPlane(190, 300, 100_000_000, "C-430", "CargoFour");
		
		
		for (int i = 0; i < planes.length; i++) {
			
		}
		
		
		return planes;
	}

	

}
