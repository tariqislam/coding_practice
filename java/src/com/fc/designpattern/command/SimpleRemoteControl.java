package com.fc.designpattern.command;

/**
 * Created by tislam on 1/4/16.
 *
 * This is the invoker object.
 */
public class SimpleRemoteControl implements RemoteInvoker {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    private int numberButtons;

    public SimpleRemoteControl(int numberButtons) {
        this.onCommands = new Command[numberButtons];
        this.offCommands = new Command[numberButtons];
        this.numberButtons = numberButtons;

        for (Command command : this.onCommands) {
            command = new NoCommand();
        }

        for (Command command : this.offCommands) {
            command = new NoCommand();
        }
    }

    @Override
    public void setCommand(int position, Command on, Command off) throws ArrayIndexOutOfBoundsException {
        this.checkIndexPositionInCommandArray(position);
        onCommands[position] = on;
        offCommands[position] = off;
    }

    @Override
    public String pressOnButton(int position) throws ArrayIndexOutOfBoundsException {
        this.checkIndexPositionInCommandArray(position);
        this.undoCommand = onCommands[position];
        // call the command's execute operation
        return onCommands[position].execute();
    }

    @Override
    public String pressOffButton(int position) throws ArrayIndexOutOfBoundsException {
        this.checkIndexPositionInCommandArray(position);
        this.undoCommand = offCommands[position];
        // call the command's execute operation
        return offCommands[position].execute();
    }

    public String pressUndoButton() {
        return undoCommand.undo();
    }

    private void checkIndexPositionInCommandArray(int position) throws ArrayIndexOutOfBoundsException{
        if (position < 0 || position >= this.numberButtons) {
            throw new ArrayIndexOutOfBoundsException("remote position number invalid - " + position);
        }
    }
}
