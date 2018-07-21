//Requirement: Write code to create a directory named with SaiCharan123 in
//current working directory and create a file named with abc.txt in that directory.  Program:
import java.io.*;
class  FileDemo3 
{  
public static void main(String[] args)throws IOException  
{  
File f1=new File("SaiCharan123");  
f1.mkdir(); 
File f2=new File("SaiCharan123","abc.txt"); 
f2.createNewFile();
System.out.println(f2.exists());//true
}
} 