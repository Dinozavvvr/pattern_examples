package ru.dinar.patterns.behavioral.iterator;

import java.util.Iterator;

/**
 * created: 07-04-2022 - 12:56
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.add("four");
        linkedList.add("five");

        Iterator<String> iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
