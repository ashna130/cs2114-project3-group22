package fastfood;

import java.util.Random;
import java.util.Scanner;

/**
 * Starts the fast food order simulator.
 *
 * @author Group 22
 * @version 2026.10.28
 */
public class ProjectRunner {

    /**
     * Main method.
     *
     * @param args
     *            not used
     */
    public static void main(String[] args) {
        OrderTracker tracker = new OrderTracker(new OrderMaker(new Random()));
        OrderView view = new OrderView(tracker, new Scanner(System.in));
        view.run();
    }
}
