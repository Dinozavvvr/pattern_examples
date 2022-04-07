package ru.dinar.patterns.behavioral.chainofresponsibilitiy;

/**
 * created: 06-04-2022 - 16:15
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        Logger logger = new Logger();

        LogMessage logMessage = new LogMessage(LogMessage.Level.ERROR,
                "Сбой в системе. Недостаточно оперативной памяти");

        logger.log(logMessage);
    }

}
