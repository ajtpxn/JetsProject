package com.skilldistillery.jets;

public class PlaneImpl extends Plane {
	
	private int hash = 0;
	

	public PlaneImpl(double speed, int range, long price, String model, String name) {
		super(speed, range, price, model, name);
	}

	public PlaneImpl() {
		super();
	}
	
	public PlaneImpl(double speed, int range, long price, String model, String name, int hash) {
		super(speed, range, price, model, name);
		this.hash = hash;
	}

	public int getHash() {
		return hash;
	}

	public void setHash(int hash) {
		this.hash = hash;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + hash;
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
		PlaneImpl other = (PlaneImpl) obj;
		if (hash != other.hash)
			return false;
		return true;
	}
	
	
	
	

}
