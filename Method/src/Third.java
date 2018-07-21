//Thrid.java
class  Third
{
	void show()
	{
		write();//Rule-2
		System.out.println("show-instance");
	}
	static void disp()
	{
		System.out.println("disp-static");
	}
	void write()
	{
		Third.disp();//Rule-4
		System.out.println("write instance");
	}
	public static void main(String[] args) 
	{
		System.out.println("iam from main()-begging");
		Third t1=new Third();
		t1.show();//Rule-3
		disp();//Rule-1 or Third.disp();
		//t1.write();
		System.out.println("I am from main()-end");
	}
}
