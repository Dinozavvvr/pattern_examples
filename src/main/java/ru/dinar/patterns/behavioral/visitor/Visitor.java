package ru.dinar.patterns.behavioral.visitor;

/**
 * created: 07-04-2022 - 20:53
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public interface Visitor {

    void visitPark(Park park);

    void visitBuilding(Building building);

    void visitCinema(Cinema cinema);

}
