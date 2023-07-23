package org.example.lists.doublylinkedlist;

public class MyDoublyLinkedListApp {

    public static void main(String[] args) {

        MyDoublyLinkedList<Object> myDoublyLinkedList = new MyDoublyLinkedList<>();
        myDoublyLinkedList.InsertFront(10);
        myDoublyLinkedList.InsertFront(15);
        myDoublyLinkedList.InsertFront(30);
        myDoublyLinkedList.displayLinkStructure();
    }

}
