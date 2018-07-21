class CompateToExample 
{
	public static void main(String[] args) 
	{
		String s="hello";
		String s1="hello";
		String s2="kai";
		String s3="bello";
		System.out.println(s.compareTo(s1));//0
		System.out.println(s1.compareTo(s2));//-3
		System.out.println(s3.compareTo(s1));//-6
	}
}
