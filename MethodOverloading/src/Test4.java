class Test4 { 
public void methodOne(String s)  { 
System.out.println("String version"); 
} 
public void methodOne(Object o)   
//Both methods are said to               
//be overloaded methods. 
{
	System.out.println("Object version"); 
	}  
	public String methodOne(Object o){
		System.out.println("String retrun type");
	}
	public static void main(String[] args)  { 
	Test4 t=new Test4();  
	t.methodOne("arun");//String version 
	t.methodOne(new Object());//Object version 
	t.methodOne(null);//String version
	} 
	} 