package ru.dinar.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * created: 05-04-2022 - 19:29
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Network {

    // сеть должна состоять из серверов
    private List<Server> servers;

    public Network() {
        this.servers = new ArrayList<>();
    }

    public List<Server> getServers() {
        return servers;
    }

    public void addServer(Server server) {
        servers.add(server);
    }

    public void removeServer(Server server) {
        servers = servers.stream()
                .filter(s -> !s.equals(server))
                .collect(Collectors.toList());
    }

}
