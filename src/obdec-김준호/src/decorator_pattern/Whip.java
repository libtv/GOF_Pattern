package decorator_pattern;

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 휘핑크림";
	}

	@Override
	public double cost() {
		return .30 + beverage.cost();
	}
}