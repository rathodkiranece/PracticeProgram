class Display { 
	public static synchronized void wish(String name)  {  
		for(int i=0;i<5;i++)   { 
	System.out.print("good morning:");   
	try    { 
		Thread.sleep(500);   
	}    catch (InterruptedException e){}  
	System.out.println(name);  
	}  
	} 
	} 
	class MyThread extends Thread { 
		Display d; 
		String name;
		MyThread(Display d,String name){  
			this.d=d; 
			this.name=name; 
			}
	public void run()  
		{
		d.wish(name);  
		}
		}
class SynchronizedDemo { 
	public static void main(String[] args)  { 
		Display d1=new Display();  
		Display d2=new Display(); 
		
		MyThread t1=new MyThread(d1,"dhoni");  
		MyThread t2=new MyThread(d2,"yuvaraj"); 
		t1.start(); 
		t2.start(); 
		}
		} 