package chapter4.pizzamethodfactory;

import chapter4.Pizza;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza);
		
		
	}
}
