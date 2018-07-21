import java.util.TreeMap; 
 
class TreeMapTest2  {
public static void main(String[] args)   
	{ 
	TreeMap<String,String> tmain = new TreeMap<String,String>(); 
	tmain.put("ratan","no1"); 
	tmain.put("anu","no2"); 
	tmain.put("aarav","no2");
	//tmain.put("anu","no3");//override previous data
	//tmain.put(null,"no4");//Exception in thread "main" java.lang.NullPointerException  null can't be key
	//tmain(null,null);//error
	System.out.println(tmain);
  /*TreeMap<String,String> tsub = new TreeMap<String,String>();  
  tsub.putAll(tmain);   tsub.put("x","no3");  
  tsub.put("4","no4"); 
  System.out.println(tsub); */ 
  }
  } 