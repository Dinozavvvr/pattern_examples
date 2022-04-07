package ru.dinar.patterns.behavioral.chainofresponsibilitiy;

/**
 * created: 06-04-2022 - 16:32
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class InfoLogger implements LoggerChain {

    private LoggerChain next = new WarningLogger();

    @Override
    public void printLog(LogMessage logMessage) {
        if (logMessage.getLogLevel().equals(LogMessage.Level.INFO)) {
            System.out.println(logMessage.getPlainMessage());
        } else {
            next.printLog(logMessage);
        }
    }

    @Override
    public void setNext(LoggerChain loggerChain) {
        this.next = loggerChain;
    }

}
