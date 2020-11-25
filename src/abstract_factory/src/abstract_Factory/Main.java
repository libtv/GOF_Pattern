package abstract_Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import abstract_Factory.display.Display;
import abstract_Factory.display.Small;
import abstract_Factory.factory.DisplayAbstractFactory;
import abstract_Factory.factory.DisplayFactory;
import abstract_Factory.factory.Display_Big_Factory;
import abstract_Factory.factory.Display_Small_Factory;

public class Main  {
	 // 기존에는 코드를 이렇게 구현하였다.
	static ArrayList<Comment> options = new ArrayList<Comment>();
	static String title, head, body, size;

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter title >> ");
		title = scanner.nextLine();
		
		while(true) {
			System.out.print("Enter Heading or “-done”: ");
			head = scanner.nextLine();
			if (Quit_String(head)) break;
			System.out.print("Enter Text : ");
			body = scanner.nextLine();
			options.add(new Comment(title, head, body));
		}
		System.out.print("Enter the style you want displayed : ");
		size = scanner.nextLine();
		DisplayAbstractFactory abstractfactory = null;
		
		if(size.equals("big")) {
			abstractfactory = new Display_Big_Factory(options);
		} else if(size.equals("small")) {
			abstractfactory = new Display_Small_Factory(options);
		}
		
		Display factory = DisplayFactory.getProduct(abstractfactory);
		factory.print();
		
	}
	
	static boolean Quit_String(String str) {
		if (str.equals("-done")) {
			str = null;
			return true;
		}
		return false;
	}
}
