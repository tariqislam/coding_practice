package com.fc.designpattern.strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tislam on 1/2/16.
 */
public class DuckTest {

    Duck duck;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        duck = new MNDuck();
        assertEquals("flying with wings", duck.fly());
        assertEquals("quack", duck.quack());
        duck.setFlyMethod(new CantFly());
        assertEquals("can't fly", duck.fly());
    }

}