package decorator_pattern;

public abstract class Beverage {

	protected String description = "제목없음";
	protected String size_description = "보통";

	public abstract double cost();
	
	public String getDescription() {
		return description;
	}
	
	public String getSize_description() {
		return size_description;
	}	
}