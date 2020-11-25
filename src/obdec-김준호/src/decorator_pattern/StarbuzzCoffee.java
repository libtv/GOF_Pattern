package decorator_pattern;

import decorator_pattern.size.*;

public class StarbuzzCoffee {
	public static void main(String[] args) {

		//에스프레소 커피 + Venti
		Beverage espresso = new Espresso();		
		espresso = new Venti(espresso);
		System.out.println(espresso.getDescription()+
				" : $"+espresso.cost());
		
		//에스프레소 커피 + Tall
		Beverage espresso2 = new Espresso();	
		espresso2 = new Tall(espresso2);
		System.out.println(espresso2.getDescription()+
				" : $"+espresso2.cost());
		
		//에스프레소 커피 + Grande
		Beverage espresso3 = new Espresso();	
		espresso3 = new Grande(espresso3);
		System.out.println(espresso3.getDescription()+
				" : $"+espresso3.cost());

		//다크로스트 커피 + 모카+ 모카 + 휘핑크림 + Tall
		Beverage darkRoast = new DarkRoast();
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);	
		darkRoast = new Tall(darkRoast);	
		System.out.println(darkRoast.getDescription()+ 
				" : $"+darkRoast.cost());

		//하우스 블렌드 커피, 두유, 모카, 휘핑크림  + Tall
		Beverage houseBlend = new HouseBlend();
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		houseBlend = new Tall(houseBlend);
		System.out.println(houseBlend.getDescription()+ 
				" : $"+houseBlend.cost());
	}
}