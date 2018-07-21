// Java program to demonstrate working of Collections.reveseOrder()
// to sort a list in descending order
import java.util.*;
 
public class Collectionsorting
{
    public static void main(String[] args)
    {
        // Create a list of Integers
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(30);
        al.add(20);
        al.add(10);
        al.add(40);
        al.add(50);
 
        /* Collections.sort method is sorting the
        elements of ArrayList in descending order. */
        Collections.sort(al, Collections.reverseOrder());
 
        // Let us print the sorted list
        System.out.println("List after the use of Collection.reverseOrder()"+
                           " and Collections.sort() :\n" + al);
    }
}