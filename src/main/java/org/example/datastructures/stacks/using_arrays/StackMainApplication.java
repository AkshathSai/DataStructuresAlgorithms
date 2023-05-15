package org.example.datastructures.stacks.using_arrays;

import java.util.Scanner;

public class StackMainApplication {

    public static void main(String[] args) {

        System.out.println("Welcome to My Stack! Using Arrays as Storage");
        printMenu();
        MyStack stack = null;
        Scanner sc = new Scanner(System.in);

        int i = 1;

        while (i == 1) {

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the size of the stack to be created");
                    int size = sc.nextInt();
                    stack = new MyStack(size);
                    System.out.println("Stack of size " + size + " created successfully");
                    printMenu();
                    break;
                case 2:
                    System.out.println("Enter the Element to be pushed into the Stack");
                    Object obj = sc.next();
                    stack.push(obj);
                    printMenu();
                    break;
                case 3:
                    System.out.println("Stack is being Popped! " + stack.pop());
                    printMenu();
                    break;
                case 4:
                    System.out.println(stack.peek());
                    printMenu();
                    break;
                case 5:
                    stack.printStack();
                    printMenu();
                    break;
                case 6:
                    System.out.println(stack.isStackEmpty());
                    break;
                case 7:
                    System.out.println(stack.isStackFull());
                    break;
                case 8:
                    stack.makeStackEmpty();
                    printMenu();
                    break;
                case 9:
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
        System.out.println("1. Create a New Stack\n2. Push\n3. Pop\n4. Peek\n5. PrintStack\n6. isStackEmpty\n7. isStackFull\n8. makeStackEmpty\n9. Exit");
    }

}
