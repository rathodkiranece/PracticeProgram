	//NumGenDemo.java
	class  NumGen extends Thread
	{
		public void run()
		{
			try
			{
				for(int i=1;i<=10;i++){
					System.out.println("val of i="+i);
					Thread.sleep(1000);
			}
			}catch (InterruptedException  ie)
			{
				System.err.println("prop in  thread exe..");
			}
			}//run()
			}//NumGen----BLC
		class NumGenDemo
			{
				public static void main(String[] args) 
			{
				NumGen no=new NumGen();
				no.start();
			}
	}
