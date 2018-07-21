//String to char Array Using Java Built-in Function
public class StringtoChar{
  public static void main(String[] args)
  {
     String str = "KiranRathod";
     char[] chArray = str.toCharArray();
     for(char ch : chArray)
     {
         System.out.print(ch);
     }
  }
}
