//TestCollection3.java
import java.util.*;
class Student
{
	int sid;
	String sname;
	int age;
	public Student(int sid,String sname,int age)
	{
		this.sid=sid;
		this.sname=sname;
		this.age=age;
	}
}
class  TestCollection3
{
	public static void main(String[] args) 
	{
		//createing userdefind object
		Student s1=new Student(10,"kiran",24);
		Student s2=new Student(11,"ram",25);
		Student s3=new Student(12,"rathod",24);
		//createing ArrayList
		ArrayList<Student> std=new ArrayList<Student>();
		std.add(s1);
		std.add(s2);
		std.add(s3);
		//getting Iterator
		Iterator itr=std.iterator();
		//retriving element of ArrayList
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
		System.out.println(st.sid+" "+st.sname+" "+st.age);
		}
	}
}
