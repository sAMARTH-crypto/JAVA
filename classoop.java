/*

class oop1 is accesing the class car
a basic example to explain
private entities
Getters & Setters
this - keyword
constructor

*/


public class oop1 
{
	public static void main(String [] args)
	
	{  // we will create a object to access the entities of class car
		
		Car car = new Car("closed","ignition","seated",10);   // created a object that is accessing the Car()
		
		System.out.println(car.run());         /*by manipulating the values of entities or attributes we are checking 
                                              wether the car is running or not
                                            */
		
		
	}

}


//________________________________________________________________________________________


public class Car 
{                             /* all the private entities cannot be accessed outside the the class without using 
                                  this - keyword or via constructor
                              */
	private String doors;
	private String engine;
	private String driver;
	private int speed;          
	
	// CREATING A CONSTRUCTOR
	// key note : constructor is always created below the specified class
	
	public Car(String doors, String engine, String driver, int speed)
                                              
                                          // What is a Constructor?
                                          //Constructor is used to initialize the object
	{
		
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
    
	}


  //___________________________________________________________________________________________
  

	public void setSpeed(int speed)             //Setters are the methods created manually to initialize the entities using this keyword 
	{
		this.speed = speed;
	}
  
	public int getSpeed()                       //Getters are used to return the value that has been set to a entity using setters
	{
		return speed;
	}
	
	public void setDoors(String doors)
	{
		this.doors = doors;
	}
	public String getDoors()
	{
		return doors;
	}
	
	public void setEngine(String engine)
	{
		this.engine = engine;
	}
	public String getEngine()
	{
		return engine;
	}
	
	public void setDriver(String driver)
	{
		this.driver = driver;
	}
	public String getDriver()
	{
		return driver;
	}
  //_________________________________________________________________________________________
	
	// adding functionality
	
	public String run()           /* last is to add the functionality to check that the values passed to the entities are wether true or false
                                  which will inturn return the desired output
                                */
	{
		if (doors.equals("closed") && engine.equals("ignition")
				&& driver.equals("seated") && speed >0)
		{
			return "running";
		}
		else
		{
			return "notrunning";
		}
	}
	

}
