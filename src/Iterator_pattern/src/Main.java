
public class Main {
	
	public static void main(String args[]) {
		PancakeHouseMenu p = new PancakeHouseMenu();
		Waitress w = new Waitress(p);
		w.printMenu();
	}
}
