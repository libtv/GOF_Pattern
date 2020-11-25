import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PrintIter {
	Iterator<Organization> hanbat;

	public PrintIter (Iterator<Organization> hanbat) {
		this.hanbat = hanbat;
	}
	
	public void setSolt(Iterator<Organization> hanbat) {
		this.hanbat = hanbat;
	}

	public void printMenu() {
		printMenu(hanbat);
	}

	private void printMenu(Iterator<Organization> iterator) {
		System.out.println("#######정렬#######");
		while (iterator.hasNext()) {
			Organization menuItem = (Organization)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getRank() + ", ");
			System.out.println(menuItem.getAnnual() + "년 ");
		}
	}

}