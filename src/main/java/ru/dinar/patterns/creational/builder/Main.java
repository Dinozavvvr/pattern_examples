package ru.dinar.patterns.creational.builder;

/**
 * created: 05-04-2022 - 16:21
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        Triangle triangle = Triangle.builder()
                .aSide(10)
                .bSide(20)
                .cSide(15)
                .build();

        triangle.print();
    }

}
