import java.util.*;
class ListExample 
{
	public static void main(String[] args) 
	{
		List<String> al=new ArrayList<>();
			al.add("kiran");
			al.add("mahesh");
			al.add("ram");
			al.add("reddy");
			al.add(1,"rathd kiran");
			al.set(2,"aaarav");
			System.out.println(al);
			System.out.println("get 2nd position:"+al.get(2));
			System.out.println("remove 3rd position:"+al.remove(3));
			for(String s:al)
			System.out.println(s);
	}
}
