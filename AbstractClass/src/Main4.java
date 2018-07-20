//Abstract classes can also have final methods (methods that cannot be overridden). 
//For example, the following program compiles and runs fine.

// An abstract class with a final method
abstract class Base {
    final void fun(){
		System.out.println("Derived fun() called"); 
		}
} 
class Derived extends Base{
//void fun() { 
//System.out.println("Derived fun() called"); 
}
//final method cant over ride here
}
class Main4 {
    public static void main(String args[]) { 
       Base b = new Derived();
       b.fun();
    }
} 

/*Run on IDE
Output:

Derived fun() called
*/