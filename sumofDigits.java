public class sumOfDigits 
{
	public static void main(String[] args)
	{
		int value = 1234;                          // this the number to be summed up.
		int sumOfDigits = 0;                       // var to store the sum
		
		while(true)
		{
			sumOfDigits = sumOfDigits + value%10;              // value % 10 is giving us the remainder i.e 4 and storing it in sumOfDigits var
			value = value/10;                                  // value/10 is removing 4 from the value.
			
			if(value<10)                                       // this if loop is helping to traverse through the number i.e value until we hit the last digit.
			{
				break;
			}
			
		}
		
		sumOfDigits = sumOfDigits + value;                 // final sum 
		System.out.println("SumofDigits is:"+sumOfDigits);
		
	}
	

}

Output:

SumofDigits is: 10
