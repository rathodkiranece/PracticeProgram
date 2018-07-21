//Example of retainAll() method
	import java.util.*;  
	class TestCollection1{  
	 public static void main(String args[]){  
	  ArrayList<String> al=new ArrayList<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ajay");  
	  ArrayList<String> al2=new ArrayList<String>();  
	  al2.add("Ravi"); //is used to delete all the elements of invoking collection except the specified collection. 
	  al2.add("Hanumat");  
	  al.retainAll(al2);  
	  al.clone();
	  System.out.println("iterating the elements after retaining the elements of al2...");  
	  Iterator itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	}  
