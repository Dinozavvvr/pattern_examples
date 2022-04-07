package ru.dinar.patterns.creational.factorymethod;

/**
 * WindowsDialog
 * created: 05-04-2022 - 14:59
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class WindowsDialog implements Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}

