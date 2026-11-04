package fastfoodsim.View;
public class ConsoleView implements Observer{
    //~ Fields ................................................................

    //~ Constructors ..........................................................

    //~Public  Methods ........................................................
    @Override
    public void update(String display, int orderNumbers) {
        System.out.println("--------------------------------------------------");
        System.out.println("Current Order: " + display);
        System.out.println("Number of Orders: " + orderNumbers);
        System.out.println("--------------------------------------------------");
    }
}
