class nullCheck 
{
	public static void main(String[] args) 
	{
		String s1=null;
		String s2=null;
		//System.out.println(s1.equals(s2));//Exception in thread "main" java.lang.NullPointerException
        //at nullCheck.main(nullCheck.java:7)
		System.out.println(s1==s2);
	}
}
