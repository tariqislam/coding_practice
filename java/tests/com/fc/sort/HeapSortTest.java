package com.fc.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tislam on 12/27/15.
 */
public class HeapSortTest {
    private int[] unsortedArray;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSort() throws Exception {
        int[] unsortedArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        HeapSort hs = new HeapSort(unsortedArray);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, hs.sort());

        unsortedArray = new int[]{7, 2, 4, 5, 1, 3, 6};
        hs = new HeapSort(unsortedArray);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, hs.sort());
    }


}
