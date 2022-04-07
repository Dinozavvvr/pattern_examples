package ru.dinar.patterns.creational.prototype;

import java.util.Map;

/**
 * created: 05-04-2022 - 16:01
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class WebApplicationConfig extends BaseApplicationConfig {

    private String hostname;
    private Integer port;

    public WebApplicationConfig(Integer cacheSize, Integer memorySize, String hostname, Integer port) {
        super(cacheSize, memorySize);
        this.hostname = hostname;
        this.port = port;
    }

    private WebApplicationConfig(WebApplicationConfig config) {
        super(config);
        this.hostname = config.hostname;
        this.port = config.port;
    }

    @Override
    public Map<String, String> getProperties() {
        Map<String, String> properties = super.getProperties();

        properties.put("hostname", this.hostname);
        properties.put("port", this.port.toString());

        return properties;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public Config clone() {
        return new WebApplicationConfig(this);
    }

}
