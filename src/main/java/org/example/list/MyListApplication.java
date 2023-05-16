package org.example.list;

public class MyListApplication {

    public static void main(String[] args) {

        MyLinkedList<Integer> integerList = new MyLinkedList<>();

        integerList.insertEnd(15);
        integerList.insertEnd(25);
        integerList.insertEnd(35);
        integerList.insertEnd(45);
        integerList.insertFront(5);

        integerList.display(integerList);

        System.out.println("Deleting Front element: " + integerList.deleteFront());

        integerList.display(integerList);

        System.out.println("Deleting Front element: " + integerList.deleteFront());

        integerList.display(integerList);

        System.out.println("Deleting End element: " + integerList.deleteEnd());

        integerList.display(integerList);
    }
}
