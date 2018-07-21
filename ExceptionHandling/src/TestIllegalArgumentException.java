class TestIllegalArgumentException{ 
	public static void main(String[] args){ 
		Thread t=new Thread(); 
		t.setPriority(10);//valid 
		t.setPriority(100);//invalid 
		}
		} 