package org.example.queues.using_arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class MyLinearQueue<E> {

    private int size;
    private E[] qData;
    private int front = -1;
    private int rear = -1;

    public MyLinearQueue(int size) {
        qData = (E[]) new Object[size];
        this.size = size;
    }

    public boolean isQueueEmpty() {

        if (front == -1) {
            return true;
        }

        return false;
    }

    public boolean isQueueFull() {

        if (rear == size - 1) {
            return true;
        }

        return false;
    }

    public boolean EnQ(E data) {

        if (isQueueFull()) {
            LOGGER.error("Queue Overflow!!!");
            return false;
        }

        //Insert data, into next free location
        rear++;
        qData[rear] = data;

        if (front == -1) {
            front = 0;
        }

        return true;
    }

    public E DeQ() {

        if (isQueueEmpty()) {
            LOGGER.error("Queue Underflow!!!");
            return null;
        }

        E data = qData[front];
        qData[front] = null;

        if (front == rear) {
            front = -1;
            rear = -1;
            return data;
        }

        front++;

        return data;

    }

    public E getFront() {
        return qData[front];
    }

    @Override
    public String toString() {
        return Arrays.toString(qData);
    }

}
