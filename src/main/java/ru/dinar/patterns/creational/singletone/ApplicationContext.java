package ru.dinar.patterns.creational.singletone;

import java.util.Optional;

/**
 * created: 05-04-2022 - 16:39
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class ApplicationContext {

    private static Optional<ApplicationContext> applicationContext = Optional.empty();

    private ApplicationContext() {}

    public static ApplicationContext getInstance() {
        if (applicationContext.isEmpty()) {
            applicationContext = Optional.of(new ApplicationContext());
        }
        return applicationContext.get();
    }

}
