class AgeValidator{

   static void validateStudent(int age){
     if(age<5)
      throw new ArithmeticException("age to play more");
     else
      System.out.println("welcome to school");
   }
   
   public static void main(String args[]){
      validateStudent(4);
      System.out.println("rest of the code...");
  }
}