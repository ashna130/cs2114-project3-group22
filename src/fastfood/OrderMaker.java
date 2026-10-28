package fastfood;

import java.util.Random;

/**
 * Makes random orders.
 *
 * @author Group 22
 * @version 2026.10.28
 */
public class OrderMaker {

    private Random random;
    private int nextNumber;

    /**
     * Makes an order maker.
     *
     * @param random
     *            random generator, pass a seeded one for tests
     */
    public OrderMaker(Random random) {
        this.random = random;
        this.nextNumber = 1;
    }


    /**
     * Makes one random order.
     *
     * @return a new order
     */
    public Order makeOrder() {
        // TODO
        return null;
    }
}
