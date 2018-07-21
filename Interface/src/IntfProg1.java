//IntfProg1 
interface I1
{
	void show();
}
interface I2
{
	void disp();
}
class C1 implements I1,I2
{
	public void show()
	{
		System.out.println("Show()-overriden-C1");
    }
	public void disp()
	{
		System.out.println("disp()-overriden-C1");
	}
	void write()
	{
		System.out.println("write()-special-C1");
	}
}//C1-implements/derrived class I1&I2
class IntfProg1
{
	public static void main(String[] args) 
	{
		System.out.println("w.r.t C1-Doc");
		C1 o1=new C1();
		o1.show();
		o1.disp();
		o1.write();
		System.out.println("w.r.t I1-IN-Doc");
		//I1 io1=new I1(); invalid becoz I1 is abstract
			I1 oi1=new C1();
			oi1.show();
		/*io1.disp(); invalid bcoz disp()&write() doesn't exist in I1
		io1.write();*/
		System.out.println("w.r.t-IN-DOC -DB");
		//I2 io2=new I2(); invalid bcoz I2 is abstract
		I2 io2=new C1();
		 io2.disp();
		 /* io2.show();invalid bcoz show() &write () doesn't exist in I2
		 io2.disp();*/

	}
}
