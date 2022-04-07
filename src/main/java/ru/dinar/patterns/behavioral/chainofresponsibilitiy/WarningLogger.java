package ru.dinar.patterns.behavioral.chainofresponsibilitiy;

/**
 * created: 06-04-2022 - 16:20
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class WarningLogger implements LoggerChain {

    private LoggerChain next = new DebugLogger();

    @Override
    public void printLog(LogMessage logMessage) {
        if (logMessage.getLogLevel().equals(LogMessage.Level.WARNING)) {
            System.out.println("WARNING! " + logMessage.getPlainMessage());
        } else {
            next.printLog(logMessage);
        }
    }

    @Override
    public void setNext(LoggerChain loggerChain) {
        this.next = loggerChain;
    }

}
