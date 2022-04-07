package ru.dinar.patterns.creational.abstractfactory;

import java.util.Random;

/**
 * Main
 * created: 05-04-2022 - 15:22
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        AbstractClothesFactory clothesFactory = getRandomFactory();
        Look look = new Look(clothesFactory);

        look.todaysBrandLook();
    }

    private static AbstractClothesFactory getRandomFactory() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return new GucciClothesFactory();
        } else {
            return new PradaClothesFactory();
        }
    }

}
