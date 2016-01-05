package com.fc.designpattern.command;

import com.fc.designpattern.command.lib.GarageDoor;

/**
 * Created by tislam on 1/4/16.
 */
public class GarageDoorCloseCommand implements Command {

    // the receiver object
    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public String execute() {
        return this.garageDoor.close();
    }

    @Override
    public String undo() {
        return this.garageDoor.open();
    }
}
