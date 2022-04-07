package ru.dinar.patterns.creational.factorymethod;

/**
 * Button
 * created: 05-04-2022 - 14:52
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public interface Button {

    void onClick(Runnable action);

    void render();

}
