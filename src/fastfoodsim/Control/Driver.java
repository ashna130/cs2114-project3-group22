package fastfoodsim.Control;

import fastfoodsim.View.*;
import fastfoodsim.Model.*;

public class Driver
{
    //~ Fields ................................................................

    //~ Constructors ..........................................................

    //~Public  Methods ........................................................
    
    public static void main(String[] args) {
        Shop model = new Shop();
        ShopController controller = new ShopController(model);
        
        ConsoleView consoleView = new ConsoleView();
        WindowView windowView = new WindowView(controller);
        
        model.addObserver(consoleView);
        model.addObserver(windowView);
    }
}
