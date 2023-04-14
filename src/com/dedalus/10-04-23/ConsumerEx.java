package com.dedalus.tryPCS;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
	List<Integer> list = new ArrayList<Integer>();

	ConsumerEx() {
	}

	ConsumerEx(List<Integer> Lint) {

		list = Lint;
	}

	public void setList() {
		list.add(2);
		list.add(1);
		list.add(3);
	}

	public static void dispString(String astr) {
		System.out.println(astr);
	}

	public int sumValues() {
		int sumVal = 0;
		for (int i = 0; i < list.size(); i++) {
			sumVal = sumVal + list.get(i);
		}
		return sumVal;
	}

	public static void main(String[] args) {

		// Consumer to display a string
		Consumer<String> cStr = ConsumerEx::dispString;
		cStr.accept("Hello Nandini");

		List<Integer> lInte = new ArrayList<Integer>();
		ConsumerEx cEx = new ConsumerEx(lInte);
		cEx.setList();
		System.out.println(cEx.sumValues());

	}

}
