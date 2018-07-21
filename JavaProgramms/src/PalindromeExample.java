//Write a Program  to Print Palindrome?
class PalindromeExample {
	public static void main(String[] args) {
		int sum=0,rem,temp;
		int number=454;
		temp=number;
		while(number>0)
		{
			rem=number%10;
			number=number/10;
			sum=(sum*10)+rem;
		}
		if(temp==sum)
		System.out.println("Palindrome number");  
		else  
	        System.out.println("Not Palindrome number");   
	   }  
	}  