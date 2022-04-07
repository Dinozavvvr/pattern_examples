package ru.dinar.patterns.behavioral.visitor;

import java.util.List;

/**
 * created: 07-04-2022 - 20:58
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        Place park1 = new Park();
        Place park2 = new Park();
        Place park3 = new Park();
        Place cinema = new Cinema();
        Place building1 = new Building();
        Place building2 = new Building();

        List<Place> places = List.of(
                park1,
                park2,
                park3,
                cinema,
                building1,
                building2
        );

        Visitor loggedVisitor = new LoggedVisitor();

        places.forEach(place -> place.accept(loggedVisitor));
    }

}
