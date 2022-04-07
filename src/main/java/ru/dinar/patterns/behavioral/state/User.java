package ru.dinar.patterns.behavioral.state;

/**
 * created: 07-04-2022 - 15:48
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class User {

    private String name;

    private Country country;

    public User(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public enum Country {
        // Russia
        RUSSIA,
        // others
        OTHER
    }

    public Country getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }
}
