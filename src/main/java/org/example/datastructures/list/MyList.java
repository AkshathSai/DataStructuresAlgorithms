package org.example.datastructures.list;

public class MyList<E> {

    private Node<E> headNode;
    private int size;

    public boolean insert(E data) {

        /**
         * Create new node
         */
        Node<E> newNode = new Node<>(data, null);

        /**
         * Validate if a new node has been created
         */
        if(newNode == null) {
            return false;
        }

        /**
         * If the LinkedList is empty
         * insert new Node as head node
         * */
        if (headNode == null) {
            headNode = newNode;
        } else {

            Node<E> currentNode = headNode;

            /**
             * Traversing to the end of the current nodes' next
             */
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }

            currentNode.setNext(newNode);

        }

        return true;

    }

    public void display(MyList<E> list) {

        Node<E> currentNode = list.headNode;

        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }

    }

    public MyList() {
        //(default) no argument constructor
    }

}
