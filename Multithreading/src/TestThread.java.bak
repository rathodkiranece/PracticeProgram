class TestThread extends Thread 
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);

		}
	}

	public static void main(String[] args) 
	{
		TestThread t=new TestThread();
		t.start();
		TestThread t1=new TestThread();
		t1.start();

	}
}
