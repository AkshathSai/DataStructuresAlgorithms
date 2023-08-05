package org.example.datastructures.stacks.using_lists;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyStackUsingListApp {

    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        LOGGER.info("Peek " + myStack.peek());
        LOGGER.info("Is Stack Empty? " + myStack.isStackEmpty());
        myStack.getElementCount();
        myStack.pop();
        myStack.getElementCount();
        LOGGER.info("Peek " + myStack.peek());
        myStack.makeStackEmpty();
        myStack.getElementCount();
        LOGGER.info("Is Stack Empty? " + myStack.isStackEmpty());
    }

}
