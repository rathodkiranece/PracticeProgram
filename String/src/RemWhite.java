public class RemWhite{ 
public static void main(String args[]){ 
String s1=" world qwer ";
int count=0;
char q[]=new char[9];
char ch[]=s1.toCharArray();
System.out.println(ch); 

    for(int i=0;i<=ch.length-1;i++)
   {
     int j=ch[i];
     if(j==32)
     {
      continue;
     }
   else
      q[count]=ch[i];
      count++;

      } 
   System.out.println(q); 

  }} 