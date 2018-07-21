class ConcatExample 
{
	public static void main(String[] args) 
	{
		String s="Kiran Rathod";
		 s.concat("is immutable");
		 System.out.println(s);
		 s=s.concat("is immutable so assign it explicitly");
		System.out.println(s);
	}
}
/*
true
true
true
false
*/