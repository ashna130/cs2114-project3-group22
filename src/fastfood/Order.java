package fastfood;

/**
 * One customer's fast food order.
 *
 * @author Group 22
 * @version 2026.10.28
 */
public class Order {

    private int orderNumber;
    private String customer;
    private String item;
    private double price;

    /**
     * Makes a new order.
     *
     * @param orderNumber
     *            the ticket number
     * @param customer
     *            who ordered
     * @param item
     *            what they ordered
     * @param price
     *            the total cost
     */
    public Order(int orderNumber, String customer, String item, double price) {
        // TODO reject bad input like empty names or huge prices
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.item = item;
        this.price = price;
    }


    /**
     * Gets the ticket number.
     *
     * @return the order number
     */
    public int getOrderNumber() {
        return orderNumber;
    }


    /**
     * Gets the customer name.
     *
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }


    /**
     * Gets what was ordered.
     *
     * @return the item
     */
    public String getItem() {
        return item;
    }


    /**
     * Gets the cost.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }


    /**
     * Short line about the order.
     *
     * @return the order as a string
     */
    @Override
    public String toString() {
        // TODO
        return "";
    }
}
