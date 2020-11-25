package abstract_Factory.factory;

import abstract_Factory.display.Display;

public class DisplayFactory {
    public static Display getProduct(DisplayAbstractFactory display) {
        return display.createMethod();
    }
}
