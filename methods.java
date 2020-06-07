/*
methods are always created out side the scope of main class
methods are called in main
*/


public class methods 
{
		public static void main (String[] args)
		{
			loop1();
			
			System.out.println("____________________________");
			
			loop2();
			
		}
		
		public static void loop1()      //method one
		{
			int i = 1 ;
			while (i<=10)
			{
				System.out.println(i);
				i++;
			}
		}
		
		public static void loop2()    //method two
		{
			int j = 20 ;
			while (j<=30)
			{
				System.out.println(j);
				j++;
			}
		}


}
