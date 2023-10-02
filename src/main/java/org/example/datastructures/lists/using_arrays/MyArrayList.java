package org.example.datastructures.lists.using_arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyArrayList<T> {

    private T[] array;
    private long size;

    public MyArrayList() {
        // Workaround to create generic arrays in Java
        array = (T[])new Object[5];
    }

    public void add() {

    }



}
