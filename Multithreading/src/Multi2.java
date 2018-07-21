class Multi2 extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
Multi2 t1=new Multi2(); 
Thread t2=new Thread(t1);
t1.start();
t2.start();
  
 }  
}  