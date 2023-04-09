package com.dedalus.tryinnerclass;
class LocalInnerClass
{
	int x =10;
	public void OuterMethod()
	{
		int j=90;
		class MinnerClass
		{
			int y = 10;
			public void minnerMethod()
			{
				int z = 20;
				
			System.out.println("Hello ..." + x + j);
				//System.out.println("minnerMethod: y" + y );
				System.out.println("minnerMethod: z" + z );
			}
		}
		
		
		MinnerClass mic = new MinnerClass();
		mic.minnerMethod();		
		
	}	
	public static void main(String[] a)
	{
		LocalInnerClass moc = new LocalInnerClass();
		moc.OuterMethod();		
	
		//MinnerClass mic = new MinnerClass();
		//mic.minnerMethod();

	}
}


//Create instance and local variable inside the inner class and access
// Can the method local inner class be abstract?













