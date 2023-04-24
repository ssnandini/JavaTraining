package com.dedalus.DPAbsFactory;

public class AbsFactoryDpat {
	public static void main(String[] args) {

		AbstractFactory af = FactoryProducer.getFactory(false);
		Pizza pizza1 = af.getPizza("PepperoniPizza");
		pizza1.prepare();
		pizza1.bake();
		pizza1.cut();
		pizza1.box();
		System.out.println("-------------------");
		AbstractFactory af1 = FactoryProducer.getFactory(true);
		Pizza pizza2 = af1.getPizza("VeggiePizza");
		pizza2.prepare();
		pizza2.bake();
		pizza2.cut();
		pizza2.box();
		System.out.println("-------------------");
		Pizza pizza3 = af1.getPizza("CheesePizza");
		pizza3.prepare();
		pizza3.bake();
		pizza3.cut();
		pizza3.box();
	}
}
