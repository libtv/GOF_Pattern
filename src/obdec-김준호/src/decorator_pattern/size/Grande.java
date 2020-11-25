package decorator_pattern.size;

import decorator_pattern.Beverage;

public class Grande extends Size {
	Beverage beverage;

	public Grande(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Size Grande";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}
