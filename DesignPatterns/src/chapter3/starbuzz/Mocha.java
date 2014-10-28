package chapter3.starbuzz;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";		
	}
	
	public void setSize(Size size) {
		beverage.setSize(size);
	}
	
	public Size getSize() {
		return beverage.getSize();
	}
	
	public double cost() {
		Size size = getSize();
		switch (size) {
		case small: return beverage.cost() + .20;
		case medium: return beverage.cost() + .25;
		case large: return beverage.cost() + .30;
		default: return beverage.cost() + .20; 
		}
		
	}

}
