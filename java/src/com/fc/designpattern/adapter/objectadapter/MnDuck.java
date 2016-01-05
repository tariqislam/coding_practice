package com.fc.designpattern.adapter.objectadapter;

/**
 * Created by tislam on 1/5/16.
 */
public class MnDuck implements Duck {
    @Override
    public String fly() {
        return "flap";
    }

    @Override
    public String quack() {
        return "quack";
    }
}
