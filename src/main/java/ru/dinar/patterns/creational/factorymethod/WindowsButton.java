package ru.dinar.patterns.creational.factorymethod;

/**
 * WindowsButton
 * created: 05-04-2022 - 14:53
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class WindowsButton implements Button {

    @Override
    public void onClick(Runnable action) {
        action.run();
    }

    @Override
    public void render() {
        System.out.println("Rendering Windows button");
    }

}
