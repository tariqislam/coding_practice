package com.fc.designpattern.factory.factorymethod;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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

        assertEquals("ordered ny cheese pizza", nyPizzaStore.orderPizza("cheese"));
        assertEquals("ordered ny pizza", nyPizzaStore.orderPizza("ny"));

        assertEquals("ordered chicago cheese pizza", chicagoPizzaStore.orderPizza("chicago"));
    }

}