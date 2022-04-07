package ru.dinar.patterns.behavioral.visitor;

/**
 * created: 07-04-2022 - 20:56
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Building implements Place {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBuilding(this);
    }

}
