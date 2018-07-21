	import java.util.*;  
	class TestCollection4{  
	 public static void main(String args[]){  
	  ArrayList<String> al=new ArrayList<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ajay");  
	  ArrayList<String> al2=new ArrayList<String>();  
	  al2.add("Sonoo");  
	  al2.add("Hanumat");  
	  al.addAll(al2);//adding second list in first list
	  ArrayList<String> al3=new ArrayList<>();
	  al3.add("kiran");
	  al3.add("rathod");
	  al3.add("ram");
	  al.addAll(al3);//adding third list in first List 
	  Iterator itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
		}  
	 }  
	}  
