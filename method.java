// methods are defined outside the main class and called inside the main class.

/*

BASIC syntax

public static void nameOftheMethod(parameter)

{
  logic;
}


*/



public class sumOfDigits 
{
	public static void main(String[] args)
	{
		
		
		starPatt();
		
		
		sum(12345);
		

	}
	
	public static void starPatt()
	{
		for (int i = 1;i <=5; i++)
		{
			for (int j = 1;j <=i;j++)
			{
				System.out.print("*");
				
			} 
			System.out.println( );
		}	
	}
	
	public static void sum(int value) 
	{
		
		int sumOfDigits = 0;
		while(true)
		{
			sumOfDigits = sumOfDigits + value%10;
			value = value/10;
			
			if(value<10)
			{
				break;
			}
			
		}
		
		sumOfDigits = sumOfDigits + value;
		System.out.println("SumofDigits is:"+sumOfDigits);
	}
}
