package chapter3.starbuzz;

import chapter3.starbuzz.Beverage.Size;

public class StarBuzz {

	public static void main(String[] args) {
		HouseBlend coffee = new HouseBlend();
		//coffee.setSize(Size.large);
		Beverage coffeeWithTopings = new Whip(new Soy(new Mocha(new Mocha(coffee))));
		coffeeWithTopings.setSize(Size.large);
		System.out.println(coffeeWithTopings.getDescription());
		System.out.println(coffeeWithTopings.cost());

	}

}
