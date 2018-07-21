class TestJoin extends Thread 
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try{
				Thread.sleep(500);
			}catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		TestJoin t1=new TestJoin();
		TestJoin t2=new TestJoin();
		TestJoin t3=new TestJoin();
		t1.start();
				System.out.println("Name of t1:"+t1.getName()); //Thread-0 
				System.out.println("Name of t2:"+t2.getName());//Thread-1
				System.out.println("Name of t3:"+t3.getName());//Thread-2
				System.out.println("get ID of t1:"+t1.getId());//10
				System.out.println("get ID of t2:"+t2.getId());



	}
}
