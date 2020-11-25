import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu(){
	menuItems = new ArrayList<MenuItem>();
	addItem("K&B팬케이크세트", "스크램블드에그와 토스트가 곁들여진 팬케이크", true,2.99);
	addItem("레귤러 팬케이크세트", "달걀 후라이와 소시지가 곁들여진 팬케이크",false,2.99);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
	
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
}
