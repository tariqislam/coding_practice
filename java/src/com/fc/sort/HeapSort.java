package com.fc.sort;

import com.fc.heap.Heap;
/**
 * Created by tislam on 12/27/15.
 */
public class HeapSort extends Sort {
    private Heap heap;

    public HeapSort(int[] array) {
        this.heap = new Heap(array);
        this.heap.buildHeap();

    }

    public int[] sort() {
        int i = this.heap.getMaxHeapIndex();
        while (i >= 1) {
            this.heap.exchangeNodes(0, i);
            this.heap.setMaxHeapIndex(this.heap.getMaxHeapIndex() - 1);
            this.heap.heapify(0);
            i--;
        }
        return this.heap.getArray();
    }
}
