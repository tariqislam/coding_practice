package com.fc.designpattern.factory.factorymethod;

import java.util.ArrayList;

/**
 * Created by tislam on 1/3/16.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
//        System.out.println("preparing...");
    }

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
