package ru.dinar.patterns.behavioral.command;

/**
 * created: 06-04-2022 - 21:04
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class UI {

    private final Button undo;

    private final Button redo;

    private final Button save;

    private final Button copy;

    private final Button paste;

    private final Button delete;


    public UI() {
        this.copy = new Button();
        this.paste = new Button();
        this.delete = new Button();
        this.save = new Button();
        this.redo = new Button();
        this.undo = new Button();
    }

    public Button getUndo() {
        return undo;
    }

    public Button getRedo() {
        return redo;
    }

    public Button getSave() {
        return save;
    }

    public Button getCopy() {
        return copy;
    }

    public Button getPaste() {
        return paste;
    }

    public Button getDelete() {
        return delete;
    }

}
