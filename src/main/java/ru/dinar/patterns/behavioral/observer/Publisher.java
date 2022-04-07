package ru.dinar.patterns.behavioral.observer;

/**
 * created: 07-04-2022 - 15:16
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public interface Publisher {

    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notify(String message);

}
