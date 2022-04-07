package ru.dinar.patterns.structural.flyweight;

/**
 * created: 06-04-2022 - 18:02
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class ColorPrinter {

    static void print(Color color) {
        System.out.print((char) color.getValue());
    }

}
