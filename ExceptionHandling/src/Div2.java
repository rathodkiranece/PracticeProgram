class Div2 
{
	public static void main(String R[] ) 
	{
	try
	{
		String s1=R[0];
		String s2=R[1];
		int x1=Integer.parseInt(R[0]);
		int x2=Integer.parseInt(R[1]);
		int x3=x1/x2;
		System.out.println("Division of in Div2="+x3);
	}
	catch (ArrayIndexOutOfBoundsException ab)
	{ 
		System.err.println("please enter two value from cmd prompt...");
	}catch(ArithmeticException ae)
		{
	System.err.println("Don't enter zero from Denomenators");
	}catch(NumberFormatException nfe)
		{
		System.err.println("Don't enter ANV/Strig/Specia Symbols");
		}
		finally
		{
			System.out.println("iam from finally block");
		}
	}
}
