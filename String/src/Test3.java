class Test3 
{
	public static void main(String[] args) 
	{
		String s="JAVA";
		System.out.println(s);
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]);
		for(int i=ch.length-1;i>=0;i--)
			System.out.println(ch[i]);
	}
}
/*
JAVA
J
A
V
A
A
V
A
J
*/