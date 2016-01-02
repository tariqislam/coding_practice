package com.fc.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tislam on 12/31/15.
 */
public class RadixSortTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        int[] unsortedArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        RadixSort rs = new RadixSort(unsortedArray);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, rs.sort());

        unsortedArray = new int[]{7, 2, 4, 5, 1, 3, 6};
        rs = new RadixSort(unsortedArray);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, rs.sort());

        unsortedArray = new int[]{9, 8, 99, 98, 199, 198, 9000, 1000};
        rs = new RadixSort(unsortedArray);
        assertArrayEquals(new int[] {8, 9, 98, 99, 198, 199, 1000, 9000}, rs.sort());
    }

}