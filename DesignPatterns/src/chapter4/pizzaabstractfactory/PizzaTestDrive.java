package chapter4.pizzaabstractfactory;


public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza);
		
		
	}
}
