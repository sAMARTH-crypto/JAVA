
public class ternaryop 
{
	public static void main (String[] args)
	{
		boolean a = !true;      //not operator is performing the inversion of true i.e false(uniary operator)
		
		System.out.println(a); 
    
		
		/*
    
		Now comes the ternary operator,there is only one in java(?)
    
		Syntax: (operation) ? (o/p) : (o/p) ;
    
    based on the operation o/p will be assigned to the given var
		before question mark there will be a operation and based on that operation
		colon part will be executed and the values in colon part will be assigned to the variable
    
		*/
    
    
		boolean y;
		
		y = (4<5) ? true : false ;
		System.out.println(y);
		
		int x;
		
		x = (10 == 9) ? 1 : 0 ; //true(1) or false(0)
		
		System.out.println(x);
		
		
	}

}
