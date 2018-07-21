public class MoneyCalc1 {

   public void method(StringBuffer sb) {
      System.out.println("StringBuffer Verion");
   }

   public void method(String s) {
      System.out.println("String Version");
   }

   public static void main(String args[]) {
      MoneyCalc1 question = new MoneyCalc1();
      question.method(null);
   }
}