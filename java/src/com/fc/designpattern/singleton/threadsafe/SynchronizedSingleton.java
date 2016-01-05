package com.fc.designpattern.singleton.threadsafe;

/**
 * Created by tislam on 1/4/16.
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {}

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }

}
