package fastfoodsim.Control;

import fastfoodsim.View.*;
import fastfoodsim.Model.*;

public class Driver
{
    //~ Fields ................................................................

    //~ Constructors ..........................................................

    //~Public  Methods ........................................................
    
    public static void main(String[] args) {
        Line<Order> model = new Line<Order>();
        LineController controller = new LineController(model);
        
        ConsoleView consoleView = new ConsoleView();
        WindowView windowView = new WindowView(controller);
        
        model.addObserver(consoleView);
        model.addObserver(windowView);
    }
}
