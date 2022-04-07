package ru.dinar.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * created: 05-04-2022 - 15:57
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class BaseApplicationConfig implements Config {

    private Integer cacheSize;
    private Integer memorySize;

    public BaseApplicationConfig(Integer cacheSize, Integer memorySize) {
        this.cacheSize = cacheSize;
        this.memorySize = memorySize;
    }

    protected BaseApplicationConfig(BaseApplicationConfig config) {
        this.cacheSize = config.cacheSize;
        this.memorySize = config.memorySize;
    }

    @Override
    public Map<String, String> getProperties() {
        Map<String, String> props = new HashMap<>();

        props.put("cache-size", this.cacheSize.toString());
        props.put("memory-size", this.memorySize.toString());

        return props;
    }

    public void setCacheSize(Integer cacheSize) {
        this.cacheSize = cacheSize;
    }

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    @Override
    public Config clone() {
        return new BaseApplicationConfig(this);
    }
}
