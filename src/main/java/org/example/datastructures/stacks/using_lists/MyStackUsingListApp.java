package org.example.datastructures.stacks.using_lists;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyStackUsingListApp {

    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        log.info("Peek " + myStack.peek());
        log.info("Is Stack Empty? " + myStack.isStackEmpty());
        myStack.getElementCount();
        myStack.pop();
        myStack.getElementCount();
        log.info("Peek " + myStack.peek());
        myStack.makeStackEmpty();
        myStack.getElementCount();
        log.info("Is Stack Empty? " + myStack.isStackEmpty());
    }

}
