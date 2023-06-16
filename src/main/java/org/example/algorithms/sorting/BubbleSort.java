package org.example.algorithms.sorting;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        bubbleSort(numbers);

    }

    private static void bubbleSort(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length - 1; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        printArray(numbers);

    }

    private static void printArray(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder("Sorted: ");
        for (int i=0; i<numbers.length; i++) {
            stringBuilder.append(numbers[i]);
            if (i < numbers.length-1) {
                stringBuilder.append(", ");
            }
        }
        LOGGER.info(stringBuilder.toString());
    }

}
