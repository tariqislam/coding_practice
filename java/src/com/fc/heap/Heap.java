package com.fc.heap;

/**
 * Created by tislam on 12/27/15.
 */
public class Heap {

    private int[] heapArray;
    private int maxHeapIndex;

    public Heap(int[] array) {
        this.heapArray = array;
        this.maxHeapIndex = this.heapArray.length - 1;
    }

    public int[] getArray() {
        return this.heapArray;
    }

    public int getMaxHeapIndex() {
        return this.maxHeapIndex;
    }

    public void setMaxHeapIndex(int index) {
        this.maxHeapIndex = index;
    }

    public void exchangeNodes(int i, int j) {
        if (i < 0 || j < 0 || i > this.maxHeapIndex || j > this.maxHeapIndex) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + i + ", " + j);
        }
        int temp = this.heapArray[i];
        this.heapArray[i] = this.heapArray[j];
        this.heapArray[j] = temp;
    }

    public int getParent(int childNode) throws IndexOutOfBoundsException {
        childNode++; // for arithmetic purposes, assuming index of array starts at 1
        int parent;
        if (childNode < 1) {
            throw new IndexOutOfBoundsException("Given a negative-index node.");
        }
        if (childNode == 1) {
            parent = 1;
        }
        else {
            parent = (int) Math.floorDiv(childNode, 2);
        }
        return parent - 1;
    }

    public int getLeftChild(int parentNode) {
        parentNode++; // for arithmetic purposes, assuming index of array starts at 1
        if (parentNode < 1) {
            throw new IndexOutOfBoundsException("Given a negative-index node.");
        }
        return (parentNode << 1) - 1;
    }

    public int getRightChild(int parentNode) {
        parentNode++; // for arithmetic purposes, assuming index of array starts at 1
        if (parentNode < 1) {
            throw new IndexOutOfBoundsException("Given a negative-index node.");
        }
        return ((parentNode << 1) | 1) - 1;
    }

    public void heapify(int node) throws IndexOutOfBoundsException {
        int largestNode, leftChild, rightChild, nodeValue;
        leftChild = this.getLeftChild(node);
        rightChild = this.getRightChild(node);

        if (leftChild <= this.maxHeapIndex && this.heapArray[leftChild] > this.heapArray[node]) {
            largestNode = leftChild;
        }
        else {
            largestNode = node;
        }

        if (rightChild <= this.maxHeapIndex && this.heapArray[rightChild] > this.heapArray[largestNode]) {
            largestNode = rightChild;
        }

        if (largestNode != node) {
            nodeValue = this.heapArray[node];
            this.heapArray[node] = this.heapArray[largestNode];
            this.heapArray[largestNode] = nodeValue;
            this.heapify(largestNode);
        }
    }

    public void buildHeap() {
        int i = Math.floorDiv(this.maxHeapIndex - 1, 2);
        while (i >= 0) {
            this.heapify(i);
            i--;
        }
    }

    public int getMax() throws NullPointerException {
        if (this.maxHeapIndex < 0) {
            throw new NullPointerException("No max on a null heap.");
        }
        return this.heapArray[0];

    }

    public int extractMax() {
        int max;
        if (this.maxHeapIndex < 0) {
            throw new NullPointerException("No max on a null heap.");
        }
        max = this.heapArray[0];
        this.exchangeNodes(0, this.maxHeapIndex);
        this.maxHeapIndex--;
        this.heapify(0);
        return max;
    }

    public void insert(int key) {
        // null or empty array
        if (this.heapArray == null || this.heapArray.length == 0) {
            this.heapArray = new int[1];
            this.maxHeapIndex = 0;
        }
        // space available in array
        else if (this.maxHeapIndex < (this.heapArray.length - 1)) {
            this.maxHeapIndex++;
        }
        // need to expand array
        else {
            int[] tempArray = new int[this.heapArray.length + 1];
            this.maxHeapIndex = tempArray.length - 1;
            System.arraycopy(this.heapArray, 0, tempArray, 0, this.heapArray.length);
            this.heapArray = tempArray;
        }

        int i = this.maxHeapIndex;
        while (i > 0 && this.heapArray[this.getParent(i)] < key) {
            this.heapArray[i] = this.heapArray[this.getParent(i)];
            i = this.getParent(i);
        }
        this.heapArray[i] = key;
    }


}
