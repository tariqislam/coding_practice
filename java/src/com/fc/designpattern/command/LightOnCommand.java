package com.fc.designpattern.command;

import com.fc.designpattern.command.lib.Light;

/**
 * Created by tislam on 1/4/16.
 */
public class LightOnCommand implements Command {

    // The receiver object
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public String execute() {
        return this.light.on();
    }

    @Override
    public String undo() {
        return this.light.off();
    }
}
