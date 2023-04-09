package com.dedalus.tryvolatile;

public class VolatileThread extends Thread  {
	private final VolatileData data;

	public VolatileThread(VolatileData data) {
		this.data = data;
	}

	@Override
	public void run() {
		int oldValue = data.getSum();
		System.out.println("[Thread " + Thread.currentThread().getId() + "]: Old value = " + oldValue);
		data.increaseSum();
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		int newValue = data.getSum();
		System.out.println("[Thread " + Thread.currentThread().getId() + "]: New value = " + newValue);
	}
}