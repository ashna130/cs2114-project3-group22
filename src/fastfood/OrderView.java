package fastfood;

import java.util.Scanner;

/**
 * The view. Shows the menu and the line of orders.
 *
 * @author Group 22
 * @version 2026.10.28
 */
public class OrderView {

    private OrderTracker tracker;
    private Scanner input;

    /**
     * Makes the view.
     *
     * @param tracker
     *            the model to show
     * @param input
     *            where user input comes from
     */
    public OrderView(OrderTracker tracker, Scanner input) {
        this.tracker = tracker;
        this.input = input;
    }


    /**
     * Runs the menu until the user quits.
     */
    public void run() {
        // TODO loop: add random, show orders, complete, cancel, quit
    }
}
