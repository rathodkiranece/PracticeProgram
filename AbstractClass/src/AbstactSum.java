abstract class  Operations
{
	abstract void sum();
};
class Isum extends Operations
{
	void sum()
	{
	int a,b,c;
	a=10;
	b=20;
	c=a+b;
	System.out.println("Isum int value :"+c);
	}
};
class Fsum extends Operations
{
	void sum()
	{
	float x,y,z;
	x=30.01f;
	y=20.10f;
	z=x+y;
	System.out.println("Fsum float value :"+z);
	}
};
class AbstactSum
{
	public static void main(String[] args) 
	{
	//Operations op=new Operations();//invalid
		Operations opop=new Isum();
				op.sum();
	    Operations op1=new Fsum();
				op1.sum();
	}
}
