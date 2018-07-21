class Account 
{
	int bal=10;
	//synchronized void deposit(int amt)
	void deposit(int amt)
	{
		bal=bal+amt;
		System.out.println("current bal ="+bal);
	}
}
	class Sync
	{
	public static void main(String[] args) 
	{
		Account a=new Account();
		a.deposit(10);
	}
}
