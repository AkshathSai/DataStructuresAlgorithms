package org.example.algorithms.searching;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Searching {

    public static int linearSearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                LOGGER.info("Found it! At index {}", i);
                return array[i];
            }
        }
        return -1; //Not found
    }

    public static int recursiveBinarySearch(int[] array, int startIndex, int endIndex, int target) {

        int midIndex = startIndex + (endIndex - startIndex) / 2;

        if (endIndex >= startIndex) {
            if (array[midIndex] == target) {
                return array[midIndex];
            } else if (array[midIndex] > target) {
                //Search left sub array
                return recursiveBinarySearch(array, 0, midIndex - 1, target);
            } else if (array[midIndex] < target) {
                //Search right sub array
                return recursiveBinarySearch(array, midIndex + 1, endIndex, target);
            }
        }

        return -1; // Not found
    }

    public static int iterativeBinarySearch(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int midIndex = start + (end - start) / 2;

            if (array[midIndex] == target) {
                return array[midIndex];
            } else if (array[midIndex] > target) {
                // Search left half
                end = midIndex - 1;
            } else if (array[midIndex] < target) {
                // Search right half
                start = midIndex + 1;
            }
        }

        return -1; // Not found
    }

}
