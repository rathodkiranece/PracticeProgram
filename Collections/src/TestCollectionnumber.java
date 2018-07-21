import java.util.*;  
	class TestCollectionnumber{  
	 public static void main(String args[]){  
	  //Creating and adding elements  
	  TreeSet<Integer> al=new TreeSet<>();  
	  al.add(4);  
	  al.add(3);  
	  al.add(1);  
	  al.add(2);  
	  //Traversing elements  
	  Iterator<Integer> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	}  
