//A java File object can represent a directory also.  Example: 
import java.io.*;
class  FileDemo2
	{ 
	public static void main(String[] args)throws IOException 
		{ 
		File f=new File("cricket123");   
		System.out.println(f.exists());//false
		//f.createNewFile();
		f.mkdir();   
		System.out.println(f.exists());//true
		}
		}