package chapter4.pizzamethodfactory;

import chapter4.*;


public class NYPizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("cheese".equals(type)) {
			pizza = new NYStyleCheesePizza();
		} else if ("veggie".equals(type)) {
			pizza = new NYStyleVeggiePizza();
		}
		return pizza;

		
	}

}
