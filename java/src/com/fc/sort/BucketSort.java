package com.fc.sort;

import com.fc.linkedlist.ListElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tislam on 12/31/15.
 */
public class BucketSort extends Sort {

    private int[] array;
    private ArrayList<ListElement> arrayList;
    private ArrayList<int[]> sortedArrayList;
    private int min, max, bucketSize;

    public BucketSort(int[] array) {
        int n, range;
        int[] minMax;

        this.array = array;

        n = this.array.length;
        minMax = this.findMinAndMaxIntegerInArray(this.array);
        this.min = minMax[0];
        this.max = minMax[1];
        range = this.max - this.min + 1;
        this.bucketSize = (range + n - 1) / n;

    }

    public int[] sort() {
        this.bucketSort();
        return this.array;
    }

    private void bucketSort() {

        int i, index, num, replaceIndex;
        int[] sortedArray;

        this.arrayList = new ArrayList<ListElement>(bucketSize);

        for (i=0; i<this.array.length; i++) {
            num = this.array[i];
            index = this.hash(num);
            ListElement listElement = arrayList.get(index);
            if (listElement == null) {
                listElement = new ListElement(num);
            }
            else {
                listElement = listElement.insertInFront(num);
            }
            arrayList.set(index, listElement);
        }

        replaceIndex = 0;
        for (i=0; i<this.bucketSize; i++) {
            sortedArray = this.sortArrayListAtIndex(i);
            if (sortedArray != null) {
                for (int value: sortedArray) {
                    this.array[replaceIndex++] = value;
                }
            }
        }

    }

    private int[] sortArrayListAtIndex(int index) {
        int[] sortedArray = null;

        ArrayList<Integer> tempArrayList = new ArrayList<Integer>();
        ListElement listElement = this.arrayList.get(index);
        while (listElement != null) {
            tempArrayList.add((Integer) listElement.getData());
            listElement = listElement.next();
        }
        if (!tempArrayList.isEmpty()) {
            Integer[] array = tempArrayList.toArray(new Integer[]{});

            InsertionSort is = new InsertionSort(array);
            sortedArray = is.sort();

            this.arrayList.set(index, null);
        }
        return sortedArray;
    }

    private int hash(int i) {
        return (i - this.min) / this.bucketSize;
    }

}
