package com.fc.designpattern.facade;

/**
 * Created by tislam on 1/5/16.
 */
public class HomeTheatreFacade {

    Tv tv;
    DvdPlayer dvdPlayer;
    Light light;

    public HomeTheatreFacade(Tv tv, DvdPlayer dvdPlayer, Light light) {
        this.tv = tv;
        this.dvdPlayer = dvdPlayer;
        this.light = light;
    }

    public void playMovie() {
        this.light.dim();
        this.tv.on();
        this.dvdPlayer.on();
        this.dvdPlayer.play();
    }

    public void stopMovie() {
        this.tv.off();
        this.dvdPlayer.off();
    }
}
