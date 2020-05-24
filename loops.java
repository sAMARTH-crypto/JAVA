
public class loops 
{
	public static void mani(String[] args)
	{ 
		for (int i=1,j=1 ; i<10 || j<10 ; i++,j++)
		{
			System.out.println("i is"+i+"and j is"+j);
		}
		int i = 1;
		int j = 1;
		while(i<10 && j<10)
		{
			i++;
			j++;
			System.out.println("i is"+i+"and j is"+j);
			
		}
		do
		{
			i++;
			j++;
			System.out.println("i is"+i+"and j is"+j);
		}while(i<10 || j<10);
		
	}
