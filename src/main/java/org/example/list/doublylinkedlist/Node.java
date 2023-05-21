package org.example.list.doublylinkedlist;

public class Node<E> {

    private Node prev;
    private E data;
    private Node next;

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

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
        //(default) no args constructor
    }

    public Node(Node prev, E data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "prev=" + prev +
                ", data=" + data +
                ", next=" + next +
                '}';
    }

    /* @Override
    public String toString() {
        return "[Prev: " + getPrev() + " Data: " + getData() + " Next: " + getNext() + "] ";
    }*/

}
