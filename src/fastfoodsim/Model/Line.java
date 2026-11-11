package fastfoodsim.Model;

import fastfoodsim.View.Observer;
import java.util.ArrayList;
import java.util.List;

//import doublylinkedlist.DLList;

/**
 *  This class handles the queue of orders using the inner Node class.
 *  @param <T>
 * 
 *  @author ashna
 *  @version Nov 4, 2026
 */
public class Line<T>
{
    /**
     *  The Node class creates the linked queue.
     *  @param <Order>
     * 
     *  @author ashna
     *  @version Nov 4, 2026
     */
    private static class Node<T>
    {
        private Node<T> next;
        private Order data;
        
        public Node(Order d) {
            data = d;
        }
        
        public void setNext(Node<T> n) {
            next = n;
        }
        
        public Node<T> getNext() {
            return next;
        }
        
        public Order getData() {
            return data;
        }
    }
    
    private Node<Order> head;
    private Node<Order> tail;
    private int size;
    
    private List<Observer> observers = new ArrayList<>();
    
    /**
     * Constructor
     */
    public Line() {
        //Order firstOrder = new Order();
        head = new Line.Node<Order>(null);
        tail = head;
        head.setNext(tail);
        size = 0;
    }
    
    /**
     * Adds order to end of queue.
     * @param order the order being added
     */
    public void enqueue(Order order) {
        Node<Order> newNode = new Node<Order>(order);
        tail.setNext(newNode);
        tail = newNode;
        if(size == 0) {
            head = tail;
        }
        size++;
        notifyObservers();
    }
    
    /**
     * Removes order from front of the queue.
     * @return String order name
     */
    public String deque() {
        String orderName = head.getData().toString();
        head = head.getNext();
        size--;
        notifyObservers();
        return orderName;
    }
    
    /**
     * Returns the order at the front of the queue.
     * @return Order first order in line
     */
    public Order peek() {
        return head.getData();
    }
    
    /**
     * Returns true if queue is empty, else false.
     * @return boolean if queue is empty or not
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    
    // ----------------------------------------------------------
    /**
     * Mutator for the observer field
     * @param o The observer to be added to the list of observers to update
     */
    public void addObserver(Observer o) {
        observers.add(o);
    }
    
    /**
     * Calls update for every observer
     */
    private void notifyObservers() {
        String display;
        if(size == 0) {
            display = "Line is empty!";
            System.out.println(display);
        } else {
            display = peek().toString();
            //display = "Peeking";
        }
        for(Observer o : observers) {
            o.update(display, size);
        }
    }
}
