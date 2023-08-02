package org.example.datastructures.stacks.using_arrays;

import java.util.*;

public class MyStack {

    //Stack storage
    private Object[] array;

    int top = - 1;

    public MyStack(int size) {
        array = new Object[size];
    }

    /**Push an Element into the Stack*/
    public void push(Object valueToPush) {

        if (isStackFull()) {
            System.out.println("Stack Overflow!!!");
        } else {
            top++;
            array[top] = valueToPush;
            System.out.println(valueToPush + " Pushed to Stack!");
        }
    }

    /** Remove and obtain the element from Stack */
    public Object pop() {

        if (top == -1) {
            System.out.println("Underflow");
            throw new EmptyStackException();
        }

        return array[top--] = null;
    }

    void printStack() {

        if (top == -1) {
            System.out.println("Empty Stack");
        } else {
            for (Object object : array) {
                System.out.print(object + " | ");
            }
            System.out.println(" ");
        }
    }

    /**Gets Recently Inserted Element*/
    Object peek() {

        if (top == -1) {
            System.out.println("Empty Stack!");
            return null;
        } else {
            return array[top];
        }

    }

    boolean isStackEmpty() {
        return (top == -1);
    }

    boolean isStackFull() {
       return (top == array.length - 1);
    }

    void makeStackEmpty() {
        top = -1;
        //Arrays.fill(array, null);
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

}
