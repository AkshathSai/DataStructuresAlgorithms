package org.example.algorithms.sorting;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;


@Slf4j
public class Main {

    public static void main(String[] args) {

        Integer[] original = new Integer[]{4, 2, 6, 5, 1, 3};

        Integer[] array = Arrays.copyOf(original, 6);
        log.info("[Bubble Sort] Before sort " + Arrays.toString(array));

        Sort.bubbleSort(array);
        log.info("[Bubble Sort] After sort " + Arrays.toString(array));

        //Best Case scenario test (use debugger!)
        Sort.bubbleSort(array);

        Integer[] array2 = Arrays.copyOf(original, 6);
        log.info("[Selection Sort] Before Sort " + Arrays.toString(array2));

        Sort.selectionSort(array2);
        log.info("[Selection Sort] After Sort " + Arrays.toString(array2));

        Integer[] array3 = Arrays.copyOf(original, 6);
        log.info("[Insertion Sort] Before Sort " + Arrays.toString(array3));

        Sort.insertionSort(array3);
        log.info("[Insertion Sort] After Sort " + Arrays.toString(array3));

        int [] test = new int[]{4, 2, 6, 5, 1, 3};
        Sort.bubbleSort(test);
        System.out.println("Bubble Sort v2 [After sort]: ");
        Arrays.stream(test).forEach(System.out::print);

        int [] test2 = new int[]{1, 2, 3, 4, 5, 6};
        Sort.bubbleSort(test2);
        System.out.println("Bubble Sort v2 [After sort]: ");
        Arrays.stream(test2).forEach(System.out::print);
    }

}
