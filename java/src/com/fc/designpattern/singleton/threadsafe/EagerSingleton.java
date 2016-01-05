package com.fc.designpattern.singleton.threadsafe;

/**
 * Created by tislam on 1/4/16.
 */
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }

}
