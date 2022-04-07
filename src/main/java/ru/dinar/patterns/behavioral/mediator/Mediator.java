package ru.dinar.patterns.behavioral.mediator;

/**
 * created: 07-04-2022 - 13:42
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public interface Mediator {

    void notify(Component sender, Event click);

}
