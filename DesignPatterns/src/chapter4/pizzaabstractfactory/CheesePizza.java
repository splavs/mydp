package chapter4.pizzaabstractfactory;


public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSouce();
		veggies = ingredientFactory.createVeggies();
	}
	


}
