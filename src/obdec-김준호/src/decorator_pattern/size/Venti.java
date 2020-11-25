package decorator_pattern.size;

import decorator_pattern.Beverage;

public class Venti extends Size {
	Beverage beverage;

	public Venti(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Size Venti";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
}
