public class Catch5 {
    public static void main(String[] args) {
        try {
			System.out.println("A");
            throw new FileNotFoundException();
        } catch (RuntimeException exc) {
			System.out.println("B");
            System.err.println("In catch IOException: "+exc.getClass());
        } catch (FileNotFoundException exc) {
            System.err.println("In catch Exception: "+exc.getClass());
        } finally {
            System.err.println("In finally");
        }
    }
}
/* 
Catch5.java:5: error: cannot find symbol
            throw new FileNotFoundException();
                      ^
  symbol:   class FileNotFoundException
  location: class Catch5
Catch5.java:9: error: cannot find symbol
        } catch (FileNotFoundException exc) {
                 ^
  symbol:   class FileNotFoundException
  location: class Catch5
2 errors
*/