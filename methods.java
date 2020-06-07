/*
methods are always created out side the scope of main class
methods are called in main
*/


public class methods 
{
		public static void main (String[] args)
		{
			loop(1,10);					// we can call in methods as many time we want to
			
			System.out.println("____________________________");
			
			loop(20,30);
			
		}
		
		public static void loop(int step , int finalValue)      //method 
		{
			
			while (step<=finalValue)
			{
				System.out.println(step);
				step++;
			}
		}
		
		}


}
