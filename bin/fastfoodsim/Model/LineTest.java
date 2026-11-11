import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
 
import org.junit.jupiter.api.Test;
 
/**
 * Tests for the Line class. 
 */

public class LineTest {
    private Line<Order> line1;
    private Order order1;
    private Order order2;

    @Before
    public void setUp() {
        order1 = new Order();
        order2 = new Order();
        line1 = new Line<Order>();
    }

    /**
     * Tests enqueue when line is empty.
     */
    @Test
    public void testEnqueueEmpty() {
        line1.enqueue(order1);
        assertFalse(line1.isEmpty());
        assertEquals(1, line1.size());
        assertEquals(order1.getName(), line1.peek());
    }
}
