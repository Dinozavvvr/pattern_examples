package ru.dinar.patterns.behavioral.command;

/**
 * created: 06-04-2022 - 20:40
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        Editor editor1 = new Editor();
        UI ui = new UI();
        Application application = new Application(ui, editor1);
        application.init();

        // nothing
        System.out.println(editor1.getText());
        editor1.setText("Hello world!");
        // Hello world!
        System.out.println(editor1.getText());

        // copied to buffer
        ui.getCopy().click();

        // open new editor
        Editor editor2 = new Editor();
        application.getEditors().add(editor2);
        // select new editor
        application.setActiveEditor(editor2);
        // nothing
        System.out.println(editor2.getText());
        ui.getPaste().click();
        System.out.println(editor2.getText());
        // Hello world!

        System.out.println(editor1.getText().equals(editor2.getText()));
    }

}
