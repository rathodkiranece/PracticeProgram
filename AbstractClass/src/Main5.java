class A
{
	 void base(int i){
		System.out.println("A class");
	}
}
class B extends A
{
     public static void bases(int i){
		System.out.println("B Class");
}
}
class C extends B
{
	void base(int i)
	{
		System.out.println("C class");
	}
}
public class Main5
{	
	public static void main(String[] args) 
	{
		//A a=new A();
		//A a=new B();
		
		B b=new B();
		b.base(5);
		//B b=new A();
		//C c=new C();
		  //a=(A)new B();
		 // b=(B)new A();
		 //b.base(5);
		//C c=new B();
		//c.base(5);

	}
}
