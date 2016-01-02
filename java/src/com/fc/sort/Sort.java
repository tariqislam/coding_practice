package com.fc.sort;

/**
 * Created by tislam on 12/31/15.
 */
public abstract class Sort {

    public abstract int[] sort();

    public int findMaxIntegerInArray(int[] array) {
        int max, i;

        max = array[0];
        for (i=1; i<array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int[] findMinAndMaxIntegerInArray(int[] array) {
        int[] minMax = new int[2];
        int min, max, i, j, tempMin, tempMax;

        if (array.length < 0) {
            throw new NullPointerException("Array cannot be null.");
        }

        min = max = array[0];
        i = 1;

        while (i < array.length) {
            j = (i + 1 == array.length) ? i : i + 1;

            if (array[i] > array[j]) {
                tempMax = array[i];
                tempMin = array[j];
            }
            else {
                tempMax = array[j];
                tempMin = array[i];
            }
            if (min > tempMin) {
                min = tempMin;
            }
            if (max < tempMax) {
                max = tempMax;
            }
            i += 2;
        }

        minMax[0] = min;
        minMax[1] = max;

        return minMax;
    }

}
