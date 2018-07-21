class TestClassCastException 
{
	public static void main(String[] args) 
	{
		String s=new String("kiran");
		Object obj=(Object)s;
		System.out.println(obj);
	}
}
/*
out:
kiran
*/