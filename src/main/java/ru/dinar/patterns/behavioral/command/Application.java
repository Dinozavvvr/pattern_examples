package ru.dinar.patterns.behavioral.command;

import ru.dinar.patterns.behavioral.memento.History;
import ru.dinar.patterns.behavioral.memento.RedoCommand;
import ru.dinar.patterns.behavioral.memento.SaveCommand;
import ru.dinar.patterns.behavioral.memento.UndoCommand;

import java.util.HashSet;
import java.util.Set;

/**
 * created: 06-04-2022 - 20:47
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Application {

    private History history;

    private String buffer;

    private Set<Editor> editors;

    private Editor activeEditor;

    private UI ui;

    public Application(UI ui, Editor activeEditor) {
        this.editors = new HashSet<>();
        editors.add(activeEditor);
        this.activeEditor = activeEditor;
        this.ui = ui;
        this.history = new History();
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    public String getBuffer() {
        return buffer;
    }

    public void setBuffer(String buffer) {
        this.buffer = buffer;
    }

    public Set<Editor> getEditors() {
        return editors;
    }

    public void setEditors(Set<Editor> editors) {
        this.editors = editors;
    }

    public Editor getActiveEditor() {
        return activeEditor;
    }

    public void setActiveEditor(Editor activeEditor) {
        this.activeEditor = activeEditor;
    }

    public void init() {
        ui.getCopy().setCommand(new CopyCommand(this));
        ui.getPaste().setCommand(new PasteCommand(this));
        ui.getDelete().setCommand(new DeleteCommand(this));
        ui.getSave().setCommand(new SaveCommand(this));
        ui.getRedo().setCommand(new RedoCommand(this));
        ui.getUndo().setCommand(new UndoCommand(this));
    }

}
