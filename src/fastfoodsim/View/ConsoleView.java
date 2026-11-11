package fastfoodsim.View;

// -------------------------------------------------------------------------
/**
 * Basic console view that outputs the current order and how many orders are in
 * line
 * 
 * @author benh5
 * @version Nov 10, 2026
 */
public class ConsoleView implements Observer {
    // ~ Fields ................................................................

    // ~ Constructors ..........................................................

    // ~Public Methods ........................................................
    @Override
    public void update(String display, int orderNumbers) {
        System.out.println(
            "--------------------------------------------------");
        System.out.println("Current Order: " + display);
        System.out.println("Number of Orders: " + orderNumbers);
        System.out.println(
            "--------------------------------------------------");
    }
}
