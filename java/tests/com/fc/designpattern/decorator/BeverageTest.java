package com.fc.designpattern.decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tislam on 1/3/16.
 */
public class BeverageTest {

    Beverage coffee;
    Beverage tea;
    Beverage mocha;
    Beverage whip;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        this.coffee = new Coffee();
        assertEquals("Coffee", this.coffee.getDescription());
        assertEquals(1.5, this.coffee.getCost(), 0);

        this.mocha = new Mocha(this.coffee);
        assertEquals("Coffee, Mocha", this.mocha.getDescription());
        assertEquals(3, this.mocha.getCost(), 0);

        this.whip = new Whip(this.mocha);
        assertEquals("Coffee, Mocha, Whip", this.whip.getDescription());
        assertEquals(3.5, this.whip.getCost(), 0);
    }

}