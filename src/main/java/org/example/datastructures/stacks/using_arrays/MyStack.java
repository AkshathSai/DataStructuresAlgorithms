package org.example.datastructures.stacks.using_arrays;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;

public class MyStack {

    //Stack storage
    private List<Object> array = new ArrayList<>();

    int top = array.size() - 1;

    public MyStack() {
    }

    /**Push an Element into the Stack*/
    public void push(Object valueToPush) {
        top = top + 1;
        array.add(valueToPush);
    }

    /** Remove and obtain the element from Stack */
    public Object pop() {

        if (top == -1) {
            throw new EmptyStackException();
        }

        return array.remove(top--);
    }

    void printStack() {

        if (top == -1) {
            System.out.println("Empty Stack");
        } else {
            for (Object object : array) {
                System.out.println(object);
            }
        }
    }

    /**Gets Recently Inserted Element*/
    Object peek() {

        if (top == -1) {
            System.out.println("Empty Stack!");
            throw new EmptyStackException();
        } else {
            return array.get(top);
        }
    }

    boolean isStackEmpty() {

        if (top == -1) {
            return true;
        }

        return false;
    }

    boolean isStackFull() {

        if (top == array.size() -1) {
            return true;
        }

        return false;
    }

    void makeStackEmpty() {
        array.clear();
        top = -1;
    }


    public static void main(String[] args) {

        MyStack stack = new MyStack();

        System.out.println("Welcome to My Stack! Using Arrays as Storage");
        printMenu();
        Scanner sc = new Scanner(System.in);

        int i =1;

        while (i == 1) {

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Element to be pushed into the Stack");
                    Object obj = sc.next();
                    stack.push(obj);
                    System.out.println(obj + " Pushed to Stack!");
                    printMenu();
                    break;
                case 2:
                    System.out.println("Stack is being Popped! " + stack.pop());
                    printMenu();
                    break;
                case 3:
                    System.out.println(stack.peek());
                    printMenu();
                    break;
                case 4:
                    stack.printStack();
                    printMenu();
                    break;
                case 5:
                    System.out.println(stack.isStackEmpty());
                    break;
                case 6:
                    System.out.println(stack.isStackFull());
                    break;
                case 7:
                    stack.makeStackEmpty();
                    break;
                case 8:
                    i=2;
                    break;
                default:
                    System.out.println("Invalid Choice!\nPlease check the Menu Options & try again...");
                    printMenu();
                    break;
            }

        }


    }

    static void printMenu() {
        System.out.println("Menu");
        System.out.println("1. Push\n2. Pop\n3. Peek\n4. PrintStack\n5. isStackEmpty\n6. isStackFull\n7. makeStackEmpty\n8. Exit");
    }

}
