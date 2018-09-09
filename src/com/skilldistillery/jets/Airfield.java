package com.skilldistillery.jets;

import java.util.Arrays;

public class Airfield {
	
	private Plane[] planes = new Plane[80];
	
	public Plane[] airfield() {
		
		planes[0] = new FighterJet(12, 300, 400, "F-1", "FighterOne");
		planes[1] = new CargoPlane(23, 300, 400, "C-130", "CargoOne");
		planes[2] = new FighterJet(43, 300, 400, "F-1", "FighterTwo");
		planes[3] = new CargoPlane(200, 300, 400, "C-130", "CargoTwo");
		planes[4] = new FighterJet(200, 300, 400, "F-1", "FighterThree");
		planes[5] = new CargoPlane(2, 300, 400, "C-130", "CargoThree");
		planes[6] = new FighterJet(400, 300, 400, "F-1", "FighterFour");
		planes[7] = new CargoPlane(19, 300, 400, "C-130", "CargoFour");
		
		
		for (int i = 0; i < planes.length; i++) {
			
		}
		
		
		return planes;
	}

	

}
