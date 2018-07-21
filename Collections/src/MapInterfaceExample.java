	import java.util.*;  
	class MapInterfaceExample{  
	 public static void main(String args[]){  
	  Map<Integer,String> map=new HashMap<Integer,String>();  
	  map.put(100,"Amit");  
	  map.put(101,"Vijay");  
	  map.put(102,"Rahul");  
	  for(Map.Entry m:map.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  } 
	  //we can retrive data like this also 
	  // (or)
	  Set s=map.keySet();
	  Iterator itr=s.iterator();
	  for( ;itr.hasNext();)
		 {
		  Object kobj=itr.next();
		  Object vobj=map.get(kobj);
		  System.out.println(vobj+" "+kobj);
		 }

	 }  
}  
