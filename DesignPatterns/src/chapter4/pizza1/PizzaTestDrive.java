package chapter4.pizza1;

import chapter4.Pizza;

public class PizzaTestDrive {
	public static void main(String[] args) {
		SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
		
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza);
		
		
	}
}
