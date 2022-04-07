package ru.dinar.patterns.creational.abstractfactory;

/**
 * created: 05-04-2022 - 15:37
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Look {

    private AbstractClothesFactory clothesFactory;

    public Look(AbstractClothesFactory clothesFactory) {
        this.clothesFactory = clothesFactory;
    }

    void todaysBrandLook() {
        this.clothesFactory.createJacket().printDescription();
        this.clothesFactory.createShoes().printDescription();
    }

    public void setClothesFactory(AbstractClothesFactory clothesFactory) {
        this.clothesFactory = clothesFactory;
    }

}
