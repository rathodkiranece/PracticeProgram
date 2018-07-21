import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 */

/**
 * @author Kiran.Rathod
 */
public class DuplicateItemsRemove {

 /**
  * @param args
  */
 public static void main(String[] args) {
  //ArrayList with duplicates items
 //List<String> listOfDuplicateItems = (List<String>) Arrays.asList("DOJ" , "DOJ", "MB", "DR", "AM");
     ArrayList<String>   listOfDuplicateItems=new ArrayList<>();
	 listOfDuplicateItems.add("DOJ");
	 listOfDuplicateItems.add("DOJ");
	 listOfDuplicateItems.add("MB");
	 listOfDuplicateItems.add("DR");
	 listOfDuplicateItems.add("AM");
        //should print 5 with duplicates items
        System.out.println("size of Arraylist with duplicates: " + listOfDuplicateItemssize());      
        System.out.println("ArrayList with duplicates: " + listOfDuplicateItems);
      
        //Converting ArrayList to HashSet to remove duplicates
        Set<String> listToSet = new HashSet<String>(listOfDuplicateItems);
		
        System.out.println("size of ArrayList without duplicates: " + listToSet.size());
        System.out.println("ArrayList after removing duplicates in same order: " +listToSet);
      
        //Creating Arraylist without duplicate items
        List<String> listOfItems = new ArrayList<String>(listToSet);

        //should print 4 because of duplicates items are removed
        System.out.println("size of ArrayList without duplicates: " + listToSet.size());
        System.out.println("ArrayList after removing duplicates in same order: " + listOfItems);

 }
}

