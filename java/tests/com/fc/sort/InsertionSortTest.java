package com.fc.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tislam on 12/30/15.
 */
public class InsertionSortTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        int[] unsortedArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        InsertionSort is = new InsertionSort(unsortedArray);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, is.sort());

        unsortedArray = new int[]{7, 2, 4, 5, 1, 3, 6};
        is = new InsertionSort(unsortedArray);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, is.sort());
    }

}