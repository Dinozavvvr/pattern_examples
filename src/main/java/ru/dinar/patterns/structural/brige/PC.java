package ru.dinar.patterns.structural.brige;

/**
 * created: 05-04-2022 - 18:59
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class PC implements Device {

    private Boolean isActive = false;

    private int charge;

    @Override
    public boolean isEnabled() {
        return isActive;
    }

    @Override
    public void enable() {
        isActive = true;
    }

    @Override
    public void disable() {
        isActive = false;
    }

    @Override
    public int getCharge() {
        return charge;
    }

}
