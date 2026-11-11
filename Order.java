import java.util.Random;
 
/**
 * Model class. Holds all the info for a single order in the line.
 */
public class Order {
 
    private static final String[] NAMES = {
        "Latte", "Cappuccino", "Espresso", "Mocha", "Americano",
        "Iced Tea", "Hot Chocolate", "Bagel", "Croissant", "Muffin",
        "Breakfast Sandwich", "Cookie"
    };
 
    private static final double MIN_PRICE = 1.50;
    private static final double MAX_PRICE = 15.00;
 
    private static final Random RANDOM = new Random();
 
    private final String name;
    private final double price;
 
    /** 
     * Makes a new order with a random name and a random price in dollars. 
     */
    public Order() {
        this.name = NAMES[RANDOM.nextInt(NAMES.length)];
        double raw = MIN_PRICE + (MAX_PRICE - MIN_PRICE) * RANDOM.nextDouble();
        this.price = Math.round(raw * 100) / 100.0;
    }
 
    /** 
     * Returns the name of the order. 
     */
    public String getName() {
        return name;
    }
 
    /** 
     * Returns the price of the order in dollars. 
     */
    public double getPrice() {
        return price;
    }
 
    /** 
     * Returns the order name and price together
     */
    @Override
    public String toString() {
        return String.format("%s - $%.2f", name, price);
    }
}
