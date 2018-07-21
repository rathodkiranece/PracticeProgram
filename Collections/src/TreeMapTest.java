import java.util.TreeMap;
import java.util.Set; 
import java.util.Collection;
import java.util.Map.Entry;
class TreeMapTest  {
	public static void main(String[] args)   
		{
TreeMap<String,String> tmain = new TreeMap<String,String>(); 
tmain.put("ratan","no1");  
tmain.put("anu","no2"); 
 
  TreeMap<String,String> tsub = new TreeMap<String,String>(); 
  tsub.putAll(tmain);  
  tsub.put("x","no3");  
  tsub.put("y","no4");   
  System.out.println(tsub);  
  if (tmain.containsKey("ratan")) 
	  {System.out.println("ratan is great");  
  }   if (tsub.containsValue("no1")) 
	  {System.out.println("no1 ratan only");  
  }   
  //printing all the keys  
  
  Set<String> s = tsub.keySet();   
  for (String ss : s)  
	  { System.out.println(ss);  
  }   //printing all the values  
  Collection<String> s1 = tsub.values(); 
  for (String ss1 : s1)   
	  { System.out.println(ss1);  
  }   
  Set<Entry<String,String>> s2 = tsub.entrySet();  
 
  for (Entry<String,String> ss2 : s2)  
  { System.out.println(ss2);  
  }  
  tsub.clear(); 
  System.out.println(tsub); 
  } } 