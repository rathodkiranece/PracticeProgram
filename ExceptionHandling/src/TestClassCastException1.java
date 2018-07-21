class TestClassCastException1 
{
	public static void main(String[] args) 
	{
		Object obj=new Object();
		String str=(String)obj;
		System.out.println(str);
	}
}
/*
Exception in thread "main" java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
        at TestClassCastException1.main(TestClassCastException1.java:6)
		*/