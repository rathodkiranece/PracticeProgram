import java.io.*;
class  FileDemo5 
	{  public static void main(String[] args)throws IOException
	{ 
		int count=0;  
		File f=new File("E:\\corejava/File");
		String[] s=f.list();  
		for(String s1=s)
			{ 
			count++;  
			System.out.println(s1); 
			}  
			System.out.println("total number : "+count); 
 
 } 
 } 
 