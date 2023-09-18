package org.example.algorithms.searching;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class BinarySearch {

    public static void main(String[] args) {

        int[] array = new int[]{3, 4, 1, 7, 5, 11};
        Arrays.sort(array);
        //LOGGER.info("{}", search(Arrays.sort(array), 7));
        LOGGER.info("{}", search(array, 0,array.length - 1, 8));
    }

    public static int search(int[] array, int startIndex, int endIndex, int target) {

        int midIndex = startIndex + (endIndex - startIndex)/2;

        if (endIndex >= startIndex) {
            if (array[midIndex] == target) {
                return array[midIndex];
            } else if (array[midIndex] > target) {
                //Search left sub array
                return search(array, 0, midIndex - 1,target);
            } else if (array[midIndex] < target) {
                //Search right sub array
                return search(array, midIndex + 1, endIndex, target);
            }
        }

        return -1; // Not found
    }

    /*public static int search(int[] array, int target) {

        int i=0;

        while (i < array.length) {

            int middle = i + (array.length - i)/2;
            if (array[middle] == target) {
                return array[middle];
            } else if (array[middle] < target) {
                return search();
            } else if (array[middle] > target) {
                return search();
            }

            i++;
        }

        return -1; // Not found
    }*/
}
