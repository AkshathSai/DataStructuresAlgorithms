package org.example.datastructures.stacks.using_lists;

import lombok.extern.slf4j.Slf4j;
import org.example.datastructures.lists.singlylinkedlist.MySinglyLinkedList;
import org.example.datastructures.lists.singlylinkedlist.Node;

@Slf4j
public class Stack<E> {

    private MySinglyLinkedList<E> linkedArrayList = new MySinglyLinkedList<>();

    public void push(E value) {
        linkedArrayList.insertFront(value);
    }

    public E pop() {
        return linkedArrayList.deleteFront();
    }

    public E peek() {
        return linkedArrayList.headNode.getData();
    }

    public void getElementCount() {
        LOGGER.debug("Number of nodes " + linkedArrayList.getCount());
    }

    public void makeStackEmpty() {
        this.linkedArrayList = null;
        linkedArrayList = new MySinglyLinkedList<>();
    }

    public boolean isStackEmpty() {

        if (linkedArrayList.getCount() > 0) {
            return false;
        }

        return true;
    }

}
