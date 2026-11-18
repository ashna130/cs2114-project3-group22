package fastfoodsim.Model;

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
    
    @Before
    public void setUp() {
        shop1 = new Shop();
    }
    
    /**
     * Tests decideLine when the cafe is empty.
     */
    @Test 
    public void testDecideLineCafeEmpty() {
        
    }
    
    /**
     * Tests decideLine when mobile has 3 more orders than cafe.
     */
    @Test 
    public void testDecideLineMobile3MoreOrders() {
        
    }

    /**
     * Tests decideLine when mobile has more than 3 more orders than cafe.
     */
    @Test 
    public void testDecideLineMobileTooManyOrders() {
        
    }

    /**
     * Tests decideLine when cafe has more orders than mobile.
     */
    @Test
    public void testDecideLineCafeMoreOrders() {

    }

    /**
     * Tests addOrder when the currentLine is cafe.
     */
    @Test 
    public void testAddOrderTrue() {

    }

    /**
     * Tests addOrder when the currentLine is not cafe.
     */
    @Test 
    public void testAddOrderFalse() {
        
    }

    /**
     * Tests removeOrder when currentLine is mobile.
     */
    @Test 
    public void testRemoveOrderMobile() {

    }

    /**
     * Tests removeOrder when currentLine mobile is empty.
     */
    @Test 
    public void testRemoveOrderMobileEmpty() {

    }

    /**
     * Tests removeOrder when currentLine is cafe.
     */
    @Test 
    public void testRemoveOrderCafe() {
        
    }

    /**
     * Tests removeOrder when currentLine cafe is empty.
     */
    @Test 
    public void testRemoveOrderCafeEmpty() {
        
    }

    /**
     * Tests addObserver.
     */
    @Test
    public void testAddObserver() {
        
    }

    /**
     * Tests notifyObservers.
     */
    @Test
    public void testNotifyObservers() {

    }
}
