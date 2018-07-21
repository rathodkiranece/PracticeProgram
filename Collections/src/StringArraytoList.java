import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class StringArraytoList 
{
	public static void main(String[] args) 
	{
		String[] str={"Kiran","Rathod"};
		List<String> list=new ArrayList<>();
		list.add(str[0]);
		list.add(str[1]);
		System.out.println(list);
		//(or)
		/*List<String> list=Arrays.asList(str);
		System.out.println(list);*/

	}
}
