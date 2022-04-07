package ru.dinar.patterns.structural.adapter;

/**
 * created: 05-04-2022 - 18:21
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class JsonToXmlAdapter extends XmlObject {

    private JsonObject originalJson;

    private JsonToXmlAdapter(DOM dom) {
        super(dom);
    }

    public JsonToXmlAdapter(JsonObject jsonObject) {
        super(null);

        this.originalJson = jsonObject;
        this.dom = new DOM(convertToXml(originalJson));
    }

    private String convertToXml(JsonObject jsonObject) {
        return "converted to XML:{ " + jsonObject.toString() + " }";
    }

}
