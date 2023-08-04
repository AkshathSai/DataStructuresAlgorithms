package org.example.datastructures.stacks.using_lists;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyStackUsingListApp {

    public static void main(String[] args) {

        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        LOGGER.info("Is Stack Empty? " + myStack.isStackEmpty());
        myStack.getElementCount();
        myStack.pop();
        myStack.getElementCount();
        LOGGER.info("Peek [10] " + myStack.peek(10));
        LOGGER.info("Peek [30] " + myStack.peek(30));
        myStack.makeStackEmpty();
        myStack.getElementCount();
        LOGGER.info("Is Stack Empty? " + myStack.isStackEmpty());
    }

}
