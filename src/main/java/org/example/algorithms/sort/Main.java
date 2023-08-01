package org.example.algorithms.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;


@Slf4j
public class Main {

    public static void main(String[] args) {

        Integer[] array = new Integer[]{4, 2, 6, 5, 1, 3};

        LOGGER.info("Before sort " + Arrays.toString(array));

        Sort.bubbleSort(array);

        LOGGER.info("After sort " + Arrays.toString(array));

    }

}
