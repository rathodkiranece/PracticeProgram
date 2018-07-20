//copy the data from one array to another array 
class ArraytoCopy  { 
public static void main(String[] args)   {
	int[] copyfrom={10,20,30,40,50,60,70,80};
	int[] newarray=java.util.Arrays.copyOfRange(copyfrom,1,4);
	for (intaa:newarray)   { 
		System.out.println(aa);//20 30 40 
		}
		}
		} 