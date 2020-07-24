package org.Main;

import org.Child.*;
import org.Parent.*;

public class Demo 
{
	public static void main (String[] args)
	{
		Bike bike = new Bike("Long","Petrol",2,2,20,"Kawasaki");
		System.out.println("Handle = "+bike.getHandle());
		System.out.println("Engine = "+bike.getEngine());
		System.out.println("Steats = "+bike.getSeats());
		System.out.println("Wheels = "+bike.getWheels());
		System.out.println("FuelTank = "+bike.getFuelTank());
		System.out.println("Company = "+bike.getCompany());
	
		Car car = new Car();
		System.out.println("Steering = "+car.getSteering());
		
		
	}
	

}
