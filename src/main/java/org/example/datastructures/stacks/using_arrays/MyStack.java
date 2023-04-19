package org.example.datastructures.stacks.using_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack<T> {

    //Stack storage
    private List<T> array;

    int top = - 1;

    public MyStack(int size) {
        //array = new ArrayList<>(size);
        array = new ArrayList<>(Collections.nCopies(size, null));
    }

    /**Push an Element into the Stack*/
    public void push(T valueToPush) {

        if (isStackFull()) {
            System.out.println("Stack Overflow!!!");
        } else {
            top++;
            array.set(top, valueToPush);
            System.out.println(valueToPush + " Pushed to Stack!");
        }
    }

    /** Remove and obtain the element from Stack */
    public T pop() {

        if (top == -1) {
            System.out.println("Underflow");
            throw new EmptyStackException();
        }

        return array.remove(top--);
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
    T peek() {

        if (top == -1) {
            System.out.println("Empty Stack!");
            return null;
        } else {
            return array.get(top);
        }

    }

    boolean isStackEmpty() {
        return (top == -1);
    }

    boolean isStackFull() {
       return (top == array.size() - 1);
    }

    void makeStackEmpty() {
        top = -1;
        array.clear();
    }

}
