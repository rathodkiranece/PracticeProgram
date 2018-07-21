// Java code to demonstrate the working
// descendingKeySet()
import java.io.*;
import java.util.*;
public class descendingKeySet1 {
public static void main(String[] args)
    {
 
        // Declaring the tree map of Integer and String
        TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
 
        // assigning the values in the tree map
        // using put()
        treemap.put(2, "two");
        treemap.put(0, "zero");
        treemap.put(3, "three");
        treemap.put(6, "six");
        treemap.put(9, "nine");
        treemap.put(7, "seven");
 
        // putting values in navigable set
        // use of descendingKeySet
        NavigableSet set1 = treemap.descendingKeySet();
 
        System.out.println("Navigable set values are: " + set1);
    }
}