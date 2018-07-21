//FileDemo4.java
import java.io.*;
class  FileDemo4
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("E:\\corejava/File","demo.txt");
		f.createNewFile();
		System.out.println(f.exists());//true
	}
}
