package fastfood;

import student.TestCase;

/**
 * Tests for LinkedQueue.
 *
 * @author Group 22
 * @version 2026.10.28
 */
public class LinkedQueueTest extends TestCase {

    private LinkedQueue<String> queue;

    /**
     * Runs before each test.
     */
    public void setUp() {
        queue = new LinkedQueue<String>();
    }


    /**
     * Tests enqueue adds to the back.
     */
    public void testEnqueue() {
        queue.enqueue("a");
        queue.enqueue("b");
        assertEquals(2, queue.getSize());
        assertEquals("a", queue.getFront());

        Exception thrown = null;
        try {
            queue.enqueue(null);
        }
        catch (Exception e) {
            thrown = e;
        }
        assertTrue(thrown instanceof IllegalArgumentException);
    }


    /**
     * Tests dequeue takes from the front, first in first out.
     */
    public void testDequeue() {
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        assertEquals("a", queue.dequeue());
        assertEquals("b", queue.dequeue());
        assertEquals("c", queue.dequeue());
        assertTrue(queue.isEmpty());

        queue.enqueue("d");
        assertEquals("d", queue.getFront());
    }


    /**
     * Tests getFront does not remove.
     */
    public void testGetFront() {
        queue.enqueue("a");
        assertEquals("a", queue.getFront());
        assertEquals(1, queue.getSize());
    }


    /**
     * Tests isEmpty.
     */
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.enqueue("a");
        assertFalse(queue.isEmpty());
    }


    /**
     * Tests clear.
     */
    public void testClear() {
        queue.enqueue("a");
        queue.enqueue("b");
        queue.clear();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.getSize());
    }


    /**
     * Tests toString.
     */
    public void testToString() {
        assertEquals("[]", queue.toString());
        queue.enqueue("a");
        queue.enqueue("b");
        assertEquals("[a, b]", queue.toString());
    }


    /**
     * Tests empty queue throws.
     */
    public void testEmptyQueueThrows() {
        Exception thrown = null;
        try {
            queue.dequeue();
        }
        catch (Exception e) {
            thrown = e;
        }
        assertTrue(thrown instanceof EmptyQueueException);

        thrown = null;
        try {
            queue.getFront();
        }
        catch (Exception e) {
            thrown = e;
        }
        assertTrue(thrown instanceof EmptyQueueException);
    }
}
