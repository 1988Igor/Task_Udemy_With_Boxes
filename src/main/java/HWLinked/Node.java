package HWLinked;

import java.util.Iterator;

public class Node<E> {
    E element;
    Node<E> next;

    Node(E element) {
        this.element = element;
        next = null;
    }

}