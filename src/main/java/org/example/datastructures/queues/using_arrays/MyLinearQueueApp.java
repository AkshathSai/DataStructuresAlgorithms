package org.example.datastructures.queues.using_arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyLinearQueueApp {

    public static void main(String[] args) {

        /**
         * Drawback of Linear Queue:
         *
         * Even though the required space is available in the queue, if the Rear reaches Size-1, it
         * will report “Queue Overflow” error without checking further for free space which is a
         * major drawback in array implementation of queue.
         *
         * Solutions:
         * 1. Use List dataStructure as Storage
         * 2. Design the queue in a circular fashion
         *
         */
        Queue<String> stringQueue = new Queue<>(2);
        LOGGER.info("Linear String Queue EnQ ABC : " + stringQueue.EnQ("ABC"));
        LOGGER.info("Linear String Queue EnQ DEF: " + stringQueue.EnQ("DEF"));
        LOGGER.info("Linear String Queue: " + stringQueue);
        LOGGER.info("Linear String Queue DeQ: " + stringQueue.DeQ());
        LOGGER.info("Linear String Queue Post DeQ: " + stringQueue);
        LOGGER.info("Linear String Queue EnQ XYZ: " + stringQueue.EnQ("XYZ"));
        LOGGER.info("Linear String Queue: " + stringQueue);
    }
}
