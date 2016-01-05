package com.fc.designpattern.adapter.objectadapter;

/**
 * Created by tislam on 1/5/16.
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public String fly() {
        return turkey.fly();
    }

    @Override
    public String quack() {
        return turkey.gobble();
    }
}
