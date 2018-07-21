import java.util.Scanner;
public class BubbleSortDemo
{
   public static void main(String[] args)
   {
      int numbers, a, b, swap;
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter number of integers to sort : ");
      numbers = sc.nextInt();
	  int array[] = new int[numbers];        
      System.out.println("Please enter " + numbers + " integers.");
	  for(a = 0; a < numbers; a++)
         array[a] = sc.nextInt();
	  for(a = 0; a < ( numbers - 1 ); a++)
      {
		for(b = 0; b < numbers - a - 1; b++)
         {
            if(array[b] > array[b + 1])
            { 
               swap = array[b];
               array[b] = array[b + 1];
               array[b + 1] = swap;
            } } }
		System.out.println("After Bubble Sort - ");
      for(a = 0; a < numbers; a++)          
         System.out.println(array[a]);
      sc.close();
   }
}