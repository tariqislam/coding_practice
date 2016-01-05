package com.fc.designpattern.factory.abstractfactory;

import java.util.ArrayList;

/**
 * Created by tislam on 1/3/16.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;

    // the concrete pizza classes will make use of the concrete ingredients
    abstract void prepare();

    void bake() {
//        System.out.println("baking...");
    }

    void cut() {
//        System.out.println("cutting...");
    }

    void box() {
//        System.out.println("placing in box.");
    }

    public String toString() {
        return this.name;
    }
}
