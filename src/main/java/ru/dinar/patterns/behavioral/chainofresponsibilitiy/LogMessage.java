package ru.dinar.patterns.behavioral.chainofresponsibilitiy;

/**
 * created: 06-04-2022 - 16:17
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class LogMessage {

    private Level logLevel;

    private String plainMessage;

    public LogMessage(Level logLevel, String plainMessage) {
        this.logLevel = logLevel;
        this.plainMessage = plainMessage;
    }

    public enum Level {
        INFO, WARNING, ERROR, DEBUG
    }

    public Level getLogLevel() {
        return logLevel;
    }

    public String getPlainMessage() {
        return plainMessage;
    }
}
