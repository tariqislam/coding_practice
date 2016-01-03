package com.fc.designpattern.decorator;

/**
 * Created by tislam on 1/3/16.
 */
public class Whip implements CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 0.5;
    }
}
