package ru.dinar.patterns.structural.decorator;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * created: 06-04-2022 - 16:51
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class AsciiSender extends SenderDecorator {

    public AsciiSender(Sender sender) {
        super(sender);
    }

    @Override
    public void send(String message) {
        String asciiMessage = new String(message.getBytes(StandardCharsets.US_ASCII));
        super.send(asciiMessage);
    }

}
