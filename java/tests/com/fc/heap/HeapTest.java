package com.fc.heap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tislam on 12/27/15.
 */
public class HeapTest {

    private int[] unsortedArray;
    public Heap heap;

    @Before
    public void setUp() throws Exception {
        this.unsortedArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        this.heap = new Heap(this.unsortedArray);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetParent() throws Exception {
        assertEquals(0, this.heap.getParent(0));
        assertEquals(0, this.heap.getParent(1));
        assertEquals(0, this.heap.getParent(2));
        assertEquals(1, this.heap.getParent(3));
        assertEquals(1, this.heap.getParent(4));
        assertEquals(2, this.heap.getParent(5));
        assertEquals(4, this.heap.getParent(10));
    }

    @Test
    public void testGetLeftRightChild() throws Exception {
        assertEquals(1, this.heap.getLeftChild(0));
        assertEquals(2, this.heap.getRightChild(0));
        assertEquals(3, this.heap.getLeftChild(1));
        assertEquals(4, this.heap.getRightChild(1));

    }

    @Test
    public void testHeapify() throws Exception {
        this.heap.heapify(6);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, this.heap.getArray());
        this.setUp();
        this.heap.heapify(5);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, this.heap.getArray());
        this.setUp();
        this.heap.heapify(4);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, this.heap.getArray());
        this.setUp();
        this.heap.heapify(3);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, this.heap.getArray());
        this.setUp();
        this.heap.heapify(2);
        assertArrayEquals(new int[] {1, 2, 7, 4, 5, 6, 3}, this.heap.getArray());
        this.setUp();
        this.heap.heapify(1);
        assertArrayEquals(new int[] {1, 5, 3, 4, 2, 6, 7}, this.heap.getArray());
        this.setUp();
        this.heap.heapify(0);
        assertArrayEquals(new int[] {3, 2, 7, 4, 5, 6, 1}, this.heap.getArray());
    }

    @Test
    public void testBuildHeap() throws Exception {
        this.heap.buildHeap();
        assertArrayEquals(new int[] {7, 5, 6, 4, 2, 1, 3}, this.heap.getArray());
    }


}