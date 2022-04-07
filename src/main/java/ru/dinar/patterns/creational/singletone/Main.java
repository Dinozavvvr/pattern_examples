package ru.dinar.patterns.creational.singletone;

/**
 * created: 05-04-2022 - 16:39
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext1 = ApplicationContext.getInstance();
        ApplicationContext applicationContext2 = ApplicationContext.getInstance();
        ApplicationContext applicationContext3 = ApplicationContext.getInstance();

        System.out.println(applicationContext1 == applicationContext2 &&
                applicationContext2 == applicationContext3);
    }

}
