//IntfProg2.java
interface I1
{
	void f1();//public abstract void f1()
}//I1
interface I2
{
	void f2();//public abstract void f2()
}
class C1 implements I1,I2
{
	public void f1()
	{
		System.out.println("f1()---overriden--c1");
	}
	public void f2()
	{
		System.out.println("f2()--overriden--c2");
	}
	void f3()
	{
		System.out.println("f3()--Special--C1");
	}
}//c1explicit imp class of I1,I2 

class IntfProg2
{
	public static void main(String[] args) 
	{
		System.out.println("w.r.t C1--DOC");
	C1 o1=new C1();
	o1.f1();
	o1.f2();
	o1.f3();
	System.out.println("w.r.t I1-IN-DOC-C1");
	//I1 io1=new I1();invalid becoz I1 is abstract 
	I1 io1=new C1();
	io1.f1();
	/* io1.f2(); invalid becoz f2() and f3() does not exist in I1
	io1.f3();*/
	System.out.println("I2-IN-DOC-C1");
	//I2 io2=new I2();invalid becoz I2 is abstract
	I2 io2=new C1();
	io2.f2();
	/*io2.f1();invalid bcoz f1()and f3() does not exist in I2 
	io2.f3();*/

	}
}
