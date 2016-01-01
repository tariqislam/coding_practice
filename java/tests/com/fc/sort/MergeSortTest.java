package com.fc.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tislam on 12/23/15.
 */
public class MergeSortTest {

    int[] unsortedArray = {5, 1, 4, 6, 3, 2, 5, 0};
    int[] sortedArray = {0, 1, 2, 3, 4, 5, 5, 6};

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSort() throws Exception {
        MergeSort ms = new MergeSort(this.unsortedArray);
        assertArrayEquals(this.sortedArray, ms.sort());

        int[] singleArray = {100};
        ms = new MergeSort(singleArray);
        assertArrayEquals(singleArray, ms.sort());

        int[] twoArray = {2, 1};
        int[] expectedTwoArray = {1, 2};
        ms = new MergeSort(twoArray);
        assertArrayEquals(expectedTwoArray, ms.sort());
    }

    @Test(expected=NullPointerException.class)
    public void testSortThrowsNPException() throws Exception {
        MergeSort ms = new MergeSort(null);
        ms.sort();
    }

}
