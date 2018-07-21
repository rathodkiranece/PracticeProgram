class Test7{ 
	public void methodOne(int i) {  
		System.out.println("general method");  } 
		public void methodOne(int...i) {   
			System.out.println("var-arg method"); 
			}  
			public static void main(String[] args) {  
				Test7 t=new Test7();   t.methodOne();//var-arg method   
				t.methodOne(10,20);//var-arg method  
				t.methodOne(10);//general method 
				} 
				} 