package decorator_pattern;

public class DarkRoast extends Beverage {

	public DarkRoast(){
		//Beverage로부터 상속받음
		description = "다크로스트 커피";	
	}

	@Override
	public double cost() {
		return 2.01;
	}
}