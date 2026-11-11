import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
 
import org.junit.jupiter.api.Test;

/**
 *  Tests methods in Line class.
 * 
 *  @author ashna
 *  @version Nov 11, 2026
 */
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
