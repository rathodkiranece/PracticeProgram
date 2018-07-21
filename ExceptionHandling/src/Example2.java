class Example2{
   public static void main(String args[]){
     try{
         int a[]=new int[7];
         //a[4]=30/0;
		 System.out.println(a[8]);
        // System.out.println("First print statement in try block");
		 //throw new NullPointerException(" new NullPointerException");
     }
     catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Warning: ArrayIndexOutOfBoundsException");
	 }
     catch(ArithmeticException e){
        System.out.println("Warning: ArithmeticException");
     
     }
     catch(Exception e){
        System.out.println("Warning: Some Other exception and NullPointerException");
     }
   System.out.println("Out of try-catch block...");
  }
}