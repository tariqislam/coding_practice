package com.fc.designpattern.decorator;

/**
 * Created by tislam on 1/3/16.
 */
public class Coffee implements Beverage {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double getCost() {
        return 1.5;
    }
}
