package com.fc.sort;

/**
 * Created by tislam on 12/30/15.
 */
public class CountingSort extends Sort {

    private int[] array;

    public CountingSort(int[] array) {
        if (array == null || array.length == 0) {
            throw new NullPointerException("Array cannot be null or empty.");
        }
        this.array = array;
    }

    public int[] sort() {
        int max;

        max = this.findMaxIntegerInArray(this.array);

        this.countingSort(max);
        return this.array;
    }

    private void countingSort(int maxInteger) {
        int[] B = new int[this.array.length];
        int[] C = new int[maxInteger + 1]; // extra for 0
        int i;

        for (i=0; i<C.length; i++) {
            C[i] = 0;
        }

        for (i=0; i<this.array.length; i++) {
            C[this.array[i]]++;
        }

        for (i=1; i<C.length; i++) {
            C[i] += C[i-1];
        }

        for (i=this.array.length - 1; i>=0; i--) {
            B[C[this.array[i]] - 1] = this.array[i]; // -1 since array index starts at 0
            C[this.array[i]]--;
        }

        this.array = B;
    }

}
