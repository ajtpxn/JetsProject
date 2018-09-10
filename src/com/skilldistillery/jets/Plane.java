package com.skilldistillery.jets;

import java.text.NumberFormat;
import java.util.Scanner;

public abstract class Plane {
	
	private double speed = 0.0;
	private int range = 0;
	private long price = 0;
	private String model = null;
	private String name = null;
	private double flightTime = 0.0;
	private double speedInMach = 0.0;
	

	
			
	public Plane(double speed, int range, long price, String model, String name) {
		super();
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.model = model;
		this.name = name;
	}
	
	public Plane(double speed, int range, long price, String model, String name, double flightTime, 
			double speedInMach) {
		super();
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.model = model;
		this.name = name;
		this.flightTime = flightTime;
		this.speedInMach = speedInMach;
	}
	
	public Plane() {
		
	}
	
	
	public void fly() {
		flightTime = (double)range / speed;
		speedInMach = speed / 980;
		String formatedPrice = formatedPrice = NumberFormat.getCurrencyInstance().format(price);
		
		System.out.println("******** fly ********");
		System.out.println("Name: " + name);
		System.out.println("Model: " + model);
		System.out.println("Speed: " + speed);
		System.out.println("Price: " + formatedPrice);
		System.out.println("Range: " + range);
		System.out.println("Flight Time: " + flightTime);
		System.out.println("Speed in Mach: " + speedInMach);
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(flightTime);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (price ^ (price >>> 32));
		result = prime * result + range;
		temp = Double.doubleToLongBits(speed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(speedInMach);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane other = (Plane) obj;
		if (Double.doubleToLongBits(flightTime) != Double.doubleToLongBits(other.flightTime))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (range != other.range)
			return false;
		if (Double.doubleToLongBits(speed) != Double.doubleToLongBits(other.speed))
			return false;
		if (Double.doubleToLongBits(speedInMach) != Double.doubleToLongBits(other.speedInMach))
			return false;
		return true;
	}

	public String toListFleet() {
		String formatedPrice = formatedPrice = NumberFormat.getCurrencyInstance().format(price);
		return "Name: " + name + ",\t\tSpeed: " + speed + ",\tRange: " + range + ",\tPrice: " + formatedPrice + ",\tModel: " + model;
	}
	
	
	private Plane[] planeArr;
	
	
	public void setAddAPlaneToFleetClass(Plane[] inputArr) {
		Plane[] outputPlane = null;
		planeArr = outputPlane;
	}

	
}
