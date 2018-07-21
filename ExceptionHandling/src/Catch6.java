public class Catch6{
    public static void main(String[] args) {
        try {
			System.out.println("A");
            throw new ArrayIndexOutOfBoundsException();
        } catch (RuntimeException exc) {
			System.out.println("B");
            System.err.println("In catch IOException: "+exc.getClass());
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.err.println("In catch Exception: "+exc.getClass());
        } finally {
            System.err.println("In finally");
        }
    }
}