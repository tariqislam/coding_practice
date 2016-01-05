package com.fc.designpattern.factory.simplefactory;

/**
 * Created by tislam on 1/3/16.
 */
public interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
    String toString();
}
