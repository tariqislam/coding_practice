package com.fc.designpattern.command;

/**
 * Created by tislam on 1/4/16.
 */
public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public String execute() {
        StringBuilder sb = new StringBuilder();
        for (Command command : this.commands) {
            sb.append(command.execute());
            sb.append(", ");
        }
        return sb.toString();
    }

    @Override
    public String undo() {
        StringBuilder sb = new StringBuilder();
        for (Command command : this.commands) {
            sb.append(command.undo());
            sb.append(", ");
        }
        return sb.toString();
    }
}
