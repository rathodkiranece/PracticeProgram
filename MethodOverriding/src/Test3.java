class Parent { 
public Object methodOne(int a int b)  { 
 return a+b; 
   } 
  }
class Child extends Parent { 
public String methodOne(int i) { 
		   return null; 
} 
}
class Test3
{
	public static void main(String[] args){
		Parent p=new Parent();
		     p.methodOne(5);
		Child c=new Child();
				//c.methodOne();
			Parent p1=new Child();
			   //p1.methodOne();

}
}