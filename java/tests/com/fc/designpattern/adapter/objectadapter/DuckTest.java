package com.fc.designpattern.adapter.objectadapter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tislam on 1/5/16.
 */
public class DuckTest {

    Duck duck;
    Turkey turkey;
    Duck turkeyAdapter;

    @Before
    public void setUp() throws Exception {
        duck = new MnDuck();
        turkey = new MnTurkey();
        turkeyAdapter = new TurkeyAdapter(turkey);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        assertEquals("quack", this.duck.quack());
        assertEquals("gobble", this.turkeyAdapter.quack());

    }

}