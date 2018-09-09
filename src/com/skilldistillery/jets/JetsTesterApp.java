package com.skilldistillery.jets;

public class JetsTesterApp {
	
	public static void main(String[] args) {
		
		CargoCarrier[] carriers;
		
		Airfield airfield = new Airfield();
		Plane[] airfieldPlanes = airfield.airfield();
		
		Math.random();
		
		int count = 0;
		for (int i = 0; i < airfieldPlanes.length; i++) {
			if (airfieldPlanes[i] instanceof CargoCarrier) {
				count++;
			}
			else {
			}
		}
		carriers = new CargoCarrier[count];
		for (int i = 0; i < airfieldPlanes.length; i++) {
			if (airfieldPlanes[i] instanceof CargoCarrier) {
				for (int k = 0; k < carriers.length; k++) {
					if (carriers[k] == null) {
						carriers[k] = (CargoCarrier)airfieldPlanes[i];
						break;
					}
				}
			}
		}
		for (int i = 0; i < carriers.length; i++) {
			carriers[i].loadCargo();
		}
	}
	
	public int addCargo() {
		int cargo = 1;
		
		
		return cargo;
	}
}
