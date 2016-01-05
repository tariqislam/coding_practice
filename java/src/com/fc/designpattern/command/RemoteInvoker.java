package com.fc.designpattern.command;

/**
 * Created by tislam on 1/4/16.
 */
public interface RemoteInvoker {

    void setCommand(int position, Command on, Command off);
    String pressOnButton(int position);
    String pressOffButton(int position);
    String pressUndoButton();

}
