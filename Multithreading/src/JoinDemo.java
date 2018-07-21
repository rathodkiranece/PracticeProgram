class JoinDemo extends Thread{
 public void run(){
  for(int i=1;i<=5;i++){
   try{
    Thread.sleep(1000);
   }catch(Exception e){
     System.out.println(e);
   }
   System.out.println("Dinesh on Java "+i);
   }
  }
public static void main(String args[]){
 JoinDemo t1 = new JoinDemo();
 JoinDemo t2 = new JoinDemo();
 JoinDemo t3 = new JoinDemo();
 t1.start();
 try{
  t1.join();
 }catch(Exception e){
   System.out.println(e);
 }

 t2.start();
 t3.start();
 }
}
