package com.fc.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tislam on 12/30/15.
 */
public class RandomizedQuickSortTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        int[] unsortedArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        RandomizedQuickSort rqs = new RandomizedQuickSort(unsortedArray);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, rqs.sort());

        unsortedArray = new int[]{7, 2, 4, 5, 1, 3, 6};
        rqs = new RandomizedQuickSort(unsortedArray);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, rqs.sort());
    }

}