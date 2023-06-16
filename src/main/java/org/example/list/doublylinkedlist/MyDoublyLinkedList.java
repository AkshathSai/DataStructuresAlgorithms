package org.example.list.doublylinkedlist;

public class MyDoublyLinkedList<E> {

    private Node<E> headNode;
    private Node<E> tailNode;
    private int size = 0;

    public boolean InsertFront(E data) {

        Node<E> newNode = new Node<>();

        if (newNode == null) {
            System.out.println("Error during Node Initialization");
            return false;
        }

        //newNode.setPrev(null);
        newNode.setData(data);
        //newNode.setNext(null);

        if (headNode == null) {
            headNode = newNode;
            size++;
            return true;
        }

        headNode.setPrev(newNode);
        newNode.setNext(headNode);
        headNode = newNode;
        tailNode = newNode;
        size++;

        System.out.println("Current LinkedList: \n" + headNode);

        //displayLinkStructure();

        return true;

    }

    public void displayLinkStructure() {
        System.out.println(headNode);
    }

    public MyDoublyLinkedList() {
        //(default) no args constructor
    }

}
