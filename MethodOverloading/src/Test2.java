class Test2 { 
  public void methodOne() { 
	    System.out.println("no-arg method");
 }
 public void methodOne(int i) { 
 System.out.println("int-arg method"); //overloaded methods 
  }
  public void methodOne(double d) { 
	  System.out.println("double-arg method"); 
 } 
   public static void main(String[] args)  {
  Test2 t=new Test2(); 
   t.methodOne();//no-arg method 
   t.methodOne(10);//int-arg method 
   t.methodOne(10.5);//double-arg method 
  } 
  } 