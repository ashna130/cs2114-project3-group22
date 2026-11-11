import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LineTest
{
    private Line<Order> line1;
    private Order order1;
    private Order order2;
    
    @Before
    public void setUp()
    {
        order1 = new Order();
        order2 = new Order();
        line1 = new Line<Order>();
    }
    
    /**
     * Tests enqueue when line is empty.
     */
    @Test
    public void testEnqueueEmpty()
    {
        line1.enqueue(order1);
        assertFalse(line1.isEmpty());
    }

}
