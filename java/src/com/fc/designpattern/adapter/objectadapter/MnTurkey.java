package com.fc.designpattern.adapter.objectadapter;

/**
 * Created by tislam on 1/5/16.
 */
public class MnTurkey implements Turkey {
    @Override
    public String fly() {
        return "short fly";
    }

    @Override
    public String gobble() {
        return "gobble";
    }
}
