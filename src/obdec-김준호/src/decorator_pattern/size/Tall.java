package decorator_pattern.size;

import decorator_pattern.Beverage;

public class Tall extends Size {
	Beverage beverage;

	public Tall(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Size Tall";
	}

	@Override
	public double cost() {
		return .30 + beverage.cost();
	}

}
