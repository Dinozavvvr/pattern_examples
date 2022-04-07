package ru.dinar.patterns.behavioral.memento;

import ru.dinar.patterns.behavioral.command.Application;
import ru.dinar.patterns.behavioral.command.Command;
import ru.dinar.patterns.behavioral.command.Editor;

/**
 * created: 07-04-2022 - 14:25
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class SaveCommand extends Command {

    public SaveCommand(Application application) {
        super(application);
    }

    @Override
    public void execute() {
        backup();
    }

}
