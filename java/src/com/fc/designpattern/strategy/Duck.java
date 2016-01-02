package com.fc.designpattern.strategy;

/**
 * Created by tislam on 1/2/16.
 */
public abstract class Duck {

    protected FlyMethod flyMethod;
    protected QuackMethod quackMethod;

    abstract String toDisplay();

    public String fly() {
        return this.flyMethod.fly();
    }

    public String quack() {
        return this.quackMethod.quack();
    }

    public void setFlyMethod(FlyMethod fm) {
        this.flyMethod = fm;
    }

    public void setQuackMethod(QuackMethod qm) {
        this.quackMethod = qm;
    }

}
