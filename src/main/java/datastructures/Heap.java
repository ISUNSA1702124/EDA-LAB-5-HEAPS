package datastructures;

import java.util.PriorityQueue;

public class Heap<E extends Comparable<? super E>> extends PriorityQueue<E> {

    /**
     * Defines the priority order of the heap
     * 0 - minHeap
     * 1 - maxHeap
     */
    public int priorityOrder = 0;

    /**
     * Inserts the specified element into this priority queue.
     *
     * @param e the element to add
     * @return true (as specified by #Collection.add(E))
     * @throws NullPointerException - if the specified element is null
     */
    @Override
    public boolean add(E e) {
        //TODO implement here!
        return false;
    }

    /**
     * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
     *
     * @return the head of this queue, or null if this queue is empty
     */
    @Override
    public E peek() {
        //TODO implement here!
        return null;
    }

    /**
     * Removes a single instance of the specified element from this queue, if it is present.
     * More formally, removes an element e such that o.equals(e), if this queue contains one or more such elements.
     * <p>
     * Returns true if and only if this queue contained the specified
     * element (or equivalently, if this queue changed as a result of the call).
     *
     * @param o element to be removed from this queue, if present
     * @return true if this heap changed as a result of the call
     */
    @Override
    public boolean remove(Object o) {
        //TODO implement here!
        return false;
    }

    /**
     * Returns true if this queue contains the specified element. More formally,
     * returns true if and only if this queue contains at least one element e such that o.equals(e).
     *
     * @param o object to be checked for containment in this queue
     * @return true if this queue contains the specified element
     */
    @Override
    public boolean contains(Object o) {
        //TODO implement here!
        return false;
    }

    /**
     * Returns the number of elements in this collection.
     * If this collection contains more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
     *
     * @return the number of elements in this collection
     */
    @Override
    public int size() {
        //TODO implement here!
        return -1;
    }

    /**
     * Removes all of the elements from this priority queue.
     * The queue will be empty after this call returns.
     */
    @Override
    public void clear() {
        //TODO implement here!
    }

    /**
     * Retrieves and removes the head of this queue,
     * or returns null if this queue is empty.
     *
     * @return the head of this queue, or null if this queue is empty
     */
    @Override
    public E poll() {
        //TODO implement here!
        return null;
    }
}
