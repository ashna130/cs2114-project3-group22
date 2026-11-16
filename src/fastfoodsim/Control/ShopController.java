package fastfoodsim.Control;

import fastfoodsim.Model.*;

/**
 *  This class handles the model-view boundary.
 * 
 *  @author Rin Hall
 *  @version Nov 16, 2026
 */
public class ShopController
{
    //~ Fields ................................................................
    private final Shop model;
    //~ Constructors ..........................................................
    public ShopController(Shop model) {
        this.model = model;
    }
    //~Public  Methods ........................................................
    
    /**
     * Adds order to back of the cafe line.
     */
    public void onCafeClicked(boolean locked) {
        if(!locked) {
            model.addOrder(true);
        }
    }    
    
    /**
     * Adds order to back of the mobile line.
     */
    public void onMobileClicked(boolean locked) {
        if(!locked) {
            model.addOrder(false);
        }
    }
    
    /**
     * Removes order from beginning of line.
     */
    public void onRemoveClicked(boolean locked) {
        if(!locked) {
            model.removeOrder();
        }
    }
}
