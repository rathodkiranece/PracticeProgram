// Java code to demonstrate the application
// of descendingMap() and descendingKetSet()
import java.io.*;
import java.util.*;
public class descendingAppli {
public static void main(String[] args)
    {
 
        // Declaring the tree map of Integer and String
        // to store participants info of scores with name
        TreeMap<Integer, String> participants = new TreeMap<Integer, String>();
 
        // assigning score of participants
        // using put()
        participants.put(30, "Ashty");
        participants.put(45, "Shavi");
        participants.put(16, "Vaish");
        participants.put(15, "Kil");
        participants.put(11, "Manju");
 
        // putting ranks in NavigableMap
        // use of descendingMap() to assign 1st to
        // maximum values and so on
        NavigableMap<Integer, String> Ranks = participants.descendingMap();
 
        System.out.println("The ranks according to scores are : ");
 
        // Printing values rankwise
        int count = 0;
        for (NavigableMap.Entry<Integer, String> entry : Ranks.entrySet()) {
            count++;
            String str = Integer.toString(count);
            System.out.println("Rank " + str + ": " + entry.getValue());
        }
    }
}