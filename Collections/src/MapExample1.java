	//Non-generic  
	import java.util.*;  
	public class MapExample1 {  
	public static void main(String[] args) {  
	    Map<Integer,String> map=new HashMap<>();  
	    //Adding elements to map  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");  
	    //Traversing Map  
	    Set set=map.entrySet();//Converting to Set so that we can traverse  
	    Iterator itr=set.iterator(); 
		while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Object obj=itr.next();
			Map.Entry entry=(Map.Entry)obj;  
			Object kobj=entry.getKey();
			Object vobj=entry.getValue();
	        System.out.println(kobj+" "+vobj); 
			}  
	}  
	} 
