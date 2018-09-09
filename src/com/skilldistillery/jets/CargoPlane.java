package com.skilldistillery.jets;

public class CargoPlane extends Plane implements CargoCarrier {
	
	private int tonsOfCargo = 0;

	public CargoPlane(double speed, int range, long price, String model, String name) {
		super(speed, range, price, model, name);
	}
	
	public CargoPlane(double speed, int range, long price, String model, String name, int tonsOfCargo) {
		super(speed, range, price, model, name);
		this.tonsOfCargo = tonsOfCargo;
	}
	

	@Override
	public void loadCargo() {
		
		System.out.println("Plane " + getName() + " loaded with " + tonsOfCargo + " tons of cargo.");
		
	}

	public int getTonsOfCargo() {
		return tonsOfCargo;
	}

	public void setTonsOfCargo(int tonsOfCargo) {
		this.tonsOfCargo = tonsOfCargo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + tonsOfCargo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CargoPlane other = (CargoPlane) obj;
		if (tonsOfCargo != other.tonsOfCargo)
			return false;
		return true;
	}
	
	

}
