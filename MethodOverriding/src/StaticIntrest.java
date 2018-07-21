//StaticIntrest.java
class Bank 
{
	static int getRateOfIntrest(){return 0;}
}
class SBI extends Bank
{
	static int getRateOfIntrest(){return 8;}
}
class AXIS extends Bank{
	static int getRateOfIntrest(){return 9;}
}
class ICIC extends Bank
{
	static int getRateOfIntrest(){return 7;}
}
class Intrest
{
	public static void main(String[] args) 
	{
		Bank b=new Bank();	
			System.out.println(Bank.getRateOfIntrest());
		 SBI s=new SBI();
		 System.out.println("SBI Rate Of Intrest="+s.getRateOfIntrest());
		 AXIS a=new AXIS();
		 System.out.println("AXIC Rate Of Intrest="+a.getRateOfIntrest());
		 ICIC i=new ICIC();
		 System.out.println("ICIC Rate Of Intrest="+i.getRateOfIntrest());
	}
}
