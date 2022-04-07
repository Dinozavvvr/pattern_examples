package ru.dinar.patterns.structural.proxy;

import ru.dinar.patterns.structural.flyweight.Display;
import ru.dinar.patterns.structural.flyweight.Window;

/**
 * created: 06-04-2022 - 18:48
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class TimedWindow implements Display {

    private final Window original;

    public TimedWindow(Window window) {
        this.original = window;
    }

    @Override
    public void display(byte[][] image) {
        long before = System.currentTimeMillis();
        original.display(image);
        // выводим время исполнения оригинального метода

        long after = System.currentTimeMillis();
        System.out.println("Window.display() execution time is: " + (after - before) + " millis");
    }
}
