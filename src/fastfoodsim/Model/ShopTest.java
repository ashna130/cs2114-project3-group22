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
    
    /**
     * Sets up variables to use for tests.
     */
    public void setUp() {
        shop1 = new Shop();
    }
    
    /**
     * Tests decideLine when the cafe is empty.
     */
    public void testDecideLineCafeEmpty() {
        
    }
    
    /**
     * Tests decideLine when mobile has 3 more orders than cafe.
     */
    public void testDecideLineMobile3MoreOrders() {
        
    }

    /**
     * Tests decideLine when mobile has more than 3 more orders than cafe.
     */
    public void testDecideLineMobileTooManyOrders() {
        
    }

    /**
     * Tests decideLine when cafe has more orders than mobile.
     */
    public void testDecideLineCafeMoreOrders() {

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

    }

    /**
     * Tests removeOrder when currentLine mobile is empty.
     */
    public void testRemoveOrderMobileEmpty() {

    }

    /**
     * Tests removeOrder when currentLine is cafe.
     */
    public void testRemoveOrderCafe() {
        
    }

    /**
     * Tests removeOrder when currentLine cafe is empty.
     */
    public void testRemoveOrderCafeEmpty() {
        
    }

    /**
     * Tests addObserver.
     */
    public void testAddObserver() {
        
    }

    /**
     * Tests notifyObservers.
     */
    public void testNotifyObservers() {

    }
}
