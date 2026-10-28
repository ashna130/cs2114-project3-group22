package fastfood;

/**
 * Queue built from linked nodes.
 * New items go on the back, items leave from the front.
 *
 * @param <T>
 *            type of item in the queue
 * @author Group 22
 * @version 2026.10.28
 */
public class LinkedQueue<T> implements QueueInterface<T> {

    private Node<T> front;
    private Node<T> back;
    private int size;

    /**
     * Makes an empty queue.
     */
    public LinkedQueue() {
        front = null;
        back = null;
        size = 0;
    }


    @Override
    public void enqueue(T item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        Node<T> newNode = new Node<T>(item);
        if (isEmpty()) {
            front = newNode;
        }
        else {
            back.next = newNode;
        }
        back = newNode;
        size++;
    }


    @Override
    public T dequeue() {
        T item = getFront();
        front = front.next;
        size--;
        if (front == null) {
            back = null;
        }
        return item;
    }


    @Override
    public T getFront() {
        if (isEmpty()) {
            throw new EmptyQueueException("The queue is empty");
        }
        return front.data;
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public int getSize() {
        return size;
    }


    @Override
    public void clear() {
        front = null;
        back = null;
        size = 0;
    }


    /**
     * Shows the items front to back.
     *
     * @return the queue as a string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        Node<T> current = front;
        while (current != null) {
            builder.append(current.data);
            if (current.next != null) {
                builder.append(", ");
            }
            current = current.next;
        }
        builder.append("]");
        return builder.toString();
    }


    /**
     * One spot in the queue that holds an item
     * and points to the next spot.
     *
     * @param <E>
     *            type of item held
     */
    private static class Node<E> {
        private E data;
        private Node<E> next;

        /**
         * Makes a node holding the item.
         *
         * @param data
         *            the item
         */
        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}
