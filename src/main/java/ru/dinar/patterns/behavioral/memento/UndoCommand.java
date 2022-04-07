package ru.dinar.patterns.behavioral.memento;

import ru.dinar.patterns.behavioral.command.Application;
import ru.dinar.patterns.behavioral.command.Command;
import ru.dinar.patterns.behavioral.command.Editor;

/**
 * created: 07-04-2022 - 14:33
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class UndoCommand extends Command {

    public UndoCommand(Application application) {
        super(application);
    }

    @Override
    public void execute() {
        Editor.Snapshot snapshot = this.application.getHistory().undo();
        this.application.getActiveEditor().restore(snapshot);
    }

}
