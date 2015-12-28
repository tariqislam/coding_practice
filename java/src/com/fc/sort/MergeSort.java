package com.fc.sort;

/**
 * Created by tislam on 12/23/15.
 */
public class MergeSort {

    private int[] array;

    public MergeSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return this.array;
    }

    public void sort() {
        if (this.array == null) {
            throw new NullPointerException("Array is null.");
        }
        else if (array.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Cannot sort an empty array.");
        }

        this.mergeSort(0, array.length - 1);
    }

    private void mergeSort(int start, int end) {
        int middle;

        if (start < end) {
            middle = (int) Math.floor((start + end) / 2);

            mergeSort(start, middle);
            mergeSort(middle + 1, end);
            merge(start, middle, end);
        }
    }

    private void merge(int start, int middle, int end) {
        int[] mergedArray = new int[end - (start - 1)];

        int i = start;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= end) {
            if (this.array[i] < this.array[j]) {
                mergedArray[k++] = this.array[i++];
            }
            else if (this.array[i] > this.array[j]) {
                mergedArray[k++] = this.array[j++];
            }
            else {
                mergedArray[k++] = this.array[i++];
                mergedArray[k++] = this.array[j++];
            }
        }

        while (i <= middle) {
            mergedArray[k++] = this.array[i++];
        }
        while (j <= end) {
            mergedArray[k++] = this.array[j++];
        }

        for (i=0; i<mergedArray.length; i++) {
            this.array[start++] = mergedArray[i];
        }
    }
}
