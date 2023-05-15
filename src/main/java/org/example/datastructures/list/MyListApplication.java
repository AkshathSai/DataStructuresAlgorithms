package org.example.datastructures.list;

public class MyListApplication {

    public static void main(String[] args) {

        MyList<Integer> integerList = new MyList<>();

        integerList.insert(15);
        integerList.insert(25);
        integerList.insert(35);
        integerList.insert(45);

        integerList.display(integerList);

    }
}
