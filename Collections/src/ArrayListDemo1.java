import java.util.ArrayList;
class ArrayListDemo1 { 
	public static void main(String[] args){ 
 
  ArrayList<String> l = new ArrayList<>(); 
 
  l.add("A");  
  l.add("10"); 
  l.add("A"); 
  System.out.println(l); //[A, 10, A] 
  l.remove(2);   
  System.out.println(l); //[A, 10]
  l.add(2,"M");  
  l.add("N");
  l.set(3,"K");
  System.out.println(l); //[A, 10, M, N]
 
 } } 