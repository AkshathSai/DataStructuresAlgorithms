package org.example.list.singlylinkedlist;

import java.util.Scanner;

public class MyListApplication {

    public static void main(String[] args) {

        System.out.println("Welcome to My Singly LinkedList! (Using Java Class Nodes)");
        printMenu();
        MySinglyLinkedList list = null;
        Scanner sc = new Scanner(System.in);

        int i = 1;

        Object obj;

        while (i == 1) {

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    list = new MySinglyLinkedList();
                    System.out.println("New LinkedList initialized successfully...");
                    printMenu();
                    break;
                case 2:
                    System.out.println("Enter a new element to be added at the front of the List");
                    obj = sc.next();
                    list.insertFront(obj);
                    printMenu();
                    break;
                case 3:
                    System.out.println("Enter a new element to be added at the end of the List");
                    obj = sc.next();
                    list.insertEnd(obj);
                    printMenu();
                    break;
                case 4:
                    System.out.println("Deleted Front element: " + list.deleteFront());
                    printMenu();
                    break;
                case 5:
                    System.out.println("Deleted End element: " + list.deleteEnd());
                    printMenu();
                    break;
                case 6:
                    System.out.println("Enter a specific element to search for");
                    obj = sc.next();
                    int result = list.search(obj);
                    if (result == -1) {
                        System.out.println("Element not found!");
                    } else {
                        System.out.println(result);
                    }
                    printMenu();
                    break;
                case 7:
                    list.display(list);
                    printMenu();
                    break;
                case 8:
                    list.displayLinkStructure();
                    printMenu();
                    break;
                case 9:
                    i=2;
                    break;
                case 10:
                    obj = sc.next();
                    list.delete(obj);
                    printMenu();
                    break;
                case 11:
                    System.out.println("Enter the Index where to be inserted at");
                    int index = sc.nextInt();
                    System.out.println("Enter the element to be inserted");
                    obj = sc.next();
                    list.insertAt(index ,obj);
                    printMenu();
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
        System.out.println("1. Create an Empty LinkedList\n2. InsertFront\n3. InsertEnd\n4. DeleteFront\n5. DeleteEnd\n6. Search\n7. Display Elements\n8. Display Link Structure\n9. Exit\n10. Delete\n11. InsertAt");
    }

}
