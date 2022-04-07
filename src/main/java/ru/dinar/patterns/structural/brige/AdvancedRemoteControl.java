package ru.dinar.patterns.structural.brige;

/**
 * created: 05-04-2022 - 19:05
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public int getChargeValue() {
        return super.device.getCharge();
    }

}
