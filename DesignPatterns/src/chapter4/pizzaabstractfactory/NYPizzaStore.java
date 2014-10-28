package chapter4.pizzaabstractfactory;

public class NYPizzaStore extends PizzaStore {
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if ("cheese".equals(type)) {
			pizza = new CheesePizza(ingredientFactory);
			
		} 
		
		return pizza;

		
	}

}
