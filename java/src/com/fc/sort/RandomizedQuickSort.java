package com.fc.sort;

/**
 * Created by tislam on 12/30/15.
 */
public class RandomizedQuickSort extends QuickSort {

    public RandomizedQuickSort(int[] array) {
        super(array);
    }

    public int[] sort() {
        this.randomizedQuickSort(0, this.array.length - 1);
        return this.array;
    }

    private void randomizedQuickSort(int p, int r) {
        int q;
        if (p < r) {
            q = this.randomizedPartition(p, r);
            this.randomizedQuickSort(p, q);
            this.randomizedQuickSort(q + 1, r);
        }
    }

    public int randomizedPartition(int p, int r) {
        int i, temp;

        i = this.random.nextInt(r - p + 1) + p;
        temp = this.array[p];
        this.array[p] = this.array[i];
        this.array[i] = temp;

        return this.partition(p, r);
    }
}
