class Sttingpool   
{
	public static void main(String[] args) 
	{

		String s1="a";
		String s2="a";
		String s3=new String("a");
		       s3=s3.intern();
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
	}
}
