package com.dedalus.view;

class ThreadB implements Runnable{

	public void run() {
		System.out.println("Method started");

		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(1000);
				System.out.println("i = " + i);
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Method ended");
	}

}

public class ThreadEg2 {

	public static void main(String[] args) {
		System.out.println("Main started");
		ThreadA t1 = new ThreadA();
		ThreadA t2 = new ThreadA();
		t1.start();
		t2.start();
		System.out.println("Main ended");
	}

}
