package com.skilldistillery.jets;

public class JetsTesterApp {
	
	static JetsTesterApp run = new JetsTesterApp();

	public static void main(String[] args) {
		
		run.test();

	}
	
	public void test() {
		
		
		
		CargoPlane cargo = new CargoPlane(44, 82, 12, "C-222", "CargoTestOne");
		
		cargo.getThisClass();
		
		
	}

}
