// BIG DECIMAL CLASS IS VERY USE FULL FOR CALCULATING ULTRA PRECISSION VALUES
// Problem may increase further but to get exact or expected value we can pass no. as strings
// use add() function to add bigdecimal
import java.math.BigDecimal;
public class bigdecimal 
{
	public static void main(String[] args)
	{
		double x = 1.05;
		double y = 2.55;
		BigDecimal d1 = new BigDecimal("1.05");
		BigDecimal d2 = new BigDecimal("2.55");
		System.out.println(d1.add(d2));
	}

}
