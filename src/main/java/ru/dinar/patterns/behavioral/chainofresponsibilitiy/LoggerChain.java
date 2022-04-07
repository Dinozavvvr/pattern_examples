package ru.dinar.patterns.behavioral.chainofresponsibilitiy;

/**
 * created: 06-04-2022 - 16:17
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public interface LoggerChain {

    void printLog(LogMessage logMessage);

    void setNext(LoggerChain loggerChain);

}
