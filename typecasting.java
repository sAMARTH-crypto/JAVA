/*
#Implicit Typecasting is done as widening effect.

		byte(8-bit)->short(16-bit)->int(32-bit)->long(64-bit)->float(32-bit)->double(64-bit) 
 			that means smaller value can be stored in a large container but vice-versa is not possible.
 
#Explicit typecasting
			
				manually(code).
*/




public class typecast 
{
	public static void main(String[] args)
	{
		//IMPLICIT(automatically typecasted short to int)
		
		short a = 10;
		int b = a;
		System.out.println(b);
		
		//EXPLICIT (integer value is typecasted to short manually)
		
		int y = 10;
		short z = (short)y;
		System.out.println(z);
    
    //for decimal values
		
		//IMPLICIT
		float var0 = 10.0f;
		double var1 = var0;
		System.out.println(var1);
		
		//EXPLICIT
		/*Main drawback of explicit typecasting OF deciamals values is loss of precision that is 
     some decimal value will automatically be truncated by the compiler
    */
    
		double var2 = 20.0123456d;
		float var3 = (float)var2;
		System.out.println(var3);
	}

}
