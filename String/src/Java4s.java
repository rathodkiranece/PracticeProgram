public class Java4s
{
  public static void main(String[] args)
  {
    //String s = "(123)-456-7891";
	String s=new String("(123)-456-7891");
    s = s.replaceAll("[^a-zA-Z0-9]", "");
    System.out.println(s);
  }
 
}
/*
1234567891
*/