//IntfProg5.java
import java.util.Scanner;
interface Figure 
{
	void area();
}//Figure-Functional Interface 

class  IntfProg5
{
	public static void main(String[] args) 
	{
		Scanner s=new scanner(System.in);
		System.out.println("Enter length and breath");
		int l=Integer.pareseInt(s.nextLine());
		int b=Integer.parseInt(s.nextLine());
		int ar=l*b;
		System.out.println("Area of Rect="+ar);
	};
	fo.area();
	System.out.println("w.r.t Figure--Circle impl lambda exp");
	fo=()->{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Radious");
		Float r=Float.parseFloat(s.nextLine());
		float ac=3.1417*r*r;
		System.out.println("Area of Circle="+ac);
	};
	fo.area();
}
}