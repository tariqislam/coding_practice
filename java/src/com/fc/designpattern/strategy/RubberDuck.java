package com.fc.designpattern.strategy;

/**
 * Created by tislam on 1/2/16.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        this.quackMethod = new QuackNSqueak();
        this.flyMethod = new CantFly();
    }

    public String toDisplay() {
        return "rubber duck";
    }
}
