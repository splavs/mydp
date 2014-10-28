package chapter4.pizzaabstractfactory;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Souce createSouce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();

}
