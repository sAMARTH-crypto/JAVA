package org.Parent;


public class Vehicle

{
	private String engine;
	private int seats;
	private int wheels;
	private int fuelTank;
	private String company;
	
	
	public Vehicle()   // DEFAULT CONSTRUCTOR
	{ 
		this.engine =  "Petrol";
		this.seats =  4;
		this.wheels =  4;
		this.fuelTank = 35;
		this.company =  "lund";
		
		
	}

//PARAMATISED CONSTRUCTOR
	
	public Vehicle(String engine, int seats, int wheels, int fuelTank,
			String company) 
	{
		
		this.engine = engine;
		this.seats = seats;
		this.wheels = wheels;
		this.fuelTank = fuelTank;
		this.company = company;
	}

	

	public String getEngine() {
		return engine;
	}

	public int getSeats() {
		return seats;
	}

	public int getWheels() {
		return wheels;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public String getCompany() {
		return company;
	}
	
	

}
