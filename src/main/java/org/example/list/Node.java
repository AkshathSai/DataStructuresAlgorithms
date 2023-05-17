package org.example.list;

public class Node<E> {

    private E data;
    private Node next;

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node() {
        //(default) no argument constructor
    }

    @Override
    public String toString() {
        return "[Data value: " + data + ", Next value: " + next + "] ";
    }

}
