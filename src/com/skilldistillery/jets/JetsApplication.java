package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	static JetsApplication run = new JetsApplication();

	public static void main(String[] args) {
		run.displayMenu();
	}
	
	Airfield airfield = new Airfield();
	Plane[] planes = airfield.airfield();
	
	public boolean displayMenu() {
		Scanner scanner = new Scanner(System.in);
		boolean stay = true;
		while (stay) {
			System.out.println();
			System.out.println("1. List fleet");
			System.out.println("2. Fly all planes");
			System.out.println("3. View fastest plane");
			System.out.println("4. View plane with longest range");
			System.out.println("5. Load all cargo planes");
			System.out.println("6. Dogfight!");
			System.out.println("7. Add a plane to the fleet");
			System.out.println("8. Quit");
			System.out.println();
			System.out.println("Please enter your choice: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				listFleet();
				break;
			case 2:
				flyAllJets();
				break;
			case 3:
				viewFastestJet();
				break;
			case 4:
				viewJetWithLongestRange();
				break;
			case 5:
				loadAllCargoJets();
				break;
			case 6:
				dogfight();
				break;
			case 7:
				addAJetToFleet();
				break;
			case 8:
				stay = false;  //quit
				break;
			default:
				System.out.println("Invalid input.");
				break;
			}
		}
		return stay;
	}

	public void listFleet() {  //1*******************************************1
		Plane[] fullArr = createFullArray(planes);
		for (int i = 0; i < fullArr.length; i++) {
			System.out.println(fullArr[i].toListFleet());
		}
	}

	public void flyAllJets () {  //2*******************************************2
		Plane[] fullArr = createFullArray(planes);
		for (int i = 0; i < fullArr.length; i++) {
			fullArr[i].fly();
		}
	}

	public void viewFastestJet () {  //3*******************************************3
		double fast = 0;
		double speed = 0;
		int fastestHash = 0;
		PlaneImpl[] airFieldWithHashes = addHashToArray(planes);
		for (int i = 0; i < airFieldWithHashes.length; i++) {
			speed = airFieldWithHashes[i].getSpeed();
			if (fast < speed) {
				fast = speed;
				fastestHash = airFieldWithHashes[i].getHash();
			}
		}
		System.out.println();
		System.out.println("Fastest Plane:");
		PlaneImpl fastestPlane = new PlaneImpl();
		fastestPlane = planeFromHash(airFieldWithHashes, fastestHash);
		fastestPlane.info();
	}

	public void viewJetWithLongestRange () {  //4*******************************************4
		double longest = 0;
		double range = 0;
		int longestHash = 0;
		PlaneImpl[] airFieldWithHashes= addHashToArray(planes);
		for (int i = 0; i < airFieldWithHashes.length; i++) {
			range = airFieldWithHashes[i].getRange();
			if (longest < range) {
				longest = range;
				longestHash = airFieldWithHashes[i].getHash();
			}
		}
		System.out.println();
		System.out.println("Plane with Longest Range:");
		PlaneImpl longestPlane = new PlaneImpl();
		longestPlane = planeFromHash(airFieldWithHashes, longestHash);
		longestPlane.info();
	}
	
	public void loadAllCargoJets () { //5*******************************************5
		int count = 0;
		Plane[] tempArr = null;
		tempArr = createFullArray(planes);
		for (int i = 0; i < tempArr.length; i++) {
			if (tempArr[i] instanceof CargoCarrier ) {
				count++;
			}
		}
		CargoPlane[] carriers = new CargoPlane[count];
		for (int i = 0; i < tempArr.length; i++) {
			if (tempArr[i] instanceof CargoCarrier) {
				for (int k = 0; k < carriers.length; k++) {
					if (carriers[k] == null) {
						carriers[k] = (CargoPlane)tempArr[i];
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

	public void dogfight () { //6*******************************************6
		int count = 0;
		Plane[] tempArr = null;
		tempArr = createFullArray(planes);
		for (int i = 0; i < tempArr.length; i++) {
			if (tempArr[i] instanceof CombatReady ) {
				count++;
			}
		}
		FighterJet[] fighters = new FighterJet[count];
		for (int i = 0; i < tempArr.length; i++) {
			if (tempArr[i] instanceof CombatReady) {
				for (int k = 0; k < fighters.length; k++) {
					if (fighters[k] == null) {
						fighters[k] = (FighterJet)tempArr[i];
						break;
					}
				}
			}
		}
		for (int i = 0; i < fighters.length; i++) {
			fighters[i].fight();
		}
	}

	public void addAJetToFleet () {  //7*******************************************7
		double speed = 0.0;
		int range = 0;
		long price = 0;
		String model = null;
		String name = null;
		Scanner scanner = new Scanner(System.in);
		Plane newPlane = new PlaneImpl();
		System.out.println("What type of plane would you like to add?");
		System.out.println("(1) Fighter Plane");
		System.out.println("(2) Cargo Plane");
		int choice = scanner.nextInt();
		System.out.println("Please input all the info for your the plane being added.");
		System.out.println("Name: ");
		name = scanner.next();
		System.out.println("Model: ");
		model = scanner.next();
		System.out.println("Speed: ");
		speed = scanner.nextDouble();
		System.out.println("Price: ");
		price = scanner.nextLong();
		System.out.println("Range: ");
		range = scanner.nextInt();
		if (choice == 1) {
			newPlane = new FighterJet(speed, range, price, model, name);
		}
		else if (choice == 2) {
			newPlane = new CargoPlane(speed, range, price, model, name);
		}
		for (int i = 0; i < planes.length; i++) {
			if (planes[i] == null) {
				planes[i] = newPlane;
				break;
			}
		}
	}
	
	//************************************************************************************************************
	//************************************************************************************************************
	//************************************************************************************************************
	//************************************************************************************************************
	
	
	public PlaneImpl[] addHashToArray (Plane[] inputArr) {
		Plane[] fullArr = createFullArray(inputArr);
		PlaneImpl[] outputArr = new PlaneImpl[fullArr.length];
		for (int i = 0; i < fullArr.length; i++) {
			outputArr[i] = new PlaneImpl(inputArr[i].getSpeed(), inputArr[i].getRange(), inputArr[i].getPrice(),
					inputArr[i].getModel(), inputArr[i].getName(), inputArr[i].hashCode());
		}
		return outputArr;
	}

	//************************************************************************************************************
	//************************************************************************************************************
	
	public Plane[] createFullArray (Plane[] inputArr) {
		int count = 0;
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] != null) {
				count++;
			}
		}
		Plane[] fullArr = new Plane[count];
		for (int i = 0; i < fullArr.length; i++) {
			if (inputArr[i] != null) {
				fullArr[i] = inputArr[i];
			}
		}
		return fullArr;
	}
	
	//************************************************************************************************************
	//************************************************************************************************************
	
	public PlaneImpl planeFromHash (PlaneImpl[] inputArr, int inputHash) {
		PlaneImpl outputPlane = new PlaneImpl();
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i].getHash() == inputHash) {
				outputPlane = inputArr[i];
				break;
			}
		}
		return outputPlane;
	}
	
	//************************************************************************************************************
	//************************************************************************************************************
	
	
	public CargoPlane[] addCargoToArray (CargoPlane[] inputArr) {
		CargoPlane[] outputArr = new CargoPlane[inputArr.length];
		for (int i = 0; i < inputArr.length; i++) {
			outputArr[i] = new CargoPlane(inputArr[i].getSpeed(), inputArr[i].getRange(), inputArr[i].getPrice(),
					inputArr[i].getModel(), inputArr[i].getName(), (int)((Math.random()*70)+3));
		}
		return outputArr;
	}



}
