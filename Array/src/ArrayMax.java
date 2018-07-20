class ArrayMax 
{
	public static void main(String[] args) 
	{
		int[] numbers={4,1,8,3,5};
		//find the Maximun
		int max=numbers[0];
		for(int i=1;i<numbers.length;i++)
			if(numbers[i]>max)
			max=numbers[i];
		System.out.println("Maximum:"+max);
	}
}
