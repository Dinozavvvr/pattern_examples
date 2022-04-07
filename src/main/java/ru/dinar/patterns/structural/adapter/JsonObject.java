package ru.dinar.patterns.structural.adapter;

import java.util.Map;

/**
 * created: 05-04-2022 - 18:19
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class JsonObject {

    private Map<String, Object> root;

    private JsonObject(Map<String, Object> root) {
        this.root = root;
    }

    public static JsonObject from(Map<String, Object> objectMap) {
        return new JsonObject(objectMap);
    }

    @Override
    public String toString() {
        return "JsonObject{" +
                "root=" + root.toString() +
                '}';
    }
}
