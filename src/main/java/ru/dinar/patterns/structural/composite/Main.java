package ru.dinar.patterns.structural.composite;

/**
 * created: 05-04-2022 - 19:18
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        Server server = new Server();
        Server anotherServer = new Server();
        Server moreAnotherServer = new Server();

        PC pc1 = new PC();
        PC pc2 = new PC();
        PC pc3 = new PC();
        PC pc4 = new PC();
        PC pc5 = new PC();
        // pc5.disable();

        server.connectDevice(pc1);
        server.connectDevice(pc2);
        server.connectDevice(pc3);
        server.connectDevice(anotherServer);

        anotherServer.connectDevice(pc4);
        anotherServer.connectDevice(pc5);

        Network network = new Network();
        network.addServer(server);
        network.addServer(moreAnotherServer);

        NetworkManager networkManager = new NetworkManager(network);
        System.out.println(networkManager.isTotallyActive());
    }

}
