package com.fc.linkedlist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tislam on 11/8/15.
 */
public class ListElementTest {

    ListElement nullList, oneList, twoList, threeList;

    @Before
    public void setUp() throws Exception {

        this.nullList = null;

        this.oneList = new ListElement(1);

        this.twoList = new ListElement(1);
        this.twoList = twoList.insertInFront(2);

        this.threeList = new ListElement(1);
        this.threeList = threeList.insertInFront(2);
        this.threeList = threeList.insertInFront(3);
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void testInsertInFront() throws Exception {
        oneList = oneList.insertInFront(2);
        assertEquals(2, oneList.data);
        assertEquals(1, oneList.next.data);
        assertNull(oneList.next.next);
    }


    @Test
    public void testFind() throws Exception {
        ListElement foundElement = null;

        foundElement = oneList.find(1);
        assertEquals(foundElement, oneList);

        foundElement = oneList.find(2);
        assertNull(foundElement);

        foundElement = threeList.find(1);
        assertEquals(foundElement.data, 1);
        foundElement = threeList.find(2);
        assertEquals(foundElement.data, 2);
        foundElement = threeList.find(3);
        assertEquals(foundElement.data, 3);
        foundElement = threeList.find(0);
        assertNull(foundElement);
    }


    @Test
    public void testDelete() throws Exception {
        ListElement list = null;

        list = oneList.delete(0);
        assertEquals(list, oneList);

        list = oneList.delete(1);
        assertNull(list);

        list = twoList.delete(1);
        assertEquals(list.data, 2);
        assertEquals(list.next, null);

        list = threeList.delete(2);
        assertEquals(list.data, 3);
        assertEquals(list.next.data, 1);
        assertNull(list.next.next);
    }

}