import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
 
import org.junit.jupiter.api.Test;
 
/**
 * Tests for the Order model class. 
 */
public class OrderTest {
 
    // Order()
    @Test
    public void testNew() {
        Order order = new Order();
        assertNotNull(order.getName());
        assertFalse(order.getName().isEmpty());
        assertTrue(order.getPrice() > 0);
    }
 
    // Check multiple orders
    @Test
    public void testMany() {
        for (int i = 0; i < 1000; i++) {
            Order order = new Order();
            assertNotNull(order.getName());
            assertFalse(order.getName().isEmpty());
            assertTrue(order.getPrice() > 0);
        }
    }
 
    // getName()
    @Test
    public void testName() {
        Order order = new Order();
        assertFalse(order.getName().isEmpty());
    }
 
    @Test
    public void testNameSame() {
        Order order = new Order();
        assertEquals(order.getName(), order.getName());
    }
 
    // getPrice()
    @Test
    public void testPrice() {
        Order order = new Order();
        assertTrue(order.getPrice() > 0);
    }
 
    @Test
    public void testPriceSame() {
        Order order = new Order();
        assertEquals(order.getPrice(), order.getPrice(), 0.0);
    }
 
    @Test
    public void testPriceCents() {
        for (int i = 0; i < 100; i++) {
            double price = new Order().getPrice();
            assertEquals(price, Math.round(price * 100) / 100.0, 0.0001);
        }
    }
 
    // toString()
    @Test
    public void testString() {
        Order order = new Order();
        String text = order.toString();
        assertTrue(text.contains(order.getName()));
        assertTrue(text.contains(String.format("%.2f", order.getPrice())));
    }
}
 
