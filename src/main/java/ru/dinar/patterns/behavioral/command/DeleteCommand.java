package ru.dinar.patterns.behavioral.command;

/**
 * created: 06-04-2022 - 20:49
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class DeleteCommand extends Command {

    private static final String EMPTY = "";

    public DeleteCommand(Application application) {
        super(application);
    }

    @Override
    public void execute() {
        backup();
        application.getActiveEditor().setText(EMPTY);
    }

}
