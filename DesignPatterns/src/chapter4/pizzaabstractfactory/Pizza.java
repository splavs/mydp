package chapter4.pizzaabstractfactory;

import java.util.ArrayList;

abstract public class Pizza {
	String name;
	Dough dough;
	Souce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	

	public String getName() {
		return name;
	}

	abstract  void prepare();

	public void bake() {
		System.out.println("Baking " + name);
	}

	public void cut() {
		System.out.println("Cutting " + name);
	}

	public void box() {
		System.out.println("Boxing " + name);
	}

	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < veggies.length; i++) {
			display.append(veggies[i] + "\n");
		}
		return display.toString();
	}
}

