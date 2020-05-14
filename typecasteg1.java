public class exercise 
{
	public static void main(String[] args)
	{	//(a+b)^2 = a^2 + 2ab + b^2 
		//given a is integer and b is a float
		
		int a = 20;   //int typecasted to float for obtaining accurate result
		float f = a;
		float b = 10.5f;
		double ans;
		
		ans = f*f + 2f*b + b*b ;
		
		
		System.out.println("(a+b)^2 : "+ans);
		
	}

}
