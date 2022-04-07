package ru.dinar.patterns.structural.composite;

import java.util.Optional;

/**
 * created: 05-04-2022 - 19:19
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class NetworkManager {

    private final Network network;

    public NetworkManager(Network network) {
        this.network = network;
    }

    public boolean isTotallyActive() {
        Optional<Server> notActiveServer = network.getServers()
                .stream()
                .filter(server -> !server.isAlive())
                .findFirst();
        return notActiveServer.isEmpty();
    }

}
