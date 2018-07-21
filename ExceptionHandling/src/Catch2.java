public class Catch2 {
    public static void main(String[] args) {
        try {
			System.out.println("A");
            throw new java.lang.NullPointerException();
        } catch (java.lang.NullPointerException exc) {
			System.out.println("B");
            System.err.println("In catch NullPointerException: "+exc.getClass());
        } 
		catch( RuntimeException re){
			System.out.println(" C");
		}
		catch (java.lang.NullPointerException ne){
			System.out.println("D");
		}
			finally {
            System.err.println("In finally");
        }
    }
}
/*Catch2.java:13: error: exception NullPointerException has already been caught
                catch (java.lang.NullPointerException ne){
                ^
1 error*/