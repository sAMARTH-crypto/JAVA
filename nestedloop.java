/* Nested loop is an important concept and people create a fuss about it in their mind but it's simple and easy.
 Under below example there are two loops working.1st for i and second for j.
 For one iteration of outer loop inner loop will be executed as per the given condition i.e in example it's 
 upto 10.
 EG:
 for i = 1
 j will be 1 to 10 and so forth for i = 2 upto 10.
 That means local variable j will die for every iteration of i. 
 */



public class nestedloop 
{
	
	public static void starpat(int n)
	{
		for (int i = 1 ; i<=10 ; i++ )
		{
			for (int j = 1 ; j<=10 ; j++ )
			{
				System.out.println("i:"+i+" "+"j:"+j);
			}
		}
		
		for (int i = 0 ; i<n ; i++ )
		{
										//outer loop for no. of rows
			{
				System.out.println(" ");
			}	    
				for (int j = 0 ; j<=i ; j++ ) //inner loop for no. of columns
					{
						System.out.print("* ");
					}
				    System.out.println(); //end line after each row
				
				
		
		}
		
		
		 
	}
	public static void main (String[] args)
	{
		int n = 5;
		starpat(n);
	}
	

}
