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
    @Test
    public void testSizeEmpty() {
        assertTrue(line.isEmpty());
        assertEquals(0, line.size());
    }

    /**
     * Tests size when line is not empty.
     */
    @Test
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
        line.enqueue(order1);
        line.deque();
        assertNull(line.peek());
    }

    /**
     * Tests peek.
     */
    @Test
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
        assertEquals(order1.getData(), line.deque());
        assertTrue(line.isEmpty());
    }

    /**
     * Tests deque multiple times.
     */
    @Test
    public void testDequeMultiple() {
        line.enqueue(order1);
        line.enqueue(order2);
        assertFalse(line.isEmpty());
        assertEquals(order1.getData(), line.deque());
        assertEquals(order2, line.peek());
        assertEquals(1, line.size());
        assertEquals(order2.getData(), line.deque());
        assertEquals(0, line.size());
        assertTrue(line.isEmpty());
    }

    /**
     * Tests deque when empty.
     */
    @Test
    public void testDequeEmpty() {
        assertTrue(line.isEmpty());
        assertEquals("Empty Line", line.deque());
        assertTrue(line.isEmpty());
    }

    /**
     * Tests enqueues and deques following each other.
     */
    @Test
    public void testEnqueueDeque() {
        assertTrue(line.isEmpty());
        line.enqueue(order1);
        line.enqueue(order2);
        assertEquals(2, line.size());
        assertEquals(order1.getData(), line.peek());
        assertEquals(order1.getData(), line.deque());
        assertEquals(1, line.size());
        line.enqueue(order1);
        assertEquals(2, line.size());
        assertEquals(order2.getData(), line.peek());
        assertEquals(order2.getData(), line.deque());
        assertEquals(1, line.size());
        assertEquals(order1.getData(), line.deque());
        assertEquals(0, line.size());
        assertTrue(line.isEmpty());
        line.enqueue(order1);
        assertEquals(1, line.size());
    }

    /**
     * Test toString when line is empty.
     */
    @Test
    public void testToStringEmpty() {
        assertTrue(line.isEmpty());
        assertEquals("Empty Line", line.toString());
    }

    /**
     * Test toString.
     */
    @Test
    public void testToString() {
        line.enqueue(order1);
        line.enqueue(order2);
        assertFalse(line.isEmpty());
        assertEquals(order1.getData(), line.toString());
        line.deque();
        assertEquals(order2.getData(), line.toString());
    }
}
