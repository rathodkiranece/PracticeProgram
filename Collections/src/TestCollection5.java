	import java.util.*;  
	class TestCollection5{  
	 public static void main(String args[]){  
	  ArrayList<String> al=new ArrayList<String>();  
	  al.add("Ravi"); //it also be remove 
	  al.add("Vijay");  
	  al.add("Ajay");  
	  ArrayList<String> al2=new ArrayList<String>();  
	 al2.add("Ravi");//it can be remove  
	  al2.add("Hanumat"); 
	  //al.addAll(al2);
	  al.removeAll(al2);  
	  System.out.println("iterating the elements after removing the elements of al2...");  
	  Iterator itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	  
	  }  
	}  
