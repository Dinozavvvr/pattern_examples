package ru.dinar.patterns.behavioral.chainofresponsibilitiy;

/**
 * created: 06-04-2022 - 16:20
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Logger {

    private final LoggerChain next = new InfoLogger();

    public void log(LogMessage logMessage) {
        next.printLog(logMessage);
    }

}
