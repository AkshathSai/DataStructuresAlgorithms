package org.example.algorithms.searching;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinearSearch {

    public static void main(String[] args) {

        int[] array = new int[]{3, 4, 1, 7, 5};
        LOGGER.info("{}", search(array, 7)); // positive
        LOGGER.info("{}", search(array, 10)); // negative
    }

    public static int search(int[] array, int target) {

        for (int i=0; i<array.length; i++) {
            if (array[i] == target) {
                return array[i];
            }
        }
        return -1; //Not found
    }
}
