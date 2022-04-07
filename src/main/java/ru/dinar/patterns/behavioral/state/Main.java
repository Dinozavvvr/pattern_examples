package ru.dinar.patterns.behavioral.state;

/**
 * created: 07-04-2022 - 15:44
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        Spotify spotify = new Spotify();
        User antonSheverda = new User("Anton Sheverda", User.Country.RUSSIA);

        User joeBaiden = new User("Joe Baiden", User.Country.OTHER);

        spotify.login(joeBaiden);
        spotify.renew();

        spotify.login(antonSheverda);
        spotify.renew();
    }

}
