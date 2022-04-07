package ru.dinar.patterns.structural.decorator;

/**
 * created: 06-04-2022 - 16:47
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class MailSender implements Sender {

    @Override
    public void send(String message) {
        System.out.println(message);
    }

}
