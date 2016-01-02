package com.fc.designpattern.strategy;

/**
 * Created by tislam on 1/2/16.
 */
public class MNDuck extends Duck {

    public MNDuck() {
        super();
        this.quackMethod = new Quack();
        this.flyMethod = new FlyWithWings();
    }

    public String toDisplay() {
        return "mn duck";
    }
}
