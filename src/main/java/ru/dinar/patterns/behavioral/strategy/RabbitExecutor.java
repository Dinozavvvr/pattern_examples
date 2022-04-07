package ru.dinar.patterns.behavioral.strategy;

/**
 * created: 07-04-2022 - 20:14
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class RabbitExecutor implements Executor {

    @Override
    public void execute(String message) {
        System.out.println("Pushing to queue");
    }

}
