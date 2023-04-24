package com.dedalus.DPAbsFactory;

public class PizzaNonVegFactory extends AbstractFactory {
	public Pizza getPizza(String pizzaType) {
		if (pizzaType == null) {
			return null;
		} else if (pizzaType.equalsIgnoreCase("PepperoniPizza")) {
			return new PepperoniPizza();
		}
		return null;
	}
}
