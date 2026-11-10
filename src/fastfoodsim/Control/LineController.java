package fastfoodsim.Control;

import fastfoodsim.Model.Line;
import fastfoodsim.Model.Order;

/**
 *  This class handles the model-view boundary.
 * 
 *  @author ashna
 *  @version Nov 10, 2026
 */
public class LineController
{
    //~ Fields ................................................................
    private final Line<Order> model;
    //~ Constructors ..........................................................
    public LineController(Line<Order> model) {
        this.model = model;
    }
    //~Public  Methods ........................................................
    
    /**
     * Adds order to back of the line.
     */
    public void onAddClicked() {
        model.enqueue(new Order());
    }
    
    /**
     * Removes order from beginning of line.
     */
    public void onRemoveClicked() {
        model.deque();
    }
}
