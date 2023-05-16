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

    public Node(E data) {
        this.data = data;
    }

    public Node(E data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "[Data value: " + data + ", Next value: " + next + "]\n";
    }

}
