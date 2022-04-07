package ru.dinar.patterns.behavioral.memento;

import ru.dinar.patterns.behavioral.command.Application;
import ru.dinar.patterns.behavioral.command.Command;
import ru.dinar.patterns.behavioral.command.Editor;

/**
 * created: 07-04-2022 - 14:37
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class RedoCommand extends Command {

    public RedoCommand(Application application) {
        super(application);
    }

    @Override
    public void execute() {
        Editor.Snapshot snapshot = application.getHistory().redo();
        this.application.getActiveEditor().restore(snapshot);
    }

}
