package ru.dinar.patterns.structural.composite;

/**
 * created: 05-04-2022 - 19:36
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class PC implements NetworkDevice {

    private Boolean enabled;

    public PC() {
        this.enabled = true;
    }

    @Override
    public boolean isAlive() {
        return enabled;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public void enable() {
        enabled = true;
    }

}
