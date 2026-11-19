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

public class ShopTest extends TestCase{
    private Shop shop1;
    
    /**
     * Sets up variables to use for tests.
     */
    @Before
    public void setUp() {
        shop1 = new Shop();
    }
    
    /**
     * Tests decideLine when the cafe is empty.
     */
    @Test
    public void testDecideLineCafeEmpty() {
        assertTrue(shop1.getCafeLine().isEmpty());
        shop1.decideLine();
        assertEquals(shop1.getCafeLine(), shop1.getCurrentLine());
    }
    
    /**
     * Tests decideLine when cafe isn't empty.
     */
    @Test
    public void testDecideLineCafeNotEmpty() {
        shop1.addOrder(true);
        shop1.addOrder(false);
        shop1.decideLine();
        assertEquals(shop1.getCafeLine(), shop1.getCurrentLine());
    }

    /**
     * Tests decideLine when mobile has more than 3 more orders than cafe.
     */
    @Test
    public void testDecideLineMobile3MoreOrders() {
        for(int i = 0; i < 4; i++) {
            shop1.addOrder(false);
        }
        shop1.addOrder(true);
        shop1.decideLine();
        assertEquals(shop1.getMobileLine(), shop1.getCurrentLine());
    }
    
    /**
     * Tests decideLine when mobile has a lot more orders than cafe.
     */
    @Test
    public void testDecideLineMobileMore() {
        for(int i = 0; i < 10; i++) {
            shop1.addOrder(false);
        }
        shop1.addOrder(true);
        shop1.decideLine();
        assertEquals(shop1.getMobileLine(), shop1.getCurrentLine());
    }

    /**
     * Tests addOrder when the currentLine is cafe.
     */
    @Test
    public void testAddOrderTrue() {
        assertTrue(shop1.getCafeLine().isEmpty());
        assertEquals(shop1.getCafeLine(), shop1.getCurrentLine());
        shop1.addOrder(true);
        assertEquals(1, shop1.getCafeLine().size());
    }

    /**
     * Tests addOrder when the currentLine is mobile.
     */
    @Test
    public void testAddOrderFalse() {
        for(int i = 0; i < 4; i++) {
            shop1.addOrder(false);
        }
        shop1.addOrder(true);
        shop1.decideLine();
        assertEquals(shop1.getMobileLine(), shop1.getCurrentLine());
        assertEquals(4, shop1.getMobileLine().size());
        shop1.addOrder(false);
        assertEquals(5, shop1.getMobileLine().size());
    }

    /**
     * Tests removeOrder when currentLine is mobile.
     */
    public void testRemoveOrderMobile() {
        List<String> updates = new ArrayList<String>();
        shop1.addObserver(recorder(updates));

     
        for (int i = 0; i < 4; i++){
            shop1.addOrder(false);
        }
        shop1.addOrder(true);
        int before = updatesSize();

        shop1.removeOrder;
     
        assertEquals(shop1.getMobileLine(), shop1.getCurrentLine());
        assertEquals(3, shop1.getMobileLine().size());
        assertEquals(1, shop1.getCafeLine().size());
        assertEquals(before + 1, updates.size());
    }
     
    /**
     * Tests removeOrder when currentLine mobile is empty.
     */
    public void testRemoveOrderMobileEmpty() {
        shop1.addOrder(true);
        shop1.addOrder(true);
        assertTrue(shop1.getMobileLine().isEmpty());

        shop1.removeOrder();

        assertEquals(shop1.getCafeLine(), shop1.getCurrentLine());
        assertEquals(1, shop1.getCafeLine().size());
        assertTrue(shop1.getMobileLine().isEmpty());
    }

    /**
     * Tests removeOrder when currentLine is cafe.
     */
    public void testRemoveOrderCafe() {
     
        shop1.addOrder(true);
        shop1.addOrder(true);
        shop1.addOrder(false);
        shop1.addOrder(false);
        int before = updates.size();

        shop1.removeOrder();

        assertEquals(shop1.getCafeLine(), shop1.getCurrentLine());
        assertEquals(1, shop1.getCafeLine().size());
        assertEquals(2, shop1.getMobileLine().size());
        assertEquals(before + 1, updates.size());
    }
 
    /**
     * Tests removeOrder when currentLine cafe is empty.
     */
    public void testRemoveOrderCafeEmpty() {
        shop1.addOrder(false);
        shop1.addOrder(false);
        assertTrue(shop1.getCafeLine().isEmpty());

        shop1.removeOrder();
        assertEquals(shop1.getMobileLine(), shop1.getCurrentLine());
        assertTrue(shop1.getCafeLine().isEmpty());
        assertEquals(1, shop1.getMobileLine().size());
       }
    }

    /**
     * Tests addObserver.
     */
    public void testAddObserver() {
        List<String> updates = new ArrayList<String>();
        shop1.addObserver(recorder(updates));

        shop1.addOrder(true);

        assertEquals(1, updates.size());
    }
    
    /**
     * Tests notifyObservers.
     */
    public void testNotifyObservers() {
        
   }
}
