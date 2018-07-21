 class SuperClass {

  public void method1(){
	  System.out.println("SuperClas method1");

  }
}
class SubClass extends SuperClass {
  public void method2()
  {
System.out.println("SubClass method2");
  }
}
public class ClassTest{
	public static void main(String[] args){

SubClass sub = new SubClass();
sub.method1();  //Valid through inheritance from SuperClass
sub.method2();  // Valid

SuperClass superClass = new SubClass();
superClass.method1();
superClass.method2(); // Compilation Error since Reference is of SuperClass so only SuperClass methods are accessible.
	}
}