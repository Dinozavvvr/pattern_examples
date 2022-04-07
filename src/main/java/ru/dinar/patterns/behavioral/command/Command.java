package ru.dinar.patterns.behavioral.command;

/**
 * created: 06-04-2022 - 20:41
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public abstract class Command {

    protected Application application;

    public Command(Application application) {
        this.application = application;
    }

    public void backup() {
        Editor.Snapshot snapshot = this.application.getActiveEditor().createSnapshot();
        this.application.getHistory().saveState(snapshot);
    }

    public abstract void execute();

}
