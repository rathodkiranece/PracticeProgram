interface Printable 
{
	void print();
}
interface Showable{
	void show();
}
class A7 implements Printable,Showable{
	public void print(){
	System.out.println("Printable");
	}
	public void show(){
	System.out.println("Showable");
	}
}
public class TestInterface1
{
	public static void main(String[] args) 
	{
		A7 a=new A7();
				a.print();
				a.show();

	}
}
