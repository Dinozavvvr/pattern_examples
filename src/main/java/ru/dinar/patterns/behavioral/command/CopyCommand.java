package ru.dinar.patterns.behavioral.command;

/**
 * created: 06-04-2022 - 20:50
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class CopyCommand extends Command {

    public CopyCommand(Application application) {
        super(application);
    }

    @Override
    public void execute() {
        backup();
        application.setBuffer(application.getActiveEditor().getText());
    }

}
