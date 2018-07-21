// Java program to demonstrate working of Collections.reveseOrder()
// to sort an array in descending order
import java.util.*;
 
public class Collectionsorting
{
    public static void main(String[] args)
    {
        // Create an array to be sorted in descending order.
        Integer [] arr = {30, 20, 40, 10};
 
        /* Collections.sort method is sorting the
        elements of arr[] in descending order. */
        Arrays.sort(arr, Collections.reverseOrder());
 
        // Let us print the sorted array
        System.out.println("Array after the use of Collection.reverseOrder()"+
                           " and Arrays.sort() :\n" + Arrays.toString(arr));
    }
}
