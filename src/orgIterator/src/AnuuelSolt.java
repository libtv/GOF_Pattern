import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class AnuuelSolt implements SoltIterator {
	ArrayList<Organization> menuItems;
	
	AnuuelSolt(ArrayList<Organization> menuItems) {
		this.menuItems = menuItems;
		this.solt();
	}

	@Override
	public Iterator<Organization> createIterator() {		
		return menuItems.iterator();
	}

	@Override
	public void solt() {
		Collections.sort(menuItems, new Comparator<Organization>() { 
			@Override
			public int compare(Organization o1, Organization o2) {
					return Integer.compare(o1.annual, o2.annual);
			} 
		});
	}
}
