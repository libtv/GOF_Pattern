package abstract_Factory.factory;

import java.util.ArrayList;

import abstract_Factory.Comment;
import abstract_Factory.display.Display;
import abstract_Factory.display.Small;

public class Display_Small_Factory implements DisplayAbstractFactory {
	 ArrayList<Comment> options = new ArrayList<Comment>();
	
	public Display_Small_Factory(ArrayList<Comment> comment) {
		options = comment;
	}
	
	@Override
	public Display createMethod() {
		// TODO Auto-generated method stub
		return new Small(options);
	}

}
