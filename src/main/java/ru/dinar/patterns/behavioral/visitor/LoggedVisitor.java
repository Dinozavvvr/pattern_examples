package ru.dinar.patterns.behavioral.visitor;

/**
 * created: 07-04-2022 - 20:55
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class LoggedVisitor implements Visitor {

    @Override
    public void visitPark(Park park) {
        System.out.println("Вы посетили парк");
    }

    @Override
    public void visitBuilding(Building building) {
        System.out.println("Вы посетили здание");
    }

    @Override
    public void visitCinema(Cinema cinema) {
        System.out.println("Вы посетили кинотеатр");
    }
}
