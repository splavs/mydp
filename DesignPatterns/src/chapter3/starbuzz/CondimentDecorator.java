package chapter3.starbuzz;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
	public abstract void setSize(Size size);
	public abstract Size getSize();

}
