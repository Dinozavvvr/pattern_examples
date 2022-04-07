package ru.dinar.patterns.behavioral.memento;

import ru.dinar.patterns.behavioral.command.Application;
import ru.dinar.patterns.behavioral.command.Editor;
import ru.dinar.patterns.behavioral.command.UI;

/**
 * created: 07-04-2022 - 14:15
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        UI ui = new UI();
        Application application = new Application(ui, editor);
        application.init();

        // nothing
        System.out.println(editor.getText());
        editor.setText("Hello world!");
        // saving snapshot
        ui.getSave().click();
        System.out.println(editor.getText());

        editor.setText("Hello world!, My name is Dinr =)");
        System.out.println(editor.getText());

        // going to previous snapshot
        ui.getUndo().click();
        System.out.println(editor.getText());

        editor.setText("Hello world!, My name is Dinar =)");
        ui.getSave().click();
        System.out.println(editor.getText());

        editor.setText("Hello world!, My name is Dinar =) hahahahaha");
        System.out.println(editor.getText());

        ui.getUndo().click();
        System.out.println(editor.getText());
        ui.getUndo().click();
        System.out.println(editor.getText());

        ui.getRedo().click();
        System.out.println(editor.getText());

    }

}
