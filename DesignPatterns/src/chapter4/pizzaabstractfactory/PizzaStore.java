package chapter4.pizzaabstractfactory;

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
