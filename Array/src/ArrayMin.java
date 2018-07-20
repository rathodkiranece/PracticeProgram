class ArrayMin 
{
	public static void main(String[] args) 
	{
		int[] numbers={4,1,8,3,5};
		//find the Minimum
		int min=numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]<min)
				 min=numbers[i];
		}
		System.out.println("Minimum:"+min);
	}
}
