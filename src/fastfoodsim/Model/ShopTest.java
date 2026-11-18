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

//    /**
//     * Tests removeOrder when currentLine is mobile.
//     */
//    public void testRemoveOrderMobile() {
//        fill(1,4);
//        int before = observer.count();
//        assertRemoveServes(false);
//        assertEquals(before + 1, observer.count());
//    }
//
//    /**
//     * Tests removeOrder when currentLine mobile is empty.
//     */
//    public void testRemoveOrderMobileEmpty() {
//        fill(2, 0);
//        assertRemoveServes(true);
//    }
//
//    /**
//     * Tests removeOrder when currentLine is cafe.
//     */
//    public void testRemoveOrderCafe() {
//        fill(2, 2);
//        int before = observer.count();
//        assertRemoveServes(true);
//        assertEquals(before + 1, observer.count());   
//    }
//
//    /**
//     * Tests removeOrder when currentLine cafe is empty.
//     */
//    public void testRemoveOrderCafeEmpty() {
//        fill(0, 2);
//        assertRemoveServes(false);
//    }
//
//    /**
//     * Tests addObserver.
//     */
//    public void testAddObserver() {
//        RecordingObserver second = new RecordingObserver();
//        shop1.addObserver(second);
//
//        shop1.addOrder(true);
//
//        assertEquals(1, observer.count());
//        assertEquals(1, second.count());
//    }
//
//    /**
//     * Tests notifyObservers.
//     */
//    public void testNotifyObservers() {
//     RecordingObserver second = new RecordingObserver();
//        shop1.addObserver(second);
//
//        shop1.addOrder(false);
//
//        String display = observer.last();
//        assertTrue(display.startsWith("Cafe: "));
//        assertTrue(display.contains(SEP));
//        assertEquals(display, second.last());
//    }
}
