interface Drawable 
{
	 void draw();
}
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("rectangle");
	}
}
class Circle implements Drawable
{
	public void draw(){
		System.out.println("Circle");
	}
}
public class TestInterface
{

	public static void main(String[] args) 
	{
	Drawable d=new Rectangle();
	   d.draw();
	        d=new Circle();
			d.draw();

	}
}
