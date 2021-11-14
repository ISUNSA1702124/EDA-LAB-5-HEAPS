import datastructures.Heap;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * DO NOT MODIFY THIS FILE without authorization
 */

class minComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}

class maxComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}

public class HeapTest {

    PriorityQueue<Integer> heap;

    //Min heaps tests
    @Test
    public void test_1_insert_max() {
        heap = new Heap<>();

        //define min heap
        try {
            ((Heap) heap).priorityOrder = 1;
        } catch (Exception e) {
            //just for tests
        }

        for (int i = 0; i < 100; i++) {
            heap.add(i);
            Assert.assertEquals((Integer) i, heap.peek());
        }
    }

    @Test
    public void test_2_remove_max() {
        heap = new Heap<>();

        //define min heap
        try {
            ((Heap) heap).priorityOrder = 1;
        } catch (Exception e) {
            //just for tests
        }

        for (int i = 0; i < 100; i++) {
            heap.add(i);
        }

        for (int i = 99; i > 0; i--) {
            heap.remove(i);
            Assert.assertEquals((Integer) (i - 1), heap.peek());
        }
    }

    //Min heaps tests
    @Test
    public void test_1_insert_min() {
        heap = new Heap<>();

        //define min heap
        try {
            ((Heap) heap).priorityOrder = 0;
        } catch (Exception e) {
            //just for tests
        }

        for (int i = 100; i >= 100; i--) {
            heap.add(i);
            Assert.assertEquals((Integer) i, heap.peek());
        }
    }

    @Test
    public void test_2_remove_min() {
        heap = new Heap<>();

        //define min heap
        try {
            ((Heap) heap).priorityOrder = 0;
        } catch (Exception e) {
            //just for tests
        }

        for (int i = 0; i < 100; i++) {
            heap.add(i);
        }

        for (int i = 0; i < 99; i++) {
            heap.remove(i);
            Assert.assertEquals((Integer) (i + 1), heap.peek());
        }
    }

}
