package org.example.list;

public class MyLinkedList<E> {

    private Node<E> headNode;
    private int size;

    public boolean insertEnd(E data) {

        /**
         * Create new node
         */
        Node<E> newNode = new Node<>(data);

        /**
         * Validate if a new node has been created
         */
        if(newNode == null) {
            return false;
        }

        /**
         * If the LinkedList is empty
         * insert new Node as head node/First node
         * */
        if (headNode == null) {
            newNode.setNext(null);
            headNode = newNode;
            size++;
            return true;
        } else {

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

        }

        size++;

        System.out.println(headNode);

        return true;

    }

    public boolean insertFront(E data) {

        /**
         * Create new node
         */
        Node<E> newNode = new Node<>(data, null);

        /**
         * Validate if a new node has been created
         */
        if (newNode == null) {
            return false;
        }

        size++;

        return true;
    }


    public void display(MyLinkedList<E> list) {

        Node<E> currentNode = list.headNode;

        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }

    }

    public MyLinkedList() {
        //(default) no argument constructor
    }

}
