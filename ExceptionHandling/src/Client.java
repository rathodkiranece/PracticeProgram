package java4s;
 
public class Client {
public static void main(String[] args)throws Exception
{
   int price = -120;
 
   if(price < 0)
      throw new MyOwnExceptionClass(price);
   else
      System.out.println("Your age is :"+price);
   }
}