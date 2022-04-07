package ru.dinar.patterns.creational.abstractfactory;

/**
 * created: 05-04-2022 - 15:36
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class GucciClothesFactory implements AbstractClothesFactory {

    @Override
    public Shoes createShoes() {
        return new GucciShoes();
    }

    @Override
    public Jacket createJacket() {
        return new GucciJacket();
    }

}
