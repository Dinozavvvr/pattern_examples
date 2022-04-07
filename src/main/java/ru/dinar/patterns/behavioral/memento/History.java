package ru.dinar.patterns.behavioral.memento;

import ru.dinar.patterns.behavioral.command.Editor;

import java.util.ArrayList;
import java.util.List;

/**
 * created: 07-04-2022 - 14:27
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class History {

    private final List<Editor.Snapshot> stack = new ArrayList<>();

    private int current = 0;

    public void saveState(Editor.Snapshot snapshot) {
        current = stack.size();
        stack.add(snapshot);
        current++;
    }

    public Editor.Snapshot undo() {
        if (current > 0) {
            current--;
            return stack.get(current);
        } else {
            throw new IllegalStateException("Nothing to undo");
        }
    }

    public Editor.Snapshot redo() {
        if (current < stack.size() - 1) {
            current++;
            return stack.get(current);
        }
        else {
            throw new IllegalStateException("Nothing to redo");
        }
    }

}
