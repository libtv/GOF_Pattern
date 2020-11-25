package abstract_Factory.factory;

import java.util.ArrayList;

import abstract_Factory.Comment;
import abstract_Factory.display.Big;
import abstract_Factory.display.Display;

public class Display_Big_Factory implements DisplayAbstractFactory {
	ArrayList<Comment> options = new ArrayList<Comment>();
	
	public Display_Big_Factory(ArrayList<Comment> comment) {
		options = comment;
	}

	@Override
	public Display createMethod() {
		// TODO Auto-generated method stub
		return new Big(options);
	}

}
