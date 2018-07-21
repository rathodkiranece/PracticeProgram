//SyncAppl1.java
class  MathFaculty
{
	synchronized void table(int n)
	{
		System.out.println("-------------------------------------------");
		System.out.println("Mul tabl for :"+n);
		System.out.println("--------------------------------------------");
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
			System.out.println("-----------------------------------------");

	}///table()
}//MathFaculty-----BLC
 class Student1 extends Thread
 {
	MathFaculty mf;
	Student1(MathFaculty mf)
	 {
		this.mf=mf;
 }
public void run()
	 {
	mf.table(8);
	 }
 }//Student------BLC
 class Student2 extends Thread
 {
	MathFaculty mf;
	Student2(MathFaculty mf)
	 {
		this.mf=mf;
 }
public void run()
	 {
	mf.table(19);	
	 }
 }//Student------BLC
 class Student3 extends Thread
 {
	MathFaculty mf;
	Student3(MathFaculty mf)
	 {
		this.mf=mf;
 }
public void run()
	 {
	mf.table(18);
	 }
 }//Student------BLC
class SyncAppl1
	{
	
	public static void main(String[] args) 
	{
		MathFaculty mf=new MathFaculty();
		Student1 s1=new Student1(mf);
		Student2 s2=new Student2(mf);
		Student3 s3=new Student3(mf);
			s1.start();
			s2.start();
			s3.start();

	}
}
