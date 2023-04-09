package com.dedalus.tryvolatile;

public class VolatileMain {

	public static void main(String[] args) throws InterruptedException {
		VolatileData volatileData = new VolatileData(); // object of VolatileData class
		System.out.println("Start");
		Thread t1 = new VolatileThread(volatileData);
		System.out.println("1...Start");
		t1.start();
		System.out.println("1...Join");
		t1.join();
		System.out.println("1...End");
		Thread t2 = new VolatileThread(volatileData);
		System.out.println("2...Start");
		t2.start();
		System.out.println("2...Join");
		t2.join();
		System.out.println("2...End");
		Thread t3 = new VolatileThread(volatileData);
		System.out.println("3...Start");
		t3.start();
		System.out.println("3...Join");
		t3.join();

		System.out.println("3...End");

	}
}
