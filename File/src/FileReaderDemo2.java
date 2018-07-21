import java.io.*;
class FileReaderDemo2 
	{ 
public static void main(String[] args)throws IOException 
	{  
	File f=new File("cricket.txt");  
	FileReader fr=new FileReader(f);  
	char[] ch=new char[(int)f.length()];//small amount of data   
	fr.read(ch);  
	for(char ch1:ch)  
	{    
	System.out.print(ch1);
	} 
	}
	}