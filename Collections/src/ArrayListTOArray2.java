import java.util.ArrayList;
import java.util.List;
 
public class ArrayListTOArray2 {
 
 public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Object[] integers = list.toArray();
        int[] intarray = new int[integers.length];
        int i = 0;
        for (Object n : integers) {
            intarray[i++] = (Integer) n;
            System.out.println(i);
        }
 
    }
 
}
