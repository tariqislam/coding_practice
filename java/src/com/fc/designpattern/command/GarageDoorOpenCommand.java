package com.fc.designpattern.command;

import com.fc.designpattern.command.lib.GarageDoor;

/**
 * Created by tislam on 1/4/16.
 */
public class GarageDoorOpenCommand implements Command {

    // the receiver object
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public String execute() {
        return this.garageDoor.open();
    }

    @Override
    public String undo() {
        return this.garageDoor.close();
    }
}
