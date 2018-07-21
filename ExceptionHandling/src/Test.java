public class Test {
	public static void main(String[] args) {
		try {
			System.out.println("try block executed");
			return; 
			} 
			catch(ArithmeticException e) 
				{
					System.out.println("catch block executed");
					return; 
				}
				finally 
				{
					System.out.println("finally block executed");
				} 
		}
}
