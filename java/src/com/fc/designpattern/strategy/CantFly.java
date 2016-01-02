package com.fc.designpattern.strategy;

/**
 * Created by tislam on 1/2/16.
 */
public class CantFly implements FlyMethod {
    public String fly() {
        return "can't fly";
    }
}
