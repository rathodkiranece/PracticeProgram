// Java code illustrating exit() method 
import java.lang.*;
class SystemDemo
{
    public static void main(String args[]) throws NullPointerException
    {
        System.gc();
        System.out.println("Garbage collector executed ");
         
        System.out.println(System.getProperty("os.name"));
         
        System.exit(1);
         
        // this line will not execute as JVM terminated
        System.out.println("JVM terminated");
    }
}