package ru.dinar.patterns.behavioral.command;

import ru.dinar.patterns.behavioral.memento.Originator;

/**
 * created: 06-04-2022 - 20:46
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Editor implements Originator<Editor.Snapshot> {

    private String text;

    public Snapshot snapshot;

    public Editor() {
        this.text = "";
    }

    public static class Snapshot {

        private final String text;

        public Snapshot(String text) {
            this.text = text;
        }

    }

    public void restore(Snapshot snapshot) {
        this.text = snapshot.text;
    }

    public Snapshot createSnapshot() {
        return new Snapshot(text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
