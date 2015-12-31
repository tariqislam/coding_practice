package com.fc.sort;

/**
 * Created by tislam on 12/30/15.
 */
public class InsertionSort {
    private int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    public int[] sort() {
        int i, j, key;

        if (this.array != null && this.array.length > 2) {
            for (j = 1; j < this.array.length; j++) {
                key = this.array[j];
                i = j - 1;
                while (i >= 0 && this.array[i] > key) {
                    this.array[i + 1] = this.array[i];
                    i--;
                }
                this.array[i + 1] = key;
            }
        }

        return this.array;
    }
}
