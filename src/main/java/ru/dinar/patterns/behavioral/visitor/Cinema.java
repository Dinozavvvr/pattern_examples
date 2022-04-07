package ru.dinar.patterns.behavioral.visitor;

/**
 * created: 07-04-2022 - 20:57
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Cinema implements Place {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCinema(this);
    }

}
