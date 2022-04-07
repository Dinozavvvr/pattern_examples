package ru.dinar.patterns.structural.composite;

/**
 * created: 05-04-2022 - 19:21
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public interface NetworkDevice {

    boolean isAlive();

    void disable();

    void enable();

}
