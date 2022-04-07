package ru.dinar.patterns.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * created: 07-04-2022 - 15:22
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class EventPublisher implements Publisher {

    private final Set<Subscriber> subscribers;

    public EventPublisher() {
        this.subscribers = new HashSet<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notify(String message) {
        subscribers.forEach(subscriber -> subscriber.update(message));
    }

}
