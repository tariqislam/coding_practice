package com.fc.sort;

/**
 * Created by tislam on 12/31/15.
 */
public class RadixSort extends Sort {

    private int[] array;

    public RadixSort(int[] array) {
        this.array = array;
    }

    public int[] sort() {
        this.radixSort();
        return this.array;
    }

    private void radixSort() {

        int maxNumDigits, maxInt, i;

        maxInt = this.findMaxIntegerInArray(this.array);
        maxNumDigits = String.valueOf(maxInt).length();

        for (i = 1; i<=maxNumDigits; i++) {
            this.array = this.countingSort(i);
        }
    }

    private int[] countingSort(int digit) {
        int[] B = new int[this.array.length];
        int[] C = new int[10]; // assume digits from 0..9
        int i, val;

        for (i=0; i<C.length; i++) {
            C[i] = 0;
        }

        for (i=0; i<this.array.length; i++) {
            val = this.getNthDigit(this.array[i], 10, digit);
            C[val]++;
        }

        for (i=1; i<C.length; i++) {
            C[i] += C[i-1];
        }

        for (i=this.array.length - 1; i>=0; i--) {
            val = this.getNthDigit(this.array[i], 10, digit);
            B[C[val] - 1] = this.array[i]; // -1 since array index starts at 0
            C[val]--;
        }

        return B;
    }

    private int getNthDigit(int num, int base, int n) {
        return (int) ((num / Math.pow(base, n - 1)) % base);
    }
}
