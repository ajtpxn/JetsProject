package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	static JetsApplication run = new JetsApplication();

	public static void main(String[] args) {

		run.displayMenu();
		
	}
	
	
	public boolean displayMenu() {
		Airfield airfield = new Airfield();
		airfield.airfield();
		
		Scanner scanner = new Scanner(System.in);
		boolean stay = true;
		while (stay) {
			System.out.println();
			System.out.println("1. List fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest jet");
			System.out.println("4. View jet with longest range");
			System.out.println("5. Load all Cargo Jets");
			System.out.println("6. Dogfight!");
			System.out.println("7. Add a jet to Fleet");
			System.out.println("8. Quit");
			System.out.println();
			System.out.println("Please enter your choice: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				listFleet(airfield.airfield());
				break;

			case 2:
				flyAllJets(airfield.airfield());
				break;

			case 3:
				viewFastestJet(airfield.airfield());
				break;

			case 4:
				viewJetWithLongestRange(airfield.airfield());
				break;

			case 5:
				loadAllCargoJets(airfield.airfield());
				break;

			case 6:
				dogfight(airfield.airfield());
				break;

			case 7:
				addAJetToFleet(airfield.airfield());
				break;

			case 8:
				//quit
				stay = false;
				break;
				
			case 29:
				createFullArray(airfield.airfield());
				break;
				
			case 38:
				addHashToArray(airfield.airfield());
				break;
				
			default:
				System.out.println("Invalid input.");
				break;
				
			}
			stay = false;
		}
		return stay;
	}


	public void listFleet(Plane[] airfield) {  //1
		
		Plane[] fullArr = createFullArray(airfield);
				
		for (int i = 0; i < fullArr.length; i++) {
			
			System.out.println(fullArr[i].toListFleet());
			
		}
		
	}

	public void flyAllJets (Plane[] airfield) {  //2
		
		
		Plane[] fullArr = createFullArray(airfield);
		
		for (int i = 0; i < fullArr.length; i++) {
			
			fullArr[i].fly();
			
		}
		
	}

	public void viewFastestJet (Plane[] airfield) {  //3
		
		double fast = 0;
		double speed = 0;
		int fastestHash = 0;
		PlaneImpl[] airFieldWithHashes= addHashToArray(airfield);
		
		for (int i = 0; i < airFieldWithHashes.length; i++) {
			
			speed = airFieldWithHashes[i].getSpeed();
			if (fast < speed) {
				fast = speed;
				fastestHash = airFieldWithHashes[i].getHash();
			}
		}
		System.out.println();
		System.out.println("Hash: " + fastestHash);
		PlaneImpl fastestPlane = new PlaneImpl();
		fastestPlane = planeFromHash(airFieldWithHashes, fastestHash);
		fastestPlane.fly();

	}

	public void viewJetWithLongestRange (Plane[] airfield) {  //4
		
		double longest = 0;
		double range = 0;
		int longestHash = 0;
		PlaneImpl[] airFieldWithHashes= addHashToArray(airfield);
		
		for (int i = 0; i < airFieldWithHashes.length; i++) {
			
			range = airFieldWithHashes[i].getRange();
			if (longest < range) {
				longest = range;
				longestHash = airFieldWithHashes[i].getHash();
			}
		}
		System.out.println();
		System.out.println("Hash: " + longestHash);
		PlaneImpl longestPlane = new PlaneImpl();
		longestPlane = planeFromHash(airFieldWithHashes, longestHash);
		longestPlane.fly();
		
		
	}
	
	public void loadAllCargoJets (Plane[] airfield) {  //5
		
		for (int i = 0; i < airfield.length; i++) {
			
			airfield[i].fly();
			
		}
		
	}

	public void dogfight (Plane[] airfield) {  //6
		
		for (int i = 0; i < airfield.length; i++) {
			
			airfield[i].fly();
			
		}

	}

	public void addAJetToFleet (Plane[] airfield) {  //7
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input all the info for your the plane being added.");
		System.out.println("Name: ");
		System.out.println("Model: ");
		System.out.println("Speed: ");
		System.out.println("Price: ");
		System.out.println("Range: ");
		
		PlaneImpl newPlane = new PlaneImpl();
		for (int i = 0; i < airfield.length; i++) {
			if (airfield[i] == null) {
				airfield[i] = newPlane;
			}
		}
		
		Plane[] outputArr = createFullArray(airfield);
		for (int i = 0; i < outputArr.length; i++) {
			System.out.println(outputArr[i].toListFleet());
		}

	}
	
	
	public PlaneImpl[] addHashToArray (Plane[] inputArr) {

		Plane[] fullArr = createFullArray(inputArr);
		PlaneImpl[] outputArr = new PlaneImpl[fullArr.length];
		
		for (int i = 0; i < fullArr.length; i++) {
			outputArr[i] = new PlaneImpl(inputArr[i].getSpeed(), inputArr[i].getRange(), inputArr[i].getPrice(),
					inputArr[i].getModel(), inputArr[i].getName(), inputArr[i].hashCode());
		}
		return outputArr;
	}

	public Plane[] createFullArray (Plane[] inputArr) {
		
		String model = null;
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


}
