package com.fc.designpattern.observer;

/**
 * Created by tislam on 1/2/16.
 */
public interface Observable {

    public void registerObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers();

}
