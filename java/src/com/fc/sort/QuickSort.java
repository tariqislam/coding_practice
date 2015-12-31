package com.fc.sort;

import java.util.Random;

/**
 * Created by tislam on 12/29/15.
 */
public class QuickSort {

    protected int[] array;
    Random random;

    public QuickSort(int[] array) {
        this.array = array;
        random = new Random();
    }

    public int[] sort() {
        this.quickSort(0, array.length - 1);
        return this.array;
    }

    private void quickSort(int p, int r) {
        int q;
        if (p < r) {
            q = this.partition(p, r);
            this.quickSort(p, q);
            this.quickSort(q + 1, r);
        }
    }

    protected int partition(int p, int r) {
        int i, j, x, temp;

        x = this.array[p];
        i = p - 1;
        j = r + 1;

        while (true) {
            do {
                j = j - 1;
            }
            while (this.array[j] > x);
            do {
                i = i + 1;
            }
            while (this.array[i] < x);

            if (i < j) {
                temp = this.array[i];
                this.array[i] = this.array[j];
                this.array[j] = temp;
            }
            else {
                return j;
            }
        }

    }

}
