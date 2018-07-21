//VectorDemo.java
import java.util.*;
class  VectorDemo
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		System.out.println("content of v="+v);//[]
		System.out.println("sixe of v="+v.size());//0
		System.out.println("capacity v="+v.capacity());//10
		//add the data of v
		v.addElement(10);
		v.addElement(10.5);
		v.addElement("Sathya");
		v.addEelement(10);
		v.addElement('A');
		v.addElement(10);
		v.addElement(true);
		System.out.println("Content of v="+v);//[10,10.5,Sathya,A,true]
		System.out.println("size of v="+v.size());//5
		System.out.println("capacity of v="+v.capacity());//10
		//extract the data from v
		System.out.println("element of v");
		System.out.println("---------------------------------");
		Enumeration en=v.elements();
		while(en.hashMoreElement())
		{
			Object obj=en.nexElement();
		System.out.println(obj);
		}
	}
}