package fastfood;

/**
 * Thrown when someone tries to take from an empty queue.
 *
 * @author Group 22
 * @version 2026.10.28
 */
public class EmptyQueueException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Makes the exception with a message.
     *
     * @param message
     *            what went wrong
     */
    public EmptyQueueException(String message) {
        super(message);
    }
}
