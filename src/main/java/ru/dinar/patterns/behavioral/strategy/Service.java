package ru.dinar.patterns.behavioral.strategy;

/**
 * created: 07-04-2022 - 20:15
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Service {

    private Executor executor;

    public void setExecutor(Executor executor) {
        this.executor = executor;
    }

    public void save(String message) {
        executor.execute(message);
    }

}
