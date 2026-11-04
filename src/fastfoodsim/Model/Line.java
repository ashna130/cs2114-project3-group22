package fastfoodsim.Model;

//import doublylinkedlist.DLList;

/**
 *  This class handles the queue of orders using the inner Node class.
 *  @param <Order>
 * 
 *  @author ashna
 *  @version Nov 4, 2026
 */
public class Line<Order>
{
    /**
     *  The Node class creates the linked queue.
     *  @param <Order>
     * 
     *  @author ashna
     *  @version Nov 4, 2026
     */
    private static class Node<Order>
    {
        private Node<Order> next;
        private Order data;
        
        public Node(Order d) {
            data = d;
        }
        
        public void setNext(Node<Order> n) {
            next = n;
        }
        
        public Node<Order> getNext() {
            return next;
        }
        
        public Order getData() {
            return data;
        }
    }
    
    private Node<Order> head;
    private Node<Order> tail;
    private int size;
    
    /**
     * Constructor
     */
    public Line() {
        head = new Line.Node<Order>(null);
        tail = new Line.Node<>(null);
        head.setNext(tail);
        size = 0;
    }
    
    /**
     * Adds order to end of queue.
     * @param Order the order being added
     */
    public void enqueue(Order order) {
        //Node<Order> newNode = new Node(order);
        //tail = tail.setNext(newNode);
        size++;
    }
    
    /**
     * Removes order from front of the queue.
     * @return String order name
     */
    public String deque() {
        String orderName = (String)head.getData();
        head = head.getNext();
        size--;
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
}
