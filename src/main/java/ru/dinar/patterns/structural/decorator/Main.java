package ru.dinar.patterns.structural.decorator;

/**
 * created: 06-04-2022 - 16:42
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        String message = "Привет мир";

        Sender mailSender = new MailSender();
        mailSender.send(message);

        Sender asciiSender = new AsciiSender(mailSender);
        asciiSender.send(message);
    }

}
