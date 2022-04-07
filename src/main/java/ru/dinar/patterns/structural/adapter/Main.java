package ru.dinar.patterns.structural.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * created: 05-04-2022 - 18:13
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        Map<String, Object> object = new HashMap<>();
        object.put("key1", "value1");
        object.put("key2", "value2");
        object.put("key3", "value3");
        JsonObject jsonObject = JsonObject.from(object);

        XmlReader xmlReader = new XmlReader();
        JsonToXmlAdapter jsonToXmlAdapter = new JsonToXmlAdapter(jsonObject);
        xmlReader.readXml(jsonToXmlAdapter);
    }

}
