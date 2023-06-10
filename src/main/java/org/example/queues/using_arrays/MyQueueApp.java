package org.example.queues.using_arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyQueueApp {

    public static void main(String[] args) {

        MyLinearQueue<Integer> linearQueue = new MyLinearQueue(3);
        linearQueue.isQueueEmpty();
        System.out.println("Element Inserted: " + linearQueue.EnQ(1));
        System.out.println("Queue: " + linearQueue);
        System.out.println("Element Inserted: " + linearQueue.EnQ(2));
        System.out.println("Queue: " + linearQueue);
        System.out.println("Element Inserted: " + linearQueue.EnQ(3));
        System.out.println("Queue: " + linearQueue);
        System.out.println("Element Inserted: " + linearQueue.EnQ(4));

        LOGGER.info("Get Front: " + linearQueue.getFront());

        LOGGER.info("DeQ: " + linearQueue.DeQ());
        LOGGER.info("Queue: " + linearQueue);
        LOGGER.info("DeQ: " + linearQueue.DeQ());
        LOGGER.info("Queue: " + linearQueue);
        LOGGER.info("DeQ: " + linearQueue.DeQ());
        LOGGER.info("Queue: " + linearQueue);
        LOGGER.info("DeQ: " + linearQueue.DeQ());

        MyLinearQueue<String> stringMyLinearQueue = new MyLinearQueue<>(2);
        LOGGER.info("Linear String Queue: " + stringMyLinearQueue.EnQ("ABC"));
        LOGGER.info("Linear String Queue: " + stringMyLinearQueue.EnQ("DEF"));
        LOGGER.info("Linear String Queue: " + stringMyLinearQueue);
    }
}
