package chapter4.pizza1;

import chapter4.CheesePizza;
import chapter4.Pizza;
import chapter4.VeggiePizza;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if ("veggie".equals(type)) {
			pizza = new VeggiePizza();
		}
		return pizza;
		
	}

}
