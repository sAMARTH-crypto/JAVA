package Main;
import phone.OnePlus;
import phone.Iphone;
import phone.Phone;

public class Run {

	public static void main(String[] args) 
	{
		Phone Phone = new OnePlus(); // we can hover upon the name of classes and get the desired 
									//output 
		
		System.out.println("Processor: "+Phone.Processor());
		System.out.println("OS: "+Phone.OS());
		System.out.println("Space In GB:"+Phone.spaceInGB());
		
		
		
	
	}

}
