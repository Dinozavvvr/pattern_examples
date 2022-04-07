package ru.dinar.patterns.behavioral.chainofresponsibilitiy;

/**
 * created: 06-04-2022 - 16:21
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class DebugLogger implements LoggerChain {

    private LoggerChain next = new ErrorLogger();

    @Override
    public void printLog(LogMessage logMessage) {
        if (logMessage.getLogLevel().equals(LogMessage.Level.DEBUG)) {
            System.out.println("DEBUG: " + logMessage.getPlainMessage());
        } else {
            next.printLog(logMessage);
        }
    }

    @Override
    public void setNext(LoggerChain loggerChain) {
        this.next = loggerChain;
    }


}
