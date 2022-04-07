package ru.dinar.patterns.behavioral.command;

/**
 * created: 06-04-2022 - 21:02
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Button {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }

}
