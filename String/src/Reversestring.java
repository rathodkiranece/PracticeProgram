//2. Write a programm to print reverse of String without using String library methods?
class Reversestring  
{
	public static void main(String[] args) 
	{
		String str="JAVA";
		for (int i=str.length()-1;i>=0;i-- )
		{
		System.out.print(str.charAt(i));
	}
}
}
/*output:AVAJ