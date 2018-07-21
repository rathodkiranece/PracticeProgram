
import java.util.*; 
class StringReverse  
{
	public static void main(String[] args) 
	{
		String[] str={"1","2","3","4","5","6","7","8","9","10"};
		List<String> str=Arrays.asList(str);
		for (int i=str.length;i>=0 ;i-- ){

			System.out.println(str.charAt(i));
	
		}
	}
}
