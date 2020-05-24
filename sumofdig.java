/*
 Yet another example that is thought to be confusing.
 We are supposed to add the digits.
 Modulo and Division is used.
 
 Modulo -> it returns remainder.
 Division -> it returns quo.
 
 So,here logic is used like this that
 Modulo is used to store individual digits.
 Division is used to reste the value.
 
 */
 
public class sumofdigit 
{
	public static void main(String[]  args)
	{
		int value = 1234;
		int sum = 0;
		
		while(true)
			
		{
			sum += value%10;  
			value = value/10;
			
			if (value<10)
			{
				break;
			}
	
		}
		System.out.println("Sum of Digits is:"+sum);
	}

}
