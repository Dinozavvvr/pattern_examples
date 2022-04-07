package ru.dinar.patterns.structural.decorator;

/**
 * created: 06-04-2022 - 16:49
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public abstract class SenderDecorator implements Sender {

    private final Sender sender;

    public SenderDecorator(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void send(String message) {
        sender.send(message);
    }
}
