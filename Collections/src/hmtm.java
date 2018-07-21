//hmtm.java
import java.util.*;
class  hmtm
{
	public static void main(String[] args) 
	{
		//HashMap<Integer,Float> hm=new HashMap<>();
		TreeMap<Integer,Float> hm=new TreeMap<>();
		System.out.println("Content of hm" +hm);//{}
		System.out.println("Size of hm="+hm.size());//0
		//add the data to hm
		hm.put(100,1.5f);
		hm.put(10,2.5f);
		hm.put(1,5.5f);
		hm.put(90,1.5f);
		hm.put(90,3.5f);//executed and consider as modifier entry
		System.out.println("Cntent of hm="+hm);//{}
		System.out.println("Size of hm="+hm.size());//4
		//Extrect data from hm
		System.out.println("Extract data from entrySet()");
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		System.out.println("---------------------------------");
		while(itr.hasNext())
		{
			Object mobj=itr.next();
			Map.Entry me=(Map.Entry)mobj;
			Object kobj=me.getKey();
			Object vobj=me.getValue();
			Integer io=(Integer)kobj;
			Float fo=(Float)vobj;
			int acno=io.intValue();
			float bal=fo.floatValue();
			System.out.println(bal+"is the bal of"+acno);
		}//while
		System.out.println("--------------------------------");
		System.out.println("Extract the data from hm.keySet()");
		System.out.println("-----------------------------------");
		Set s1=hm.keySet();
		Iterator itr1=s1.iterator();
		while(itr1.hasNext())
		{
			Object kobj=itr1.next();
			Object vobj=hm.get(kobj);
			Integer io=(Integer)kobj;
			Float fo=(Float)vobj;
			int acno=io.intValue();
			float bal=fo.floatValue();
			System.out.println(bal+"----"+acno);
		}
		System.out.println("----------------------------------");
	}//main
}//hmtm-ELC

		