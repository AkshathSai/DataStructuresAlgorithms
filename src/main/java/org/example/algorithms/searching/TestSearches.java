package org.example.algorithms.searching;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class TestSearches {

    public static void main(String[] args) {

        int[] array = new int[]{3, 4, 1, 7, 5, 11};

        log.info("{}", Searching.linearSearch(array, 7)); // positive
        log.info("{}", Searching.linearSearch(array, 10)); // negative

        Arrays.sort(array); // Binary search works only when the input array is sorted

        log.info("{}", Searching.recursiveBinarySearch(array, 0, array.length - 1, 7));
        log.info("{}", Searching.iterativeBinarySearch(array, 7));
    }
}
