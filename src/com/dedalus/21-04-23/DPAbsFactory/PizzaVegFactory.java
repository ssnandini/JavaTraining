package com.dedalus.DPAbsFactory;

public class PizzaVegFactory extends AbstractFactory {
	public Pizza getPizza(String pizzaType) {
		if (pizzaType == null) {
			return null;
		} else if (pizzaType.equalsIgnoreCase("VeggiePizza")) {
			return new VeggiePizza();
		} else if (pizzaType.equalsIgnoreCase("CheesePizza")) {
			return new CheesePizza();
		}
		return null;
	}
}
