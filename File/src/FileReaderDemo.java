//FileReaderDemo.java
import java.io.*;
class FileReaderDemo { 
	public static void main(String[] args)throws IOException 
		{  
		FileReader fr=new FileReader("cricket.txt");
		int i=fr.read();  //more amount of data  
		while(i!=-1)  
		{   
			System.out.print((char)i); 
			i=fr.read(); 
			}
		} 
		} 