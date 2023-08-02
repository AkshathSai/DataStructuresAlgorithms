package org.example.datastructures.lists.doublylinkedlist;

public class MyDoublyLinkedList<E> {

    private Node<E> headNode = null;
    private Node<E> tailNode = null;
    private int size = 0;

    public boolean InsertFront(E data) {

        Node<E> newNode = new Node<>(data);

        if (headNode == null) {
            headNode = newNode;
            tailNode = newNode;
            size++;
            return true;
        }

        newNode.setNext(headNode);
        headNode.setPrev(newNode);
        headNode = newNode;
        size++;

        return true;

    }

    public void displayLinkStructure() {
        System.out.println("Current LinkedList: ");
        Node current = headNode;
        while (current != null) {
            System.out.print(current + " ");
            current = current.getNext();
        }
        System.out.println();

        System.out.println("Head Node: " + headNode);
        System.out.println("Tail Node: " + tailNode);
    }

    public MyDoublyLinkedList() {
        //(default) no args constructor
    }

}
