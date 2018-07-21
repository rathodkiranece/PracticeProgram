import java.util.*;
class Student 
{
	int sid;
	String sname;
	int marks;
	public Student(int sid,String sname,int marks)
	{
	this.sid=sid;
	this.sname=sname;
	this.marks=marks;
}
}
public class ListItertorExample2
{
	public static void main(String[] args) 
	{
		Student s1=new Student(10,"kiran",80);
		Student s2=new Student(11,"mahesh",90);
		Student s3=new Student(12,"rakesh",70);
		List<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		List<Student> al2=new ArrayList<Student>();
		Student s4=new Student(13,"ram",77);
		Student s5=new Student(14,"ravi",40);
		al2.add(s4);
		al2.add(s5);
		al.addAll(3,al2);
		for(Student s:al)
		{
		System.out.println(s.sid+" "+s.sname+" "+s.marks);
		}
		ListIterator ltr=al.listIterator(1);
		while(ltr.hasNext())
		{
			Object obj=ltr.next();
			Student ss=(Student)obj;
			System.out.println(ss.sid+" "+ss.sname+" "+ss.marks);
			
		}
	}
}
