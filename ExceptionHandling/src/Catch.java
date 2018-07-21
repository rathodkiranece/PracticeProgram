public class Catch {
    public static void main(String[] args) {
        try {
            throw new java.io.IOException();
        } catch (java.io.IOException exc) {
            System.err.println("In catch IOException: "+exc.getClass());
            throw new RuntimeException();
        } catch (Exception exc) {
            System.err.println("In catch Exception: "+exc.getClass());
        } finally {
            System.err.println("In finally");

        }
    }
}
/*
In catch IOException: class java.io.IOException
In finally
Exception in thread "main" java.lang.RuntimeException
        at Catch.main(Catch.java:7)
		*/