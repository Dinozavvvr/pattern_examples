package ru.dinar.patterns.creational.factorymethod;

/**
 * MacOsButton
 * created: 05-04-2022 - 14:55
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class MacOsButton implements Button {

    @Override
    public void onClick(Runnable action) {
        action.run();
    }

    @Override
    public void render() {
        System.out.println("Rendering MacOS button");
    }

}
