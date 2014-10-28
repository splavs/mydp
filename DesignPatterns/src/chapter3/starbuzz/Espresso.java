package chapter3.starbuzz;

public class Espresso extends Beverage {
	public Espresso() {
		description = "Espresso";
	}
	
	public double cost() {
		double basePrice = 1.99;
		switch (size) {
		case small: return basePrice;
		case medium: return basePrice * 1.1;
		case large: return basePrice * 1.2;
		default: return basePrice;
		}
		
	}

}
