package org.example.datastructures.stacks.using_lists;

import lombok.extern.slf4j.Slf4j;
import org.example.datastructures.lists.singlylinkedlist.MySinglyLinkedList;

@Slf4j
public class MyStack<E> {

    private MySinglyLinkedList<E> linkedArrayList = new MySinglyLinkedList<>();

    public void push(E value) {
        linkedArrayList.insertFront(value);
    }

    public E pop() {
        return linkedArrayList.deleteFront();
    }

    public E peek(E value) {

        int index = linkedArrayList.search(value);

        if (index != -1) {
            return linkedArrayList.elementAt(index);
        }

        LOGGER.error("Element does not exist!!");
        return null;
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
