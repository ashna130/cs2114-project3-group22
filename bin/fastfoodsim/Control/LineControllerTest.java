import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
 
/**
 * Tests for the LineController class. 
 */

public class LineControllerTest {
    private LineController controller;
    private Line<Order> line;

    @Before
    public void setUp() {
        line = new Line<Order>();
        controller = new LineController(line);
    }

    /**
     * Tests addOnClicked when locked is false.
     */
    @Test
    public void testAddOnClickedUnlocked() {
        assertTrue(line.isEmpty());
        controller.addOnClicked(false);
        assertFalse(line.isEmpty());
    }

    /**
     * Tests addOnClicked when locked is true.
     */
    @Test
    public void testAddOnClickedLocked() {
        assertTrue(line.isEmpty());
        controller.addOnClicked(true);
        assertTrue(line.isEmpty());
    }

    /**
     * Tests removeOnClicked when locked is false.
     */
    @Test
    public void testRemoveOnClickedUnlocked() {
        line.enqueue(new Order());
        assertFalse(line.isEmpty());
        controller.removeOnClicked(false);
        assertTrue(line.isEmpty());
    }

    /**
     * Tests removeOnClicked when locked is true.
     */
    @Test
    public void testRemoveOnClickedLocked() {
        line.enqueue(new Order());
        assertFalse(line.isEmpty());
        controller.removeOnClicked(true);
        assertFalse(line.isEmpty());
    }
}
