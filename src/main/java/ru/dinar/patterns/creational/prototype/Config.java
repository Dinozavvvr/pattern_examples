package ru.dinar.patterns.creational.prototype;

import java.util.Map;

/**
 * created: 05-04-2022 - 15:56
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public interface Config extends Prototype<Config> {

    Map<String, String> getProperties();

}
