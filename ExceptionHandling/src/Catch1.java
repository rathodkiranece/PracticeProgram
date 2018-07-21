public class Catch1 {
    public static void main(String[] args) {
        try {
			System.out.println("A");
            throw new java.io.IOException();
        } catch (java.io.IOException exc) {
			System.out.println("B");
            System.err.println("In catch IOException: "+exc.getClass());
        } catch (Exception exc) {
            System.err.println("In catch Exception: "+exc.getClass());
        } finally {
            System.err.println("In finally");
        }
    }
}
/* A
B
In catch IOException: class java.io.IOException
In finally
*/