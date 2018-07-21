//1.Write a programm to print reverse of String without using String library methods?
public class StringReverseExp { 

public static void main(String[] args) { 
// TODO Auto-generated method stub 

String name="JAVA"; 
char value[]=name.toCharArray(); 
for(int i=value.length-1;i>=0;i--) 
{ 
System.out.print(value[i]); 
} 


} 

}
//out put:AVAJ
