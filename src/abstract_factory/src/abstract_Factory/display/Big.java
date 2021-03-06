package abstract_Factory.display;

import java.util.ArrayList;

import abstract_Factory.Comment;

public class Big extends Display {
	ArrayList<Comment> options = new ArrayList<Comment>();
	
	public Big(ArrayList<Comment> comment) {
		this.options = comment;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
		System.out.println("-----" + options.get(0).getTitle() + "-----");
		for(int i=0; i<options.size(); i++) {
			System.out.println("Section" + (i + 1) + ". --- " + options.get(i).getHead() + " ---");
			System.out.println(options.get(i).getBody());
			System.out.println("");
		}
	}

}
