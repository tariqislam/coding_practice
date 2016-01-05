package com.fc.designpattern.singleton;

/**
 * Created by tislam on 1/4/16.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
