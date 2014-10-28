package chapter3.starbuzz;

public abstract class Beverage {
	String description = "Unknown Beverage";
	enum Size {small, medium, large};
	Size size = Size.small;
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
	public void setSize(Size size) {
		this.size = size;		
	}
	
	public Size getSize() {
		return size;
	}

}
