package ru.dinar.patterns.creational.factorymethod;

/**
 * created: 05-04-2022 - 15:09
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class MacOsDialog implements Dialog {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

}
