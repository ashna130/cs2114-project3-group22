package fastfoodsim.View;

import javax.swing.*;
import fastfoodsim.Control.ShopController;
import java.awt.*;

// -------------------------------------------------------------------------
/**
 *  The view for the window that the user will operate to control the line
 * 
 *  @author Rin Hall
 *  @version Nov 4, 2026
 */
public class WindowView extends JFrame implements Observer {
    /*
     * buttonRemove, to remove an order from the front of the queue
        buttonAdd, to add a random order to the back of the queue
        cooldownTime, which is the number of updates to wait between button presses
        timer, which tracks how long is has been since the previous button press
        currentOrder, to display the first order in queue
        numberOfOrders, to display the amount of orders in queue
        title, to display the title of the program
     */
    
    private JButton buttonRemove;
    private JButton buttonInPersonOrder;
    private JButton buttonMobileOrder;
    private final int cooldownTime = 100;   //Measured in milliseconds
    private Timer timer;
    private boolean inputLock = true;
    private JLabel currentOrder;
    private JLabel numberOfOrders;
    private JLabel title;
    
    // ----------------------------------------------------------
    /**
     * Create a new WindowView object.
     * @param controller
     */
    public WindowView(ShopController controller) {
        Font titleFont = new Font("Arial", Font.BOLD, 24);
        Font orderFont = titleFont.deriveFont((float) 20);
        
        setTitle("Fast Food Queue");
        setSize(1080, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        Color backgroundColor = new Color(37, 86, 46);
        Color textColor = new Color(77, 43, 50);
        Color buttonColor = new Color(25, 51, 45);
        Color buttonText = new Color(122, 72, 65);
        getContentPane().setBackground(backgroundColor);
        
        title = new JLabel("Fast Food Queue", SwingConstants.RIGHT);
        title.setFont(titleFont);
        title.setForeground(textColor);
        
        numberOfOrders = new JLabel("0", SwingConstants.NORTH_EAST);
        numberOfOrders.setFont(orderFont);
        numberOfOrders.setForeground(textColor);
        
        currentOrder = new JLabel("Order: Line is empty!", SwingConstants.CENTER);
        currentOrder.setFont(orderFont);
        currentOrder.setForeground(textColor);
        
        timer = new Timer(cooldownTime, e -> timerEnd());
        timer.setRepeats(false);
        timer.start();
        
        buttonInPersonOrder = new JButton("New Order");
        buttonInPersonOrder.addActionListener(e -> controller.onCafeClicked(inputLock));
        buttonInPersonOrder.setBackground(buttonColor);
        buttonInPersonOrder.setForeground(buttonText);
        
        buttonMobileOrder = new JButton("Mobile Order");
        buttonMobileOrder.addActionListener(e -> controller.onMobileClicked(inputLock));
        buttonMobileOrder.setBackground(buttonColor);
        buttonMobileOrder.setForeground(buttonText);
        
        buttonRemove = new JButton("Remove Order");
        buttonRemove.addActionListener(e -> controller.onRemoveClicked(inputLock));
        buttonRemove.setBackground(buttonColor);
        buttonRemove.setForeground(buttonText);
        
        add(numberOfOrders, BorderLayout.NORTH);
        add(currentOrder, BorderLayout.CENTER);
        add(buttonInPersonOrder, BorderLayout.EAST);
        add(buttonMobileOrder, BorderLayout.WEST);
        add(buttonRemove, BorderLayout.SOUTH);
        add(title, BorderLayout.NORTH);
        setVisible(true);
    }
    
    // ----------------------------------------------------------
    /**
     * What happens when the timer runs out. 
     * The inputLock is set to false, allowing the controller to use inputs
     */
    public void timerEnd() {
        inputLock = false;
    }
    
    @Override
    public void update(String display) {
        currentOrder.setText(display);
        //todo
        timer.restart();
        inputLock = true;
    }
}
