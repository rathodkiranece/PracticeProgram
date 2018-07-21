//HashMapExample.java
import java.util.*;
class HashMapExample 
{
	public static void main(String[] args) 
	{
		//creating an object HashMap
		HashMap<Integer,String> hm=new HashMap<>();
			hm.put(10,"kiran");//adding object on HashMap
			hm.put(11,"rathod");
			hm.put(12,"raj");
			hm.put(13,"kiran");
			//retriving data through foreach loop(enhanched loop)
	/*for(Map.Entry m:hm.entrySet())
		{
		System.out.println(m.getKey()+" "+m.getValue());
		}*/
		//Directly data retriving 
		//System.out.println(hm);
		//retriving data through Iterator
		Set entry=hm.entrySet();

		Iterator itr=entry.iterator();
		while(itr.hasNext())
		{
			Object mobj=itr.next();
			Map.Entry me=(Map.Entry)mobj;
			Object kobj=me.getKey();
			Object vobj=me.getValue();
			System.out.println(kobj+"  "+vobj);

		}

	}
}
