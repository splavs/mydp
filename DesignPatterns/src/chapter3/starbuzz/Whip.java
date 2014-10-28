package chapter3.starbuzz;

public class Whip extends CondimentDecorator {
	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Whip";		
	}
	
	public void setSize(Size size) {
		beverage.setSize(size);
	}
	
	public Size getSize() {
		return beverage.getSize();
	}

	
	public double cost() {
		return beverage.cost() + .10;
	}

}
