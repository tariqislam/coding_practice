package com.fc.queue;

import com.fc.heap.Heap;

/**
 * Created by tislam on 12/27/15.
 */
public class PriorityQueue {

    private Heap heap;

    public PriorityQueue() {
        this.heap = new Heap(new int[] {});
    }

    public PriorityQueue(int[] unorderedArray) {
        this.heap = new Heap(unorderedArray);
        this.heap.buildHeap();
    }

    public int extractMax() {
        return this.heap.extractMax();
    }

    public int maximum() {
        return this.heap.getMax();
    }

    public void insert(int value) {
        this.heap.insert(value);
    }
}
