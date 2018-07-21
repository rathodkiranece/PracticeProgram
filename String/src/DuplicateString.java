import java.util.*;
class DuplicateString  
{
	public static void main(String[] args) 
	{
		String str[]={"Apple","Apple","Mango","Banana"};
		List<String> str1=Arrays.asList(str);
		Set<String> set=new HashSet<String>(str1);
		System.out.println(set);
		System.out.println(set.size());
	}
}
