//In Java, we can have an abstract class without any abstract method. 
//This allows us to create classes that cannot be instantiated, 
//but can only be inherited.

// An abstract class without any abstract method
abstract class Base {   
    void fun(){ 
	System.out.println("Base fun() called"); 
	}
}
  
class Derived extends Base{}
  
class Main3 {
    public static void main(String args[]) { 
        Derived d = new Derived();
        d.fun();
    }
}
/*
Output:

Base fun() called
*/
