
public class Sum {

	
	public int sum(int x, int y) {
		return (x+y);
	}
	public int sum(int x, int y, int z) {
		return (x+y+z);
	}
	public double sum(double x, double y) {
		return (x+y);
	}
public static void main(String args[]) {
	Sum s=new Sum();
	System.out.println(s.sum(1, 2));
	System.out.println(s.sum(1, 2, 3));
	System.out.println(s.sum(10.4, 20.5));
	
}
}