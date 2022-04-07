package ru.dinar.patterns.structural.flyweight;

import java.util.Arrays;

/**
 * created: 06-04-2022 - 17:38
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        Window window = new Window(Window.Resolution.HD);
        byte[][] image = new byte[Window.Resolution.HD.getWidth()][Window.Resolution.HD.getWidth()];
        byte s = '*';

        for (byte[] bytes : image) {
            Arrays.fill(bytes, s);
        }

        window.display(image);
    }

}
