package ru.dinar.patterns.creational.factorymethod;

/**
 * ButtonCreator
 * created: 05-04-2022 - 14:50
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public interface Dialog {

    default void render() {
        Button button = createButton();
        button.onClick(() -> System.out.println("Button pressed"));
        button.render();
    }

    Button createButton();

}
