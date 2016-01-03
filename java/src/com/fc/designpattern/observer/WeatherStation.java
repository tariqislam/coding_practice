package com.fc.designpattern.observer;

import java.util.ArrayList;

/**
 * Created by tislam on 1/2/16.
 */
public class WeatherStation implements Observable {

    private ArrayList<Observer> observerList;
    private String weatherState;

    public WeatherStation() {
        this.observerList = new ArrayList<Observer>();
        this.weatherState = "not set";
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!this.observerList.contains(observer)) {
            this.observerList.add(observer);
        }
    }

    @Override
    public void deleteObserver(Observer observer) {
        if (this.observerList.contains(observer)) {
            this.observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observerList) {
            observer.update(this, null);
        }
    }

    public void notifyObservers(String data) {
        for (Observer observer : this.observerList) {
            observer.update(this, data);
        }
    }

    public String getState() {
        return this.weatherState;
    }

    public void weatherChanged(String state, boolean isPush) {
        this.weatherState = state;
        if (isPush) {
            this.notifyObservers(state);
        }
        else {
            this.notifyObservers();
        }
    }

}
