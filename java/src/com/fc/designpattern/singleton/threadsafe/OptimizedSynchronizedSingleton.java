package com.fc.designpattern.singleton.threadsafe;

/**
 * Created by tislam on 1/4/16.
 */
public class OptimizedSynchronizedSingleton {

    private static volatile OptimizedSynchronizedSingleton instance;

    private OptimizedSynchronizedSingleton() {}

    public static OptimizedSynchronizedSingleton getInstance() {
        if (instance == null) {
            synchronized (OptimizedSynchronizedSingleton.class) {
                if (instance == null) {
                    instance = new OptimizedSynchronizedSingleton();
                }
            }
        }
        return instance;
    }
}
