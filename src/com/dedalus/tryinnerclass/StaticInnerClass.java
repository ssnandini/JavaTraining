package com.dedalus.tryinnerclass;

class StaticInnerClass {
	static int i = 10;

	public void method() {
		System.out.println("OuterClass - Method i == " + ++i);

		InnerClass i = new InnerClass();
		System.out.println(i.innerVar);
	}

	static class InnerClass {
		int innerVar = 20;

		public void display() {
			System.out.println("InnerClass - Method i == " + i);
		}
	}

	public static void main(String[] a) {
		StaticInnerClass.InnerClass ic = new StaticInnerClass.InnerClass();
		ic.display();

		StaticInnerClass oc = new StaticInnerClass();
		oc.method();

	}
}
