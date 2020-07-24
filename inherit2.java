package org.Child;
import org.Parent.*;

public class Car extends Vehicle

{
	private String airConditioner;
	private String musicSystem;
	private String fridge;
	private String steering;
	
	//default cons
	public Car() 
	{
			this.airConditioner = "Daikan";
			this.musicSystem = "Sony";
			this.fridge = "LG";
			this.steering = "Yes";
			
	}

	//paramatised cons
	public Car(String airConditioner, String musicSystem, String fridge,
			String steering) 
	{
		
		this.airConditioner = airConditioner;
		this.musicSystem = musicSystem;
		this.fridge = fridge;
		this.steering = steering;
	}

	
	public String getAirConditioner() {
		return airConditioner;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public String getFridge() {
		return fridge;
	}

	public String getSteering() {
		return steering;
	}


	
	
	
	
}
