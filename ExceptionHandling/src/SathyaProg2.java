//SathyaProg2.java
import java.util.Scanner;
import sp.SathyaDiv;
class  SathyaProg2
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First value");
		String x1=s.nextLine();
		System.out.println("Enter Second Value");
		String x2=s.nextLine();
		SathyaDiv sd=new SathyaDiv();
		try
		{
			sd.division(x1,x2);//Progmmer-def common exception method
		}catch(ArithmeticException ae)
		{
			System.out.println("dont enter zero for den..");
		}catch (NumberFormatException nfe)
		{
			System.out.println("dont enter Alphanumeric value");
		}
		finally
		{

		System.out.println("iam from finally block");
	}
}
}
