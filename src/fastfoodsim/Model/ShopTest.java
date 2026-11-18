package fastfoodsim.Model;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Before;
import org.junit.jupiter.api.Test;
//import org.junit.*;

import student.TestCase;
 
/**
 * Tests for the Shop class. 
 */

public class ShopTest {
    private Shop shop1;
    private RecordingObserver observer
    
    /**
     * Sets up variables to use for tests.
     */
    public void setUp() {
        shop1 = new Shop();
        observer = new RecordingObserver();
        shop1.addObserver(observer);
    }
    
    /**
     * Tests decideLine when the cafe is empty.
     */
    public void testDecideLineCafeEmpty() {
        fill(0, 2);
        shop1.decideLine();
        assertRemoveServes(false);
    }
    
    /**
     * Tests decideLine when mobile has 3 more orders than cafe.
     */
    public void testDecideLineMobile3MoreOrders() {
        fill(1, 4);
        shop1.decideLine();
        assertRemoveServes(false);
    }

    /**
     * Tests decideLine when mobile has more than 3 more orders than cafe.
     */
    public void testDecideLineMobileTooManyOrders() {
        fill(1, 7);
        shop1.decideLine();
        assertRemoveServes(false);
    }

    /**
     * Tests decideLine when cafe has more orders than mobile.
     */
    public void testDecideLineCafeMoreOrders() {
        fill(4, 1);
        shop1.decideLine();
        assertRemoveServes(true);
    }

    /**
     * Tests addOrder when the currentLine is cafe.
     */
    public void testAddOrderTrue() {
        shop1.addOrder(true);
        assertNotNull(shop1);
    }

    /**
     * Tests addOrder when the currentLine is mobile.
     */
    public void testAddOrderFalse() {
        shop1.addOrder(false);
        assertNotNull(shop1);
    }

    /**
     * Tests removeOrder when currentLine is mobile.
     */
    public void testRemoveOrderMobile() {
        fill(1,4);
        int before = observer.count();
        assertRemoveServes(false);
        assertEquals(before + 1, observer.count());
    }

    /**
     * Tests removeOrder when currentLine mobile is empty.
     */
    public void testRemoveOrderMobileEmpty() {
        fill(2, 0);
        assertRemoveServes(true);
    }

    /**
     * Tests removeOrder when currentLine is cafe.
     */
    public void testRemoveOrderCafe() {
        fill(2, 2);
        int before = observer.count();
        assertRemoveServes(true);
        assertEquals(before + 1, observer.count());   
    }

    /**
     * Tests removeOrder when currentLine cafe is empty.
     */
    public void testRemoveOrderCafeEmpty() {
        fill(0, 2);
        assertRemoveServes(false);
    }

    /**
     * Tests addObserver.
     */
    public void testAddObserver() {
        RecordingObserver second = new RecordingObserver();
        shop1.addObserver(second);

        shop1.addOrder(true);

        assertEquals(1, observer.count());
        assertEquals(1, second.count());
    }

    /**
     * Tests notifyObservers.
     */
    public void testNotifyObservers() {
     RecordingObserver second = new RecordingObserver();
        shop1.addObserver(second);

        shop1.addOrder(false);

        String display = observer.last();
        assertTrue(display.startsWith("Cafe: "));
        assertTrue(display.contains(SEP));
        assertEquals(display, second.last());
    }
}
