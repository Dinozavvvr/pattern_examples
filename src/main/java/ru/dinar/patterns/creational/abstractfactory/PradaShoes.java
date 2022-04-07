package ru.dinar.patterns.creational.abstractfactory;

/**
 * created: 05-04-2022 - 15:35
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class PradaShoes implements Shoes {

    @Override
    public void printDescription() {
        System.out.println("Prada Shoes");
    }

}
