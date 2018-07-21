import java.lang.reflect.Field; 

public class MutableString {

    public static void main(String[] args) { 
        String s = "Immutable"; 
        String t = "Notreally"; 

        mutate(s, t);
        System.out.println(t); 

        // strings are interned so this doesn't even print "Immutable" (!)
        System.out.println("Immutable");
    } 

    // change the first min(|s|, |t|) characters of s to t
    public static void mutate(String s, String t) {
        try {
            Field val = String.class.getDeclaredField("value"); 
            Field off = String.class.getDeclaredField("offset"); 
            val.setAccessible(true); 
            off.setAccessible(true); 
            int offset   = off.getInt(s); 
            char[] value = (char[]) val.get(s); 
            for (int i = 0; i < Math.min(s.length(), t.length()); i++)
                value[offset + i] = t.charAt(i); 
        } 
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    } 

} 