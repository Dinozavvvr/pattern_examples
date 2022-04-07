package ru.dinar.patterns.behavioral.memento;

/**
 * created: 07-04-2022 - 14:18
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public interface Originator<T> {

    T createSnapshot();

    void restore(T snapshot);

}
