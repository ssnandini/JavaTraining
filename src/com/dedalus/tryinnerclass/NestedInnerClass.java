package com.dedalus.tryinnerclass;

class NestedInnerClass
{
	int x =7;
	class MyInner
	{
		int s = 20; 
		public void InnerMethod()
		{
			int innvar = 100;
			
		//	System.out.println("inner x == " + x);
			
			System.out.println("inner instance s == " + s);
			
			System.out.println("inner local innvar == " + innvar);
		}
	}
	public void OuterMethod()
	{
		System.out.println("From outer method = " + x);
		MyInner inn = new MyInner();
		inn.InnerMethod();
	}
	
	public static void main(String[] a)
	{
	NestedInnerClass mo = new NestedInnerClass();
	//MyInner inn = new MyInner(); //invalid
	//inn.InnerMethod();
	//<outerclassname>.<innerclassname> objname = <outerclass instancename>.new <innerclassname>();
	
	
	
	NestedInnerClass.MyInner mi = mo.new MyInner(); //instantiate inner class
	mi.InnerMethod();
	
	//mo.OuterMethod();
	System.out.println(mo.x);
	//System.out.println(mi.x);  // This is not possible
	
	// mo.OuterMethod();
	//mi.OuterMethod();  illegal
	//mo.InnerMethod();   illegal 
		
	}
		
}


// Check whether the inner class can be abstract

//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	Cannot instantiate the type MyOuter.MyInner

// can it be inherited?

// scope of instance variable within the inner class 
// scope of local variable within the inner class







