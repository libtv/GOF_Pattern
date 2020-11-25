import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class HanbatOrg {
	ArrayList<Organization> menuItems;
	int type;
	
	public HanbatOrg(){
		menuItems = new ArrayList<Organization>();
		addItem("김회장", "회장", 4);
		addItem("김부장", "부장", 7);
		addItem("박부장", "부장", 5);
		addItem("이부장", "부장", 1);
		addItem("김사원", "사원", 1);
		addItem("강사원", "사원", 3);
		addItem("이과장", "과장", 8);
		addItem("이대리", "대리", 5);
		addItem("김사원", "사원", 2);
		addItem("강사원", "사원", 4);
	}
	
	public void addItem(String name, String rank, int annual) {
		Organization menuItem = new Organization(name, rank, annual);
		menuItems.add(menuItem);
	}
	
	public ArrayList<Organization> getMenuItems() {
		return menuItems;
	}
}
