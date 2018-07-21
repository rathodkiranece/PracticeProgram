import java.util.Arrays;
public class SortArray {
 
    public static void main(String... args)
    {
            String[] countries = {"India","United States","Malaysia","Australia","Lundon"};
 
            Arrays.sort(countries); // Countries array values will be sorted here
 
            for(int i=0;i<countries.length;i++)
            {
                System.out.println("Countries : "+countries[i]);
            }
    }
}