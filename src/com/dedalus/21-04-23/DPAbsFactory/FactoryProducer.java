package com.dedalus.DPAbsFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(boolean PizzaOption) {
		if (PizzaOption) {
			return new PizzaVegFactory();
		} else {
			return new PizzaNonVegFactory();
		}
	}
}
