//SathyaDiv1.java
package sp1;
public class SathyaDiv1
{
	public void division(String s1,String s2)throws ArithmeticException,NumberFormatException
	{
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		if(b==0)
		{
			ArithmeticException ae=new ArithmeticException("Don't Enter Zero for Den...");
			throw ae;
		}
		else
		{
			int c=a/b;
			System.out.println("div in SathyaDiv="+c);
		}//else
	}//divisioon
}//	
