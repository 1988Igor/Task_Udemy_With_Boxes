package HWLinked;

import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E> {
    private Node<E> head;
    private int size;


    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<E> {
        private Node<E> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E element = current.element;
            current = current.next;
            return element;
        }
    }

}
