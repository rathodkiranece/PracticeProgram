public class Test { 
  public static void main(String args[]) { 
     int a = 10; 
     int b = 20; 
     int c = 25; 
     int d = 25; 
     System.out.println("a + b = " + (a + b) );//30 
     System.out.println("a - b = " + (a - b) );//-10 
     System.out.println("a * b = " + (a * b) );//200 
     System.out.println("b / a = " + (b / a) ); //2
     System.out.println("b % a = " + (b % a) ); //0
     System.out.println("c % a = " + (c % a) ); //5
     System.out.println("a++   = " +  (a++) ); //10
	 System.out.println("++a	="+	(++a));//
     System.out.println("a--   = " +  (a--) );//11
	 System.out.println("--b   ="	+(--b));//19
    // Check the difference in d++ and ++d 
     System.out.println("d++   = " +  (d++) );//25 
     System.out.println("++d   = " +  (++d) );//27 
  } }  
 /*
a + b = 30
a - b = -10
a * b = 200
b / a = 2
b % a = 0
c % a = 5
a++   = 10
++a     =12
a--   = 12
--b   =19
d++   = 25
++d   = 27
*/