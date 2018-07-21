//3.Write a Program to print Armstrong Number?
class ArmstrongExample 
{
	public static void main(String[] args) 
	{
		int sum=0,rem,temp;
		int number=153;
		temp=number;
		while(number>0)
		{
			rem=number%10;
			number=number/10;
			sum=sum+(rem*rem*rem);
		}
		if(temp==sum)
		System.out.println("armstrong number");  
		else  
	        System.out.println("Not armstrong number");   
	   }  
	}  
