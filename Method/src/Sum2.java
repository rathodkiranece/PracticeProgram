class Sum
{
	int a,b,c;
	 void sum( )
	{
		  a=10;
		  b=20;
	}
	void add()
	{
	 c=a+b;
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
}
}

	class Sum2
	{
	public static void main(String[] args) 
	{
		Sum s=new Sum();
		s.sum();
		s.add();
		s.disp();
	
			
	}
}
	