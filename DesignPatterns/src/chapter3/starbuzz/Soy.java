package chapter3.starbuzz;

public class Soy extends CondimentDecorator {
	private Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Soy";		
	}
	
	public void setSize(Size size) {
		beverage.setSize(size);
	}
	
	public Size getSize() {
		return beverage.getSize();
	}

	
	public double cost() {
		return beverage.cost() + .15;
	}

}
