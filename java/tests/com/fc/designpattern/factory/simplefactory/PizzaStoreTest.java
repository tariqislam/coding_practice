package com.fc.designpattern.factory.simplefactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tislam on 1/3/16.
 */
public class PizzaStoreTest {

    PizzaStore pizzaStore;

    @Before
    public void setUp() throws Exception {
        pizzaStore = new PizzaStore(new PizzaFactory());
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        assertEquals("ordered ny pizza", pizzaStore.orderPizza("ny"));
        assertEquals("ordered cheese pizza", pizzaStore.orderPizza("cheese"));

    }

}