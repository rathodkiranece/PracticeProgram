import java.io.*;

class A implements Serializable{
	int i;
	String s;
	public A(int i,String s) {
		this.i=i;
		this.s=s;
	}
}
	public class Test{
		public static void main(String[] args) throws IOException,ClassNotFoundException{
			A a=new A(10,"kiran");
//			Serializable
			FileOutputStream fos=new FileOutputStream("abc.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(a);
			//De-Serializable
			FileInputStream fis=new FileInputStream("abc.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			A b=(A)ois.readObject();
			System.out.println(b.i+" "+b.s);
			oos.close();
			ois.close();
			
			
		}
	}


