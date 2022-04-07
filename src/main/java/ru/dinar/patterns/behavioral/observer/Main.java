package ru.dinar.patterns.behavioral.observer;

import java.time.LocalDateTime;

/**
 * created: 07-04-2022 - 15:16
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        Subscriber subscriber1 = new EventListener();
        Subscriber subscriber2 = new EventListener();
        Subscriber subscriber3 = new EventListener();
        Subscriber subscriber4 = new EventListener();
        Subscriber subscriber5 = new EventListener();

        EventPublisher publisher1 = new EventPublisher();
        EventPublisher publisher2 = new EventPublisher();

        publisher1.subscribe(subscriber1);
        publisher1.subscribe(subscriber2);
        publisher1.subscribe(subscriber3);
        new Thread(() -> {
            while (true) {
                publisher1.notify("CurrentTime: " + LocalDateTime.now());
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        publisher2.subscribe(subscriber4);
        publisher2.subscribe(subscriber5);
        new Thread(() -> {
            while (true) {
                publisher2.notify("Today is : " + LocalDateTime.now().getDayOfWeek().name());
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
