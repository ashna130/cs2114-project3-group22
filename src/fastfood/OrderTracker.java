package fastfood;

/**
 * The model. Keeps the line of orders.
 *
 * @author Group 22
 * @version 2026.10.28
 */
public class OrderTracker {

    private QueueInterface<Order> orders;
    private OrderMaker maker;

    /**
     * Makes a tracker with an empty line.
     *
     * @param maker
     *            where random orders come from
     */
    public OrderTracker(OrderMaker maker) {
        this.orders = new LinkedQueue<Order>();
        this.maker = maker;
    }


    /**
     * Adds some random orders to the back of the line.
     *
     * @param count
     *            how many to add
     */
    public void addRandomOrders(int count) {
        // TODO
    }


    /**
     * Front customer got their food and leaves the line.
     *
     * @return the finished order
     */
    public Order completeNext() {
        // TODO
        return null;
    }


    /**
     * Front customer cancelled and leaves the line.
     *
     * @return the cancelled order
     */
    public Order cancelNext() {
        // TODO
        return null;
    }


    /**
     * Gets the order being made now.
     *
     * @return the front order
     */
    public Order getCurrentOrder() {
        // TODO
        return null;
    }
}
