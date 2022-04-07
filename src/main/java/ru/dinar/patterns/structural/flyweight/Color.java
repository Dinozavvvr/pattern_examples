package ru.dinar.patterns.structural.flyweight;

/**
 * created: 06-04-2022 - 18:02
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Color {

    private final byte value;

    public Color(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

}
