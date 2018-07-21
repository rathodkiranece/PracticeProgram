  public class OverloadingTest {

       public static void test(Object obj){
           System.out.println("Object called");
       }

       public static void test(String obj){
           System.out.println("String called");
       }

       public static void main(String[] args){
           test(null);
           System.out.println("10%2==0 is "+(10%2==0));
           //test((10%2==0)?null:new Object());
		    if(10%2==0){
        test(null);
    }
    else
    {
        test(new Object());
    }
           test((10%2==0)?null:null);
	   }
	   }