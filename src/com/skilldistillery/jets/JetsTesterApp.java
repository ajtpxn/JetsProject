package com.skilldistillery.jets;

public class JetsTesterApp {
	
	public static void main(String[] args) {
		
		CargoPlane[] carriers;
		
		Airfield airfield = new Airfield();
		Plane[] airfieldPlanes = airfield.airfield();
		
		int count = 0;
		for (int i = 0; i < airfieldPlanes.length; i++) {
			if (airfieldPlanes[i] instanceof CargoPlane) {
				count++;
			}
			else {
			}
		}
		carriers = new CargoPlane[count];
		for (int i = 0; i < airfieldPlanes.length; i++) {
			if (airfieldPlanes[i] instanceof CargoPlane) {
				for (int k = 0; k < carriers.length; k++) {
					if (carriers[k] == null) {
						carriers[k] = (CargoPlane)airfieldPlanes[i];
						break;
					}
				}
			}
		}
		
		CargoPlane[] carriersWithCargo = new CargoPlane[count];
		carriersWithCargo = addCargoToArray(carriers);
		
		
		
		for (int i = 0; i < carriersWithCargo.length; i++) {
			carriersWithCargo[i].loadCargo();
		}
		
		
		
		
	}
	
	
	public static CargoPlane[] addCargoToArray (CargoPlane[] inputArr) {
		CargoPlane[] outputArr = new CargoPlane[inputArr.length];
		for (int i = 0; i < inputArr.length; i++) {
			outputArr[i] = new CargoPlane(inputArr[i].getSpeed(), inputArr[i].getRange(), inputArr[i].getPrice(),
					inputArr[i].getModel(), inputArr[i].getName(), (int)(Math.random()*40));
		}
		return outputArr;
	}
	
	public static CargoPlane[] planeImplToCargo (PlaneImpl[] inputArr) {
		CargoPlane[] outputArr = new CargoPlane[inputArr.length];
		for (int i = 0; i < inputArr.length; i++) {
			outputArr[i] = new CargoPlane(inputArr[i].getSpeed(), inputArr[i].getRange(), inputArr[i].getPrice(),
					inputArr[i].getModel(), inputArr[i].getName(), 1);
		}
		return outputArr;
	}
	
}
