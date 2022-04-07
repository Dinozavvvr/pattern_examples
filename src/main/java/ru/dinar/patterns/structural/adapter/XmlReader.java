package ru.dinar.patterns.structural.adapter;

/**
 * created: 05-04-2022 - 18:14
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class XmlReader {

    public void readXml(XmlObject xmlObject) {
        System.out.println("reading XML object...");
        System.out.println(xmlObject);
    }

}
