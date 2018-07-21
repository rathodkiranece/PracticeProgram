//SathyaProg1.java
import java.util.Scanner;
class  SathyaProg1
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your marks");
		String marks=s.nextLine();
		try
		{
			int im=Integer.parseInt(marks);
			System.out.println("marks="+im);
		}catch(NumberFormatException nfe)
		{
			System.out.println("dont enter alphanumerical for marks");
		}
		finally
		{

		System.out.println("Iam from finally block");
		}	
	}
}
