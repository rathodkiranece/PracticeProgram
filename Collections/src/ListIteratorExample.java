import java.util.*;
class ListIteratorExample 
{
	public static void main(String[] args) 
	{
		List<String> al=new ArrayList<String>();
			al.add("kiran");
			al.add("mahesh");
			al.add("ram");
			al.add("reddy");
			al.add(1,"rathd kiran");
			System.out.println(al);
			System.out.println("get 2nd position:"+al.get(2));
			System.out.println("remove 3rd position:"+al.remove(3));
			ListIterator<String> ltr=al.listIterator();
			while(ltr.hasNext())
		{
				System.out.println(ltr.next());
		}
		//retriving data in backword direction
		while(ltr.hasPrevious())
		{
			Object obj=ltr.previous();
			String s=(String)obj;

			System.out.println(s);
		}
		for(String s:al)
		{
			System.out.println(s);
		}
	}
}
