package ru.dinar.patterns.behavioral.strategy;

/**
 * created: 07-04-2022 - 18:46
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        Executor databaseExecutor = new DatabaseExecutor();
        Executor rabbitExecutor= new RabbitExecutor();
        Service service = new Service();

        String message = "{'username': 'dinar', 'password': 'qwerty007'}";
        service.setExecutor(databaseExecutor);
        service.save(message);
        service.setExecutor(rabbitExecutor);
        service.save(message);
    }

}
