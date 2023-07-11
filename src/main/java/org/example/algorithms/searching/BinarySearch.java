package org.example.algorithms.searching;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 5, 9, 12, 17};

        LOGGER.info("Result: " + binarySearch(numbers, 4));

    }

    private static Object binarySearch(int[] array, int target) {

        int first = array[0];
        int last = array[array.length-1];

        while (first <= last) {

            int midTerm = first + last/2;

            if (array[midTerm] == target) {
                return midTerm;
            } else if(array[midTerm] < target) {
                first = midTerm + 1; //Search in the right half
            } else {
                last = midTerm - 1; //Search in the left half
            }
            
        }
        return null;
    }

}
