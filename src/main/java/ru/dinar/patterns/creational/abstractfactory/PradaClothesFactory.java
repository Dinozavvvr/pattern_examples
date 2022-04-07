package ru.dinar.patterns.creational.abstractfactory;

/**
 * created: 05-04-2022 - 15:37
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class PradaClothesFactory implements AbstractClothesFactory {

    @Override
    public Shoes createShoes() {
        return new PradaShoes();
    }

    @Override
    public Jacket createJacket() {
        return new PradaJacket();
    }

}
