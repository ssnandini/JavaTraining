package com.dedalus.tryvolatile;

public class VolatileData {
	private volatile int sum = 0;
	private int addValue = 10;

	public int getSum() {
		return sum;
	}

	public void increaseSum() {
		sum = sum + addValue; // increases the value of counter by 1
	}
}
