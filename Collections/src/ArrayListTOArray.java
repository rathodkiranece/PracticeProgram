import java.util.ArrayList;
import java.util.List;
 
public class ArrayListTOArray {
 
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        
        list.add("array");
        list.add("arraylist");
        list.add("convertion");
        list.add("javaprogram");
        
        String [] str = list.toArray(new String[list.size()]);
        
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
 
    }
 
}