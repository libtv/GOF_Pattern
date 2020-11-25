package default_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Default_main {
	 // 기존에는 코드를 이렇게 구현하였다.
	static ArrayList<Comment> options = new ArrayList<Comment>();
	static String title, head, body;
	
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
		
		
		if (scanner.nextLine().equals("big")) {
			System.out.println("\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
			System.out.println("-----" + options.get(0).getTitle() + "-----");
			for(int i=0; i<options.size(); i++) {
				System.out.println("Section" + (i + 1) + ". --- " + options.get(i).getHead() + " ---");
				System.out.println(options.get(i).getBody());
				System.out.println("");
			}
		} else {
			System.out.println("\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
			System.out.println(options.get(0).getTitle());
			for(int i=0; i<options.size(); i++) {
				System.out.println(options.get(i).getHead());
				System.out.println(options.get(i).getBody());
				System.out.println("");
			}
		}
		

		
	}
	
	static boolean Quit_String(String str) {
		if (str.equals("-done")) {
			str = null;
			return true;
		}
		return false;
	}
}
