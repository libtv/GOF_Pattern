import java.util.Iterator;

public class Waitress {
	PancakeHouseMenu ph;

	public Waitress (PancakeHouseMenu p) {
		this.ph = p;
	}

	public void printMenu() {
		System.out.println("MENU\n----\n아침");
		printMenu(ph.createIterator());
	}
	
	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}