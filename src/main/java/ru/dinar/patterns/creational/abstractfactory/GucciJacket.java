package ru.dinar.patterns.creational.abstractfactory;

/**
 * created: 05-04-2022 - 15:34
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class GucciJacket implements Jacket {

    @Override
    public void printDescription() {
        System.out.println("Gucci Jacket");
    }

}
