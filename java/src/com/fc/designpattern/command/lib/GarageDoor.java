package com.fc.designpattern.command.lib;

/**
 * Created by tislam on 1/4/16.
 *
 * This is an external library.
 */
public class GarageDoor {

    public String open() {
        return "garage door is open";
    }

    public String close() {
        return "garage door is close";
    }

    public String stop() {
        return "garage door stopped";
    }

}
