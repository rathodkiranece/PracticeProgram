class EqualsExample 
{
	public static void main(String[] args) 
	{
		String s1="javatpoint";
		String s2="javatpoint";
		String s3="JAVATPOINT";
		String s4="python";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1==s2);
		System.out.println(s2==s3);
	}
}
/*
true
false
false
true
false
*/