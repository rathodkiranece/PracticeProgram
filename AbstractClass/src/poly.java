abstract class Base {
    public void mymethod() {
        System.out.print("Abstract");
    }
}
class Derived extends Base
{
	public void mymethod(){
		System.out.println("non-abstract");
}
}
class poly {
    public static void main(String a[]) {
        Base m = new Base() {};
        m.mymethod();
    }
}