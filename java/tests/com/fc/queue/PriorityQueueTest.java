package com.fc.queue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tislam on 12/27/15.
 */
public class PriorityQueueTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMaximum() throws Exception {
        PriorityQueue pq = new PriorityQueue(new int[]{1, 2, 3, 4, 5, 6, 7});
        assertEquals(7, pq.maximum());
    }

    @Test
    public void testExtractMax() throws Exception {
        PriorityQueue pq = new PriorityQueue(new int[]{1, 2, 3, 4, 5, 6, 7});
        assertEquals(7, pq.extractMax());
        assertEquals(6, pq.extractMax());
        assertEquals(5, pq.extractMax());
        assertEquals(4, pq.extractMax());
        assertEquals(3, pq.extractMax());
        assertEquals(2, pq.extractMax());
        assertEquals(1, pq.extractMax());
    }

    @Test
    public void testInsert() throws Exception {
        PriorityQueue pq = new PriorityQueue(new int[]{1, 2, 3, 4, 5, 6, 7});
        pq.insert(8);
        assertEquals(8, pq.maximum());
        pq.insert(9);
        assertEquals(9, pq.maximum());
        assertEquals(9, pq.extractMax());
        assertEquals(8, pq.extractMax());
        assertEquals(7, pq.extractMax());
        assertEquals(6, pq.extractMax());
        pq.insert(10);
        assertEquals(10, pq.maximum());
        assertEquals(10, pq.extractMax());
        assertEquals(5, pq.extractMax());
        assertEquals(4, pq.maximum());
    }

}