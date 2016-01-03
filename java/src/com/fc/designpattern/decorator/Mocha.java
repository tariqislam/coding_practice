package com.fc.designpattern.decorator;

/**
 * Created by tislam on 1/3/16.
 */
public class Mocha implements CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 1.5;
    }
}
