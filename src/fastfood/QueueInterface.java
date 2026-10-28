package fastfood;

/**
 * Basic queue that works first in, first out.
 *
 * @param <T>
 *            type of item in the queue
 * @author Group 22
 * @version 2026.10.28
 */
public interface QueueInterface<T> {

    /**
     * Adds an item to the back.
     *
     * @param item
     *            the item to add
     */
    void enqueue(T item);


    /**
     * Removes and returns the front item.
     *
     * @return the front item
     */
    T dequeue();


    /**
     * Looks at the front item without removing it.
     *
     * @return the front item
     */
    T getFront();


    /**
     * Checks if the queue has no items.
     *
     * @return true if empty
     */
    boolean isEmpty();


    /**
     * Gets how many items are in the queue.
     *
     * @return the size
     */
    int getSize();


    /**
     * Removes every item.
     */
    void clear();
}
