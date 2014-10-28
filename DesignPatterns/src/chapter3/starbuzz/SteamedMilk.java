package chapter3.starbuzz;

public class SteamedMilk extends CondimentDecorator {
	private Beverage beverage;
	
	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", SteamedMilk";		
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
