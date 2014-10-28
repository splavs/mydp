package chapter4.pizzamethodfactory;

import chapter4.Pizza;

public abstract class PizzaStore {
	private Pizza pizza;
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);	

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
	
	public abstract Pizza createPizza(String type);

}
