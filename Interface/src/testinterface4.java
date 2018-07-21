interface Printable 
{
	void print();
}
interface Showable
{
	void print();
}
class TestInterface3 implements Printable,Showable
{
	public void print(){
		System.out.println("Printable");
	}
}
class testinterface4
{
	public static void main(String[] args) 
	{
		TestInterface3 t=new TestInterface3();
					t.print();
	}
}
