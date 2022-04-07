package ru.dinar.patterns.structural.brige;

/**
 * created: 05-04-2022 - 18:57
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public interface Device {

    boolean isEnabled();

    void enable();

    void disable();

    int getCharge();

}
