package org.example.datastructures.lists.singlylinkedlist;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MySinglyLinkedList<E> {

    private Node<E> headNode;
    private int count = 0;


    public boolean insertFront(E data) {

        /**
         * Create new node
         */
        Node<E> newNode = new Node<>();

        /**
         * Validate if a new node has been created
         */
        if (newNode == null) {
            return false;
        }

        /**
         * Fill the data field of new node
         */
        newNode.setData(data);

        /**
         * Link the new node with first node/head node
         */
        newNode.setNext(headNode);
        headNode = newNode;

        count++;

        System.out.println("Current LinkedList: \n" + headNode);

        return true;

    }

    public boolean insertEnd(E data) {

        /**
         * Create new node
         */
        Node<E> newNode = new Node<>();

        /**
         * Validate if a new node has been created
         */
        if(newNode == null) {
            return false;
        }

        /**
         * Fill the data field of new node
         */
        newNode.setData(data);

        /**
         * If the LinkedList is empty
         * insert new Node as head node/First node
         * */
        if (headNode == null) {
            newNode.setNext(null);
            headNode = newNode;
            count++;
            return true;
        }

        /**
         * Search for the Last node, T
         */
        Node<E> tempNode = headNode;

        /**
         * Traversing to the end of the current nodes' next
         */
        while (tempNode.getNext() != null) {
            tempNode = tempNode.getNext();
        }

        /**
         * Link the new node with Last node, T
         */
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);

        count++;

        System.out.println("Current LinkedList \n" + headNode);

        return true;

    }

    public boolean insertAt(int index,E data) {

        /*if (index < size) {
            System.out.println("Index out of bounds");
            return false;
        }*/

        Node<E> currentNode = headNode;
        Node<E> newNode = new Node<>();

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }

        newNode.setData(data);
        newNode.setNext(currentNode);

        currentNode.setNext(newNode);

        count++;

        return true;
    }

    public E delete(E data) {

        if (headNode == null) {
            System.out.println("List is empty!");
            return null;
        }

        Node<E> currentNode = headNode;
        Node<E> previousNode = null;

        int index = search(data);

        if (index != -1) {

          for (int i = 0; i < index; i++) {
              previousNode = currentNode;
              currentNode = currentNode.getNext();
          }

          previousNode.setNext(currentNode.getNext());

          count--;
        }

        return null;

    }

    public E deleteFront() {

        /**
         * To check if the list is empty
         */
        if (headNode == null) {
            System.out.println("List is empty!");
            return null;
        }

        /**
         * Storing current head node in temp node
         */
        Node<E> tempNode = headNode;

        /**
         * Deleting head node
         */
        headNode = null;

        /**
         * While the temp head node has next node
         * make it the new head node
         */
        if (tempNode.getNext() != null) {
            headNode = tempNode.getNext();
        }

        count--;

        System.out.println("Current LinkedList: \n" + headNode);

        return tempNode.getData();
    }

    public E deleteEnd() {

        /**
         * To check if the list is empty
         */
        if (headNode == null) {
            System.out.println("List is empty!");
            return null;
        }

        /**
         * Search for the last node, T and it's parent node P
         */
        Node<E> parentNode = null;
        Node<E> tempNode = headNode;

        while (tempNode.getNext() != null) {
            parentNode = tempNode;
            //System.out.println("Parent Node \n" + parentNode);
            tempNode = tempNode.getNext();
            //System.out.println("Temp Node \n" + tempNode);
        }

        /**
         * If the last node, T is the first node/head node, update the first node/head node
         * Otherwise, update the parent node's next
         */
        if(parentNode == null) {
            headNode = tempNode.getNext();
        } else {
            parentNode.setNext(tempNode.getNext());
        }

        /**
         * Storing the last node's data
         */
        E deletedElement = tempNode.getData();

        /**
         * Delete the memory
         */
        tempNode = null;

        count--;

        System.out.println("Current LinkedList: \n" + headNode);

        return deletedElement;
    }

    public void display(MySinglyLinkedList<E> list) {

        Node<E> currentNode = list.headNode;

        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }

        System.out.println(" ");

    }

    public void displayLinkStructure() {
        System.out.println("Current LinkedList \n" + headNode);
    }

    public int search(E element) {

        Node<E> currentNode = headNode;

        int index = 0;

        while (currentNode != null) {
            if (currentNode.getData().equals(element)) {
                return index;
            }
            currentNode = currentNode.getNext();
            index++;
        }

        return -1;
    }

    public E elementAt(int index) {

        if (index < 0) {
            LOGGER.error("Index can't be negative!!");
            return null;
        }

        Node<E> currentNode = headNode;
        int count = 0;

        while (currentNode != null) {

            if (count == index) {
                return currentNode.getData();
            }

            count++;
            currentNode = currentNode.getNext();
        }

        return null;
    }

    public MySinglyLinkedList() {
        //(default) no argument constructor
    }

    public int getCount() {
        return count;
    }

}
