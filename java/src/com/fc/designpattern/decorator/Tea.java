package com.fc.designpattern.decorator;

/**
 * Created by tislam on 1/3/16.
 */
public class Tea implements Beverage {
    @Override
    public String getDescription() {
        return "Tea";
    }

    @Override
    public double getCost() {
        return 2;
    }
}
