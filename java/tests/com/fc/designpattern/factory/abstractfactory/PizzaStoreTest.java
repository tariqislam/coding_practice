package com.fc.designpattern.factory.abstractfactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tislam on 1/3/16.
 */
public class PizzaStoreTest {

    PizzaStore nyPizzaStore;
    PizzaStore chicagoPizzaStore;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        nyPizzaStore = new NyPizzaStore();
        chicagoPizzaStore = new ChicagoPizzaStore();

        assertEquals("ordered cheese, marinara sauce thin crust dough", nyPizzaStore.orderPizza("cheese"));
        assertEquals("ordered cheese, no sauce deep dish dough", nyPizzaStore.orderPizza("funky"));

        assertEquals("ordered cheese, spicy sauce deep dish dough", chicagoPizzaStore.orderPizza("chicago"));
    }

}