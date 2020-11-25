package decorator_pattern;

public class Espresso extends Beverage {

	public Espresso(){
		//Beverage로부터 상속받음
		description = "에스프레소 커피";	
	}

	@Override
	public double cost() {
		return 1.99;
	}
}