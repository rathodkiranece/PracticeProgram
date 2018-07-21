class Function1 
{
	public static void main(String[] args) 
	{
		//TODO Auto generated method stub
		int a=10;
		int b=2;
		int c=Add(a,b);
		int d=sub(a,b);
		System.out.println(c);
		System.out.println(d);
	}
	private static int Add(int x,int y){
		int Add=x+y;
		//System.out.println(Add);
		return Add;
	}
	public static int sub(int r,int s){
		int sub=r-s;
		return sub;
	}
	
}
