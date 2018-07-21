public class Testtrycatch2{  
  public static void main(String args[]){  
   try{  
      int data=50/0;  
   }catch(ArithmeticException e)
	 {
	   System.err.println("Don't enter zero from Denomenators");
	   System.out.println(e);
	   }  
   System.out.println("rest of the code...");  
}  
}  