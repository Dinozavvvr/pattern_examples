package ru.dinar.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * created: 05-04-2022 - 19:23
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Server implements NetworkDevice {

    private Boolean enabled;

    private List<NetworkDevice> connectedDevices;

    public Server() {
        this.enabled = true;
        this.connectedDevices = new ArrayList<>();
    }

    // сервер считается живым когда живы все устройства подключенные к нему
    @Override
    public boolean isAlive() {
        Optional<NetworkDevice> first = connectedDevices.stream().filter(device -> !device.isAlive()).findFirst();
        return enabled && first.isEmpty();
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    public void connectDevice(NetworkDevice device) {
        connectedDevices.add(device);
    }

}
