//Emp.java
package ep;
import java.util.*;
public class Emp 
{
	public LinkedList getEmpDetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Emp Number");
		int eno=Integer.parseInt(s.nextLine());
		System.out.println("Enter emp name");
		String name=s.nextLine();
		System.out.println("Enter emp Designation");
		String dsg=s.nextLine();
		System.out.println("Enter Emp salary");
		Float sal=Float.parseFloat(s.nextLine());
		//create 1DCFW var add emp values and return 1DCFW var
		LinkedList ll=new LinkedList();
		ll.add("Emp Number:"+eno);
		ll.add("emp Name:"+name);
		ll.add("emp Degs:"+dsg);
		ll.add("emp sal:"+sal);
		return ll;
	}
	public void dispEmpData(LinkedList x)
	{
	System.out.println("--------------------");
	System.out.println("Emp Data");	
	System.out.println("--------------------");
	ListIterator litr=x.listIterator();
	while(litr.hasNext())
		{
		Object ev=litr.next();
		System.out.println(ev);
		}//while
		System.out.println("--------------------");
	}
	}