package ru.dinar.patterns.behavioral.iterator;

import java.util.Iterator;

/**
 * created: 07-04-2022 - 12:57
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class LinkedList<T> implements Iterable<T> {

    private Item<T> root;

    private Item<T> left;

    private long size;

    private static class Item<T> {

        private Item<T> previous;

        private Item<T> next;

        private T value;

        public Item(T value) {
            this.value = value;
        }

        public Item<T> getPrevious() {
            return previous;
        }

        public void setPrevious(Item<T> previous) {
            this.previous = previous;
        }

        public Item<T> getNext() {
            return next;
        }

        public void setNext(Item<T> next) {
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    public void add(T element) {
        Item<T> newElement = new Item<>(element);
        if (root == null) {
            root = newElement;
            left = root;
        } else {
            left.setNext(newElement);
            newElement.setPrevious(left);
            left = newElement;
        }
        size++;
    }

    private static class LinkedListIterator<E> implements Iterator<E> {

        private Item<E> current;

        public LinkedListIterator(LinkedList<E> linkedList) {
            this.current = linkedList.root;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E value = current.getValue();
            current = current.getNext();
            return value;
        }

    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<>(this);
    }

}
