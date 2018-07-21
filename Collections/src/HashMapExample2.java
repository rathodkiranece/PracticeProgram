import java.util.*;
public class HashMapExample2  
	{

		public static void main(String[] args) 
		{
		
		HashMap<Integer,String> hm=new HashMap<>();
				hm.put(12,"kiran");
				hm.put(13,"rathod");
				hm.put(12,"abhi");//when insert dublicate key override the previos key and value
				//override both value 
				hm.put(null,"aarav");//only one null key can be insert in hashmap
				hm.put(null,"aaran");//here null also override the previous value
				hm.put(null,null);
				hm.put("14",12);
				Set s=hm.entrySet();
				Iterator itr=s.iterator();
				while(itr.hasNext())
				{
				Map.Entry me=(Map.Entry)itr.next();
				System.out.println(me.getKey()+"..."+me.getValue());
									}
									
		}
	}
