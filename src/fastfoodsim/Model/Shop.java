package fastfoodsim.Model;

import fastfoodsim.View.Observer;
import java.util.ArrayList;
import java.util.List;

public class Shop
{
    private List<Observer> observers = new ArrayList<>();
    private Line<Order> cafe = new Line<Order>();
    private Line<Order> mobile = new Line<Order>();
    private Line<Order> currentLine = cafe;
    
    // ----------------------------------------------------------
    /**
     * Decides what line to use, updating currentLine accordingly
     * Will prioritize cafe until mobile has 3 more orders OR cafe is empty
     */
    public void decideLine() {
        if(cafe.size() + 3 <= mobile.size() || cafe.size() == 0) {
            currentLine = mobile;
        } else {
            currentLine = cafe;
        }
    }
    
    public void addOrder(boolean isCafe) {
        Line<Order> tempLine = cafe;
        if(!isCafe) {
            tempLine = mobile;
        }
        tempLine.enqueue(new Order());
        notifyObservers();
    }
    
    public void removeOrder() {
        decideLine();
        currentLine.deque();
        notifyObservers();
    }
    

    // ----------------------------------------------------------
    /**
     * Mutator for the observer field
     * @param o The observer to be added to the list of observers to update
     */
    public void addObserver(Observer o) {
        observers.add(o);
    }
    
    // ----------------------------------------------------------
    /**
     * @return The list of observers that the shop is storing
     */
    public List<Observer> getObservers() {
        return observers;
    }
    
    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @return the current line
     */
    public Line<Order> getCurrentLine() {
        return currentLine;
    }
    
    // ----------------------------------------------------------
    /**
     * @return the mobile order line
     */
    public Line<Order> getMobileLine() {
        return mobile;
    }
    
    // ----------------------------------------------------------
    /**
     * @return the cafe order line
     */
    public Line<Order> getCafeLine() {
        return cafe;
    }
    
    /**
     * Calls update for every observer
     */
    private void notifyObservers() {
        String display;
        display = "Cafe: " + cafe + "\n Mobile: " + mobile;
        for(Observer o : observers) {
            o.update(display);
        }
    }
    
}
