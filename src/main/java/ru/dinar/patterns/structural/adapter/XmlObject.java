package ru.dinar.patterns.structural.adapter;

/**
 * created: 05-04-2022 - 18:16
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class XmlObject {

    protected DOM dom;

    protected XmlObject(DOM dom) {
    }

    private static XmlObject from(String string) {
        DOM dom = new DOM(string);
        return new XmlObject(dom);
    }

    protected static class DOM {

        private final String xml;

        public DOM(String xml) {
            this.xml = xml;
        }

        @Override
        public String toString() {
            return "DOM{" +
                    "xml='" + xml + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "XmlObject{" +
                "dom=" + dom.toString() +
                '}';
    }

}
