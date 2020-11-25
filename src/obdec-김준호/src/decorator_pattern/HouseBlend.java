package decorator_pattern;

public class HouseBlend extends Beverage {

	public HouseBlend(){
		//Beverage로부터 상속받음
		description = "하우스 블렌드 커피";	
	}

	@Override
	public double cost() {
		return 3.01;
	}
}