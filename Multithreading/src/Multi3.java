class Multi3 extends Thread implements Runnable{  
public void run()
{  
System.out.println("thread is running...");  
}   
public static void main(String args[]){  
Multi3 m1=new Multi3();  
/*Thread t1 =new Thread(m1); //If you are not extending the Thread class, 
//your class object would not be treated as a thread object.
//So you need to explicitely create Thread class object
t1.start();*/
m1.start();
 }  
}  