package com.fc.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tislam on 12/30/15.
 */
public class CountingSortTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        int[] unsortedArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        CountingSort cs = new CountingSort(unsortedArray);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, cs.sort());

        unsortedArray = new int[]{7, 2, 4, 5, 1, 3, 6, 0};
        cs = new CountingSort(unsortedArray);
        assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7}, cs.sort());

        unsortedArray = new int[]{7, 7, 4, 5, 1, 3, 6, 0, 7, 7};
        cs = new CountingSort(unsortedArray);
        assertArrayEquals(new int[] {0, 1, 3, 4, 5, 6, 7, 7, 7, 7}, cs.sort());
    }

}