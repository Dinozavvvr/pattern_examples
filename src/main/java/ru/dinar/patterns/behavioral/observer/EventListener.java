package ru.dinar.patterns.behavioral.observer;

/**
 * created: 07-04-2022 - 15:24
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class EventListener implements Subscriber {

    private static int count = 0;
    private final int n;

    public EventListener() {
        count++;
        n = count;
    }

    @Override
    public void update(String message) {
        System.out.println(this.getClass().getSimpleName() + "@" + n + " - " + message);
    }

}
