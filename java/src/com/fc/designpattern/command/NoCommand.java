package com.fc.designpattern.command;

/**
 * Created by tislam on 1/4/16.
 */
public class NoCommand implements Command {
    @Override
    public String execute() {
        return null;
    }

    @Override
    public String undo() {
        return null;
    }
}
