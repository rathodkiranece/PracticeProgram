import java.util.ArrayList;
import java.util.Collections;
class SortArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("b");
		al.add("c");
		al.add("f");
		al.add("z");
		al.add("m");
		Collections.sort(al);
		for(String value:al)
		{
			System.out.println(value);
		}
	}
}
