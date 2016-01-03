package com.fc.designpattern.observer;

/**
 * Created by tislam on 1/2/16.
 */
public class GeneralDisplay implements Observer, Display {

    private String state;

    @Override
    public void update(Observable observable, Object state) {
        if (state != null) {
            this.state = (String) state;
        }
        else {
            WeatherStation ws = (WeatherStation) observable;
            this.state = ws.getState();
        }
    }

    public String display() {
        return this.state;
    }

}
