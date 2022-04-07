package ru.dinar.patterns.behavioral.mediator;

/**
 * created: 07-04-2022 - 13:44
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Component {

    protected Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

}
