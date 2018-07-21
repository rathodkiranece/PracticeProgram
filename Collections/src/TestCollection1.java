import java.util.*;  
class TestCollection1{  
	 public static void main(String args[]){  
	  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	  list.add("Ravi");//Adding object in arraylist  
	  list.add("Vijay");  
	  list.add("Ravi");  
	  list.add("Ajay");  
//Traversing list through Iterator  
	  Iterator itr=list.iterator();  
	  while(itr.hasNext()){  
	System.out.println(itr.next());
	//Directly retriving with object referance
	//System.out.println(list);
	while(itr.hasNext())
		  {
		Object obj=itr.next();
		String s=(String)obj;
		System.out.println(s);
		  }

  }  
 }  
	}  
