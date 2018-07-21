//IntfProg4.java
import java.util.Scanner;
interface Figure
{
	 Scanner s=new Scanner(System.in);	
		 void area();//public abstract void area()
}
class  IntfProg4
{
	public static void main(String[] args) 
	{
		System.out.println("w.r.t FIgure-Rect-Impl-AINC");
		Figure fo=new Figure()//
		{
			public void area()
			{
				System.out.println("Enter length and breath ");
				int l=Integer.parseInt(s.nextLine());
				int b=Integer.parseInt(s.nextLine());
				int ar=l*b;
				System.out.println("Area of Rect="+ar);
			}
		};//semicolan mandiatory area()
		fo.area();	
			System.out.println("w.r.t Figure Square-impl-AINC");
		fo=new Figure()//infprog$2
		{
			public void area()
			{
				System.out.println("Enter Side");
				int s1=Integer.parseInt(s.nextLine());
				int as=s1*s1;
				System.out.println("Area of squre="+as);
			}
		};//semicolan madotory area()
		fo.area();
	}

	}
