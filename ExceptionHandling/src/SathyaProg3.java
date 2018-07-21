//SathyaProg3.java
import java.util.Scanner;
import sp1.SathyaDiv1;
class  SathyaProg3
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Value");
		String x1=s.nextLine();
		System.out.println("Enter Second value");
		String x2=s.nextLine();
		SathyaDiv1 sd=new SathyaDiv1();
		try
		{
			sd.division(x1,x2);//Programmer-df common exception method
		}catch(ArithmeticException ae)
		{
			System.out.println(ae);//java.lang.A...dont enter Zero for deno...
		}
		catch(NumberFormatException nfe)
		{
			System.out.println(nfe);
		}
		finally
		{
		System.out.println("Iam from finally block");
	}
}
}