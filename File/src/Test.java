import java.io.*;
class Test
{
public static void main(String[] args)
{
try{
String str;
//opening file in read mode using BufferedReader stream
BufferedReader br=new BufferedReader(new FileReader("E:\\corejava/File/cricket.txt"));   
while((str=br.readLine())!=null)
 {
System.out.println(str);
 }      
br.close();	//closing BufferedReader stream
}catch(IOException ie)
{  System.out.println("exception");  }
 }
}
