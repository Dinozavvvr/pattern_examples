package ru.dinar.patterns.structural.brige;

/**
 * created: 05-04-2022 - 19:02
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class RemoteControl {

    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

}
