import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
 
/**
 * Tests for the Line class. 
 */

public class LineTest {
    private Line<Order> line;
    private Order order1;
    private Order order2;

    @Before
    public void setUp() {
        order1 = new Order();
        order2 = new Order();
        line = new Line<Order>();
    }

    /**
     * Tests size when line is empty.
     */
    public void testSizeEmpty() {
        assertTrue(line.isEmpty());
        assertEquals(0, line.size());
    }

    /**
     * Tests size when line is not empty.
     */
    public void testSize() {
        line.enqueue(order1);
        assertEquals(1, line.size());
    }

    /**
     * Tests peek when line is empty.
     */
    @Test
    public void testPeekEmpty() {
        assertTrue(line.isEmpty());
        assertNull(line.peek());
    }

    /**
     * Tests peek.
     */
    public void testPeek() {
        line.enqueue(order1);
        assertEquals(order1, line.peek());
    }
    
    /**
     * Tests enqueue when line is empty.
     */
    @Test
    public void testEnqueueEmpty() {
        assertTrue(line.isEmpty());
        line.enqueue(order1);
        assertFalse(line.isEmpty());
        assertEquals(1, line.size());
        assertEquals(order1, line.peek());
    }

    /**
     * Tests enqueue when line is not empty.
     */
    @Test
    public void testEnqueue() {
        line.enqueue(order1);
        line.enqueue(order2);
        assertFalse(line.isEmpty());
        assertEquals(2, line.size());
        assertEquals(order1, line.peek());
    }

    /**
     * Tests deque.
     */
    @Test
    public void testDeque() {
        line.enqueue(order1);
        assertFalse(line.isEmpty());
        line.deque();
        assertTrue(line.isEmpty());
    }

    /**
     * Tests deque multiple times.
     */
    public void testDequeMultiple() {
        line.enqueue(order1);
        line.enqueue(order2);
        assertFalse(line.isEmpty());
        line.deque();
        assertEquals(order2, line.peek());
        assertEquals(1, line.size());
        line.deque();
        assertTrue(line.isEmpty());
    }

    /**
     * Tests addObserver
     */
    @Test
    public void testAddObserver() {
        assertEquals(0, observers.size());
        line.addObserver();
        assertEquals(1, observers.size());
    }
}
