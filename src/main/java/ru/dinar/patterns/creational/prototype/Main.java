package ru.dinar.patterns.creational.prototype;

import java.util.Map;

/**
 * created: 05-04-2022 - 15:52
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        Config base = new BaseApplicationConfig(1024, 2048);
        Config web = new WebApplicationConfig(1024, 2048, "localhost", 8080);

        System.out.println("BASE CONFIG");
        Config baseClone = base.clone();
        printProps(baseClone.getProperties());

        System.out.println("WEB CONFIG");
        Config webClone = web.clone();
        printProps(webClone.getProperties());
    }

    private static void printProps(Map<String, String> props) {
        props.forEach((key, value) -> System.out.println(key + " : " + value));
    }

}
