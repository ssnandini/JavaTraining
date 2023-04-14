package com.dedalus.tryPCS;

import java.util.function.Predicate;

public class PredicateEx {

	static Boolean checkAge(int age) {
		if (age > 0 && age <= 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// Using Predicate interface
		Predicate<Integer> predicate = PredicateEx::checkAge;
		// Calling Predicate method
		Boolean result = predicate.test(100);
		if (result == true) {
			System.out.println("Baby");
		} else {
			if (result == false) {
				System.out.println("Adult");
			}
		}
	}
}
