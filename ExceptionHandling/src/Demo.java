public class Demo
{
  public static void main(String args[])
  {
    int b =0, x[] = { 10, 20, 30 };
    try
    {
      int c = x[3]/b;
    }  
    catch(ArithmeticException e)
    {
      System.out.println(e);    
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println(e);    
    }
  }
}